package tax.calculator.mapper;

import tax.calculator.model.TaxDetails;

public class IncomeTax2020 implements IncomeTax {

	private final int INVESTMENT_CAP = 200000;
	private final int CESS_PERCENT = 5;
	private final int CESS_LIMIT = 500000;
	private final int SENIOR_CITIZEN_CONSESSION = 75000;

	@Override
	public TaxDetails calculateTax(int year, int age, double income, int investment) {

		TaxDetails taxDetails = new TaxDetails();

		double taxableIncome = income;
		double tax, cess = 0;

		if (investment > INVESTMENT_CAP)
			investment = INVESTMENT_CAP;

		taxableIncome = taxableIncome - investment;

		taxableIncome = age > 60 ? taxableIncome - SENIOR_CITIZEN_CONSESSION : taxableIncome;
		
		if (taxableIncome < 100000) {
			tax = 0;
		} else if (taxableIncome < 1000000) {
			tax = 0.15 * (taxableIncome - 100000);
		} else {
			tax = (0.25 * (taxableIncome - 1000000)) + (0.15 * 900000);
		}


		if (tax > CESS_LIMIT) 
		{
			cess = (tax * CESS_PERCENT) / 100;
		}
		
		taxDetails.setTax(tax);
		taxDetails.setCess(cess);
		taxDetails.setTotal(tax + cess);
		
		return taxDetails;
	}

}