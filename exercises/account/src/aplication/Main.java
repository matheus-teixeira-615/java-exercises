package aplication;

import entities.Account;

import java.util.Scanner;

//Esse teste foi feito com um construtor vazio, ja que não tinha o conhecimento
//para fazer sobrecarga de construtores e juntar tudo, futuramente pretendo atualizar ele.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter account number: ");
        account.setNumberAccount(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter account holder: ");
        account.setHolderAccount(scanner.nextLine());

        System.out.println("Is there a initial deposit (y/n)? ");
        String initialDeposit = scanner.next();
        if (initialDeposit.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            account.depositValue(scanner.nextDouble());
        }
        System.out.printf("Account %d, Holder: %s, Balance: $%.2f\n",
                account.getNumberAccount(),
                account.getHolderAccount(),
                account.getBalanceAccount());

        System.out.println("Enter initial deposit value: ");
        account.depositValue(scanner.nextDouble());

        System.out.println("Update account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $%.2f\n",
                account.getNumberAccount(),
                account.getHolderAccount(),
                account.getBalanceAccount());

        System.out.println("enter withdraw value: ");
        account.withdrawValue(scanner.nextDouble());

        System.out.printf("Account %d, Holder: %s, Balance: $%.2f\n",
                account.getNumberAccount(),
                account.getHolderAccount(),
                account.getBalanceAccount());

        scanner.close();
    }
}