package tax.calculator.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tax.calculator.model.UserDetails;

public class FileUtil {

	public List<UserDetails> getDataFromFile(String path) throws FileNotFoundException, IOException {
		List<UserDetails> userDetailsList = new ArrayList<>();
		File file = new File(path);
		String line = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((line= br.readLine()) != null) {
				UserDetails userDetails = new UserDetails();
				List<String> list = Arrays.asList(line.split(","));
				userDetails.setYear(Integer.parseInt(list.get(0)));
				userDetails.setAge(Integer.parseInt(list.get(1)));
				userDetails.setIncome(Double.parseDouble(list.get(2)));
				userDetails.setInvestment(Integer.parseInt(list.get(3)));
				userDetailsList.add(userDetails);
			}
		}
		return userDetailsList;
	}

}