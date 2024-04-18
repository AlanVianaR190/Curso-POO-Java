
package aula04;

import javax.swing.JOptionPane

public class Aula04
{

    public static void main(String[] args)
    {
        //instanciando o objeto da classe em uma linha apenas
        //o erro e porque não esta respeitando o metodo construtor
        Caneta c1 = new Caneta();
        
        //
        c1.setModelo("BIC");
        c1.modelo = "Bic";
        
        c1.setPonta(1.5);
        c1.ponta = 1.5;  /*Como o objeto ponta da clase Caneta e privado
        não e possivel ter acesso sem o <set>*/
        
        c1.status();
        System.out.println("SOBRE A CANETA: ");
        
        System.out.println("O modelo e: " + c1.modelo + " com a ponta " + c1.ponta);/*Aqui tambem
        como o atributo e privado não e possivel ter o acesso sem o <get>*/

        System.out.println("O modelo e: " + c1.getModelo() + " com a ponta " + c1.getPonta());
        
        //Instanciando um novo objeto para utilizar o metodo construtor da classe caneta
        Caneta c2 = new Caneta("Bic", 1.0, "Preto");
        c2.status();
        
        
    }
    
}
