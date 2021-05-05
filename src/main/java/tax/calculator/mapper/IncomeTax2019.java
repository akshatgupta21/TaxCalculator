package tax.calculator.mapper;

import tax.calculator.model.TaxDetails;

public class IncomeTax2019 implements IncomeTax {
	
	private final int INVESTMENT_CAP = 150000;
	private final int CESS_PERCENT = 2;
	private final int CESS_LIMIT = 500000;
	private final int SENIOR_CITIZEN_CONSESSION = 50000;
	
	@Override
	public TaxDetails calculateTax(int year, int age, double income, int investment) {
		
		TaxDetails taxDetails = new TaxDetails();
		
		double taxableIncome = income;
		double tax, cess= 0;

		if (investment > INVESTMENT_CAP) 
			investment = INVESTMENT_CAP;
		
		taxableIncome = taxableIncome - investment;
		
		taxableIncome = age>60 ? taxableIncome-SENIOR_CITIZEN_CONSESSION : taxableIncome;
		
		if (taxableIncome <= 100000) 
			tax = 0;
		else if (taxableIncome <= 600000) 
			tax = 0.1 * (taxableIncome - 100000);
		else if (taxableIncome <= 1200000) 
			tax = (0.2 * (taxableIncome - 600000) + (0.1 * 500000));
		else
			tax = (0.3 * (taxableIncome - 1200000)) + (0.2 * 600000) + (0.1 * 500000);
		
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
