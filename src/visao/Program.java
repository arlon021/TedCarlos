package visao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Departamento;
import entities.Empresa;
import entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Empresa> listEmp = new ArrayList<>();

		System.out.print("Digite o nome da empresa: ");
		String nome = sc.nextLine();
		System.out.print("Digite o id: ");
		String id = sc.nextLine();
		System.out.print("Digite a cidade da empresa: ");
		String cidade = sc.nextLine();
		System.out.print("Digite o bairro da empresa: ");
		String bairro = sc.nextLine();
		System.out.print("Digite a rua da empresa: ");
		String rua = sc.nextLine();
		System.out.print("Digite o número da empresa: ");
		int numero = sc.nextInt();
		System.out.println();
		listEmp.add(new Empresa(nome, id, cidade, bairro, rua, numero));
		System.out.println();

		List<Funcionario> listFunc = new ArrayList<>();
		sc.nextLine();
		System.out.print("Digite o id de funcionario: ");
		String idFunc = sc.nextLine();
		System.out.print("Digite o nome Do funcionario: ");
		String nomeFunc = sc.nextLine();
		System.out.print("Digite o salario: ");
		double salario = sc.nextDouble();
		System.out.print("Digite a cidade do funcionario: ");
		sc.nextLine();
		cidade = sc.nextLine();
		System.out.print("Digite o bairro do funcionario: ");
		bairro = sc.nextLine();
		System.out.print("Digite a rua do funcionario: ");
		rua = sc.nextLine();
		System.out.print("Digite o número do funcionario: ");
		numero = sc.nextInt();
		listFunc.add(new Funcionario(idFunc, nomeFunc, salario, cidade, bairro, rua, numero));
		System.out.println();

		List<Departamento> listDepart = new ArrayList<>();
		System.out.println();
		sc.nextLine();
		System.out.print("digite o nome do departamento: ");
		String nomeDepart = sc.nextLine();
		System.out.print("Digite o codigo do departamento: ");
		String codigo = sc.nextLine();

		System.out.print("Digite o id Da empresa: ");
		String empId = sc.nextLine();
		String departId = "";
		for (int i = 0; i < listEmp.size(); i++) {
			if (listEmp.get(i).getId().equals(empId)) {
				departId = listEmp.get(i).getId();
			}
		}
		listDepart.add(new Departamento(codigo, nomeDepart, departId));
		System.out.println();

		System.out.print("Digite o id do funcionario: ");
		String funid = sc.nextLine();
		for (int n = 0; n < listFunc.size(); n++) {
			if (listFunc.get(n).getId().equals(funid)) {
				for (Funcionario obj : listFunc) {
					System.out.println(obj);
				}

			} else {
				System.out.println("Esse id não existe");
			}
		}
		System.out.println();

		System.out.print("Digite o codigo do departamento: ");
		String codigoDepart = sc.nextLine();
		for (int n = 0; n < listDepart.size(); n++) {
			if (listDepart.get(n).getCodigo().equals(codigoDepart)) {
				for (Departamento obj : listDepart) {
					System.out.println(obj);
				}

			} else {
				System.out.println("Esse id não existe");
			}
		}
		System.out.println();
		System.out.print("Digite o id do funcionario para excluilo: ");
		String removerFunc = sc.nextLine();

		for (int n = 0; n < listFunc.size(); n++) {
			if (listFunc.get(n).getId().equals(removerFunc)) {
				listFunc.clear();
				System.out.println("O funcionario foi excluido.");

			} else {
				System.out.println("Esse id não existe");
			}
		}
		System.out.println();
		System.out.print("Digite o codigo do departamento para excluilo: ");
		String removerDepart = sc.nextLine();

		for (int n = 0; n < listDepart.size(); n++) {
			if (listDepart.get(n).getCodigo().equals(removerDepart)) {
				listDepart.clear();
				System.out.println("O departamento foi excluido.");
			} else {
				System.out.println("Esse id não existe");
			}
		}
		sc.close();

	}
}
