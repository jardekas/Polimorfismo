package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empresa;
import entities.Person;
import entities.PersonF;

public class ProgramTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double sum = 0;
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			
			if (ch == 'i' || ch == 'I') {
				
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PersonF(nome, rendaAnual, gastoSaude));
				
			}
			else {
				System.out.print("Number of employees: ");
				int nFuncionario = sc.nextInt();
				list.add(new Empresa(nome, rendaAnual, nFuncionario));
			}
			
			
		}
		
		System.out.println("TAXES PAID:");
		
		for(Person person : list ) {
			sum += person.Tax();
			System.out.println(person.taxTag());
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
		
		
		sc.close();
	}

}
