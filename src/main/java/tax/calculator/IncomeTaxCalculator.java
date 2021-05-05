package tax.calculator;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import tax.calculator.model.TaxDetails;
import tax.calculator.service.TaxCalculatorService;

public class IncomeTaxCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String filePath= sc.nextLine();
		sc.close();
		
		TaxCalculatorService taxCalculatorService = new TaxCalculatorService();
		
		try {
			List<TaxDetails> taxDetailsDetails = taxCalculatorService.getTax(filePath);
			taxDetailsDetails.forEach(taxDetails -> {
				System.out.println(taxDetails.getTax() + "," + taxDetails.getCess() + ","  + taxDetails.getTotal());
			});
		} catch (IOException e) {
			System.out.println("Exception thrown while calculating tax - "+ e);
		}
		
	}

}