package solution_component.service;

public class BrazilTaxService extends TaxService {
	
	public double tax(double amount) {
		return amount * 0.3;
	}
}
