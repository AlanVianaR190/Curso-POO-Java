
package aula02;

public class Aula02
{

    public static void main(String[] args)
    {
        //instanciando um objeto da classe
        Caneta c1;
        c1 = new Caneta();
        
        // atribuindo valores diretamente aos atributos dessa instância.
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.ponta = 0.5;
        c1.carga = 25;
        c1.tampada = false;
        
        //chamadando um metodo da classe instanciada
        c1.tampar();

        c1.status();

        c1.rabiscar();
        
        System.out.println(" ");
        
        //instanciando outro objeto da mesma clase
        Caneta c2;
        c2 = new Caneta();
        
        //
        c2.cor = "Vermelho";
        c2.modelo = "Pilot";
        c2.ponta = 1.0;
        c2.carga = 75;
        c2.tampada = true;
        
        //chamada de metodo
        c2.tampar();
        
        //
        c2.status();
        
        //
        c2.rabiscar();
    }
}
