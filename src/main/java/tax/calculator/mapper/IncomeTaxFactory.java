package tax.calculator.mapper;

public class IncomeTaxFactory {

	public IncomeTax getIncomeTax(int year) {

		if (year == 2018) 
			return new IncomeTax2018();

		if (year == 2019) 
			return new IncomeTax2019();

		if (year == 2020) 
			return new IncomeTax2020();
		
		return null;
		
	}
} 
