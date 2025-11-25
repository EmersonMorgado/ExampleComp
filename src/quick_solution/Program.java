package quick_solution;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salario bruto: ");
		double grossSalary = sc.nextDouble();
		double netSalary = grossSalary * 0.7;
		System.out.printf("Salario liquido = %.2f%n", netSalary);
		sc.close();
	}
}
