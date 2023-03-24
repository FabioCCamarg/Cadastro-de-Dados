package DadosImprimir;

import java.util.Scanner;


public class DadosImprimir {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.printf("Digite seu Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("----------------------------------------");
        System.out.printf("Digite seu Endereco: ");
        String endereco = sc.nextLine();
        
        System.out.println("----------------------------------------");
        System.out.printf("Digite o Numero de telefone: ");
        long numtel = sc.nextLong();
        
        System.out.println("----------------------------------------");
        sc.nextLine();
        System.out.printf("Digite Area de atuacao profissional: ");
        String area = sc.nextLine();
        
        
        System.out.println("\n");
        System.out.println("nome: "+nome+"\n"+"Endereco: "+endereco+"\n"+ "Numero de telefone: "+numtel+"\n"+"Area de atuacao profissional: "+area);
    }
            
}
