package solution_component;

import java.util.Scanner;

import solution_component.entities.Employee;
import solution_component.service.BrazilTaxService;
import solution_component.service.PensionService;
import solution_component.service.SalaryService;
import solution_component.service.TaxService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salario bruto: ");
		double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		
		TaxService taxService = new BrazilTaxService();
		PensionService pensionService = new PensionService();
		
		SalaryService salaryService = new SalaryService(taxService, pensionService);
		double netSalary = salaryService.netSalary(employee);

		System.out.printf("Salario liquido = %.2f%n", netSalary);
		sc.close();
		
	}
}
