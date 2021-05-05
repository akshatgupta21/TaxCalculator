package tax.calculator.mapper;

import tax.calculator.model.TaxDetails;

public interface IncomeTax {
	
	public TaxDetails calculateTax(int year, int age, double income, int investment);

}
