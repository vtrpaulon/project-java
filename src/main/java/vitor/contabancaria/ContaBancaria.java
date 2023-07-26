
package vitor.contabancaria;

import java.util.Scanner;

/**
 * @author vitor
 */
public class ContaBancaria {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int agencia;
        int numeroConta;
        String cliente;
        double saldo;
        
        System.out.println("Informe o numero da agencia: ");
        agencia = teclado.nextInt();
        
        System.out.println("Informe o numero da conta: ");
        numeroConta = teclado.nextInt();
        
        System.out.println("Informe o nome do cliente: ");
        cliente = (String)teclado.next();
        
        System.out.println("Qual é o valor do deposito inicial: ");
        saldo = teclado.nextDouble();
        
        System.out.println("Prezado cliente "+cliente+", agencia "+agencia+", conta "+numeroConta+", seu saldo atual é "+saldo);
    }
}
