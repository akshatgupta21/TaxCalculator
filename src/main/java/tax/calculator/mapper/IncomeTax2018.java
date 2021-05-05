package tax.calculator.mapper;

import tax.calculator.model.TaxDetails;

public class IncomeTax2018 implements IncomeTax {
	
	private final int INVESTMENT_CAP = 100000;
	private final int CESS_PERCENT = 1;
	private final int CESS_LIMIT = 500000;
	
	@Override
	public TaxDetails calculateTax(int year, int age, double income, int investment) {
		
		TaxDetails taxDetails = new TaxDetails();
		
		double taxableIncome = income;
		double tax = 0, cess= 0;
	
			if (investment > INVESTMENT_CAP) 
				investment = INVESTMENT_CAP;
			
			taxableIncome = taxableIncome - investment;
			
			if (taxableIncome <= 100000) 
				tax = 0;
			else if (taxableIncome <= 500000) 
				tax = 0.1 * (taxableIncome - 100000);
			else if (taxableIncome <= 1000000) 
				tax = 0.2 * (taxableIncome - 500000) + (0.1 * 400000);
			else 
				tax = (0.3 * (taxableIncome - 1000000)) + (0.2 * 500000) + (0.1 * 400000);
			
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