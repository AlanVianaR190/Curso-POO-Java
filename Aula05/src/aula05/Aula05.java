
package aula05;

import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) 
    {
        //Criand um objeto da classe contaBanco
        ContaBanco c1 = new ContaBanco();
        
        //Atribuindo os valores do elemento instanciado
        c1.setNumConta(2);
        c1.setDono("Alan");
        c1.abrirConta("CC");
        c1.depositar(120);
        
        //Chamando um metodo do elemento instanciado
        c1.exibirStats();
        
        //Criando outro objeto
        ContaBanco c2 = new ContaBanco();
        
        //
        c2.setNumConta(5);
        c2.setDono("Leonardo");
        c2.abrirConta("CP");
        c2.depositar(2000);
        
        //
        c2.exibirStats();

        //Cria uma nova instância da classe ContaBanco, e uma instancia da classe Scanner
        ContaBanco c3 = new ContaBanco();
        Scanner entrada = new Scanner(System.in);

        //
        c3.setNumConta(6);

        //Solicita o nome e armazana em uma variavel, define o nome do dono da conta
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        c3.setDono(nome);

        //
        System.out.println("Digite o tipo de conta; [CC] - Corrente / [CP] - Poupança: ");
        String tipo = entrada.next();
        c3.abrirConta(tipo);

        //solicita ao usuário se deseja ver o status da abertura da conta e armazena na variável 'opc'
        System.out.println("Deseja ver status da abertura de conta; [s]/[n]: ");
        String opc = entrada.next().toLowerCase();

        if (opc.equals("s")){

            c3.exibirStats();
        }
        else if (opc.equals("n")){

            System.out.println("Volte sempre!");
        }
        else {
            System.out.println("Opção invalida!");
        }

    }
    
}
