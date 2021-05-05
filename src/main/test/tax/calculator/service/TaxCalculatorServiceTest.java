package tax.calculator.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TaxCalculatorServiceTest {

	@Test
	public void getTax() {
		TaxCalculatorServiceTest taxCalculatorServiceTest = new TaxCalculatorServiceTest();
		FileUtil fileUtil = Mockito.mock(FileUtil.class);
		FileUtil fileUtil = Mockito.mock(incomeTaxFactory.class);
		taxCalculatorServiceTest.getTax(Mockito.anyString());
	}

}
