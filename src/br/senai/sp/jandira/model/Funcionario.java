package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {

    String nome, email, endereco;
    long telefone, cpf, rg;

    double bonus;

    /** Instancia o Scanner */
    Scanner teclado = new Scanner(System.in);

    public void cadastrarFuncionario() {

        System.out.println("---------  Cadastro Cliente  ---------");
        System.out.println("Qual é o nome do funcionário: ");
        nome = teclado.nextLine();
        System.out.println("Informe o CPF: ");
        cpf = teclado.nextLong();
        System.out.println("Informe o RG: ");
        rg = teclado.nextLong();
        System.out.println("Informe o Telefone: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Informe o email: ");
        email = teclado.nextLine();
        System.out.println("Informe o endereço: ");
        endereco = teclado.nextLine();
        System.out.println("--------  Cadastro Finalizado  ---------");
        System.out.println("----------------------------------------");
    }

    public void receberBonus(Veiculo objVeiculo){

        bonus += objVeiculo.preco * 0.10;
        System.out.println("Seu bônus é de: " + bonus);


    }

}
