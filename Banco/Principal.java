/* eu fiz tudo que pediu (menos os opcionais, pq não entendi direito), POO
é muito fácil depois que vc entende */

package Banco;

import java.util.Scanner;

class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta conta1 = new Conta();
        Data data1 = new Data();

        Conta conta2 = new Conta();
        Data data2 = new Data();

        String nomeTitular = "Felipe Eduardo";
        String agencia = "176-7";
        double saldo = 1000.00;
        double valor = 0.0;
        int numero = 2007;
        int dia = 27;
        int mes = 03;
        int ano = 2007;

        conta1.recuperarDadosParaImpressão(nomeTitular, agencia, numero, dia, mes, ano, saldo);
        conta1.calcularRendimento(saldo);

        conta2 = conta1;
        data2 = data1;

        if (conta1 == conta2 && data1 == data2) {
            System.out.println("IGUAIS!");
        } else {
            System.out.println("DIFERENTES!");
        }

        System.out.println(conta1.dadosImpressão);

        System.out.println("Quando deseja sacar?");
        valor = input.nextDouble();

        if (conta1.Saque(saldo, valor) == true) {
            saldo = saldo - valor;
            System.out.println("Foram sacados " + valor + " da sua conta, saldo atual: " + saldo);
        } else {
            System.out.println("Não foi possível sacar!");
        }

        System.out.println("Quando deseja depositar?");
        valor = input.nextDouble();

        if (conta1.Deposito(saldo, valor) == true) {
            saldo = saldo + valor;
            System.out.println("Foram depositados " + valor + " da sua conta, saldo atual: " + saldo);
        } else {
            System.out.println("Não foi possível depositar!");
        }

        input.close();

    }
}