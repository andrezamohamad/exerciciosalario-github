//Exercicios SalarioFuncionario
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Insira o nome do funcionario: ");
		employee.name = sc.nextLine();
		
		System.out.print("Insira o salário bruto do funcionario: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Insira o desconto: ");
		employee.tax = sc.nextDouble();
		
		System.out.println ("Salario Liquido: " + employee);
		
		/*
		System.out.println("Nome: " + employee.name);
		System.out.println("Salario Bruto: " + employee.grossSalary);
		System.out.println("Salario Liquido: " + employee.netSalary); */
		
		System.out.println();
		System.out.println ("Insira a porcentagem para aumento: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println ("Salario final: " + employee);
		
		sc.close();
		
	}

}
