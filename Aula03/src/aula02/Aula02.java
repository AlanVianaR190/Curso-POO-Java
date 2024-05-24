
package aula02;

public class Aula02
{

    public static void main(String[] args)
    {
        //instanciando um objeto da clase
        Caneta c1;
        c1 = new Caneta();
        
        //
        c1.cor = "Azul";
        c1.modelo = "BIC";
        
        c1.ponta = 1.0; //erro objeto privado
        
        c1.carga = 35;
        
        c1.tampada = false; // erro objeto privado
        
        c1.tampar();
        
        //chamada de metodo
        c1.status();
        
        /*Os atributos como <protected> podem ser usados nesta classe porque 
        vem da classe instanciada*/
        
    }
}

