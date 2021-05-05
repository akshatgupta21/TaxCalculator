package tax.calculator.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import tax.calculator.mapper.IncomeTax;
import tax.calculator.mapper.IncomeTaxFactory;
import tax.calculator.model.TaxDetails;
import tax.calculator.model.UserDetails;
import tax.calculator.util.FileUtil;

public class TaxCalculatorService {

	public List<TaxDetails> getTax(String path) throws FileNotFoundException, IOException {
		
		List<TaxDetails> TaxDetailsList = new ArrayList<>(); 
		FileUtil fileUtil = new FileUtil();
		IncomeTaxFactory incomeTaxFactory = new IncomeTaxFactory();

		List<UserDetails> userDetailsList = fileUtil.getDataFromFile(path);

		userDetailsList.forEach(userDetails -> {
			IncomeTax incomeTax = incomeTaxFactory.getIncomeTax(userDetails.getYear());
			incomeTax.calculateTax(userDetails.getYear(), userDetails.getAge(), userDetails.getIncome(),
					userDetails.getInvestment());

			TaxDetails taxDetails = incomeTax.calculateTax(userDetails.getYear(), userDetails.getAge(),
					userDetails.getIncome(), userDetails.getInvestment());
			
			TaxDetailsList.add(taxDetails);
		});
		
		return TaxDetailsList;
	}

}
