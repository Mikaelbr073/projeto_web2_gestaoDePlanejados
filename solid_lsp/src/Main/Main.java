package Main;

import java.util.ArrayList;
import java.util.List;

import entity.Conta;
import entity.ContaComum;
import entity.ContaEstudante;

/**
 * @author Mikaelbr073
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Conta> contas = new ArrayList<>();
		ContaComum contac = new ContaComum(10);
		ContaEstudante contae = new ContaEstudante(55);
		System.out.println("Conta Comum");
		System.out.println(contac.getSaldo());
		System.out.println("Conta Estudante");
		System.out.println(contae.getSaldo());

		contas.add(contae);
		contas.add(contac);

		for (Conta conta : contas) {
			if (conta instanceof ContaComum) {
				((ContaComum) conta).rende();
				System.out.println("Conata Comum");
				System.out.println(conta.getSaldo());
				
			} else {
				System.out.println("Conta de Estudante");
				System.out.println(conta.getSaldo());
			}
		}

	}

}
