package Main;

import Implementation.Supermarket;
import Implementation.SupermarketArray;

import java.util.Scanner;

public class Main {

    private static final int SIZE = 5;

    public static void main(String[] args){

        System.out.println("Olá, você está na sua lista de compras.");
        System.out.println("O que deseja fazer?");

        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;

        do {

            System.out.println("\nEscolha uma opção de 1 a 4:");
            System.out.println("\t1 - Inserir item");
            System.out.println("\t2 - Ver lista");
            System.out.println("\t3 - Remover item");
            System.out.println("\t4 - Sair da lista");

            System.out.println("Insira aqui: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Qual o item a ser adicionado? ");
                    String item = scanner.next();
                    supermarket.add(item);
                    System.out.println(item + " foi adicionado na lista. \n");
                    break;
                case 2:
                    System.out.println("Itens da lista: ");
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Qual o item a ser removido? ");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    System.out.println("Item removido da lista. \n");
                case 4:
                    System.out.println("Saiu da lista...");
                    break;
                default:
                    System.out.println("Opcao inválida. Tente novamente.");
            }

        }while (opcao != 4);
        scanner.close();
    }
}
