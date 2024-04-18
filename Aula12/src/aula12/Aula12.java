
package aula12;

public class Aula12 {

    public static void main(String[] args)
    {
        //instanciando um objeto da classe cachorro
        Cachorro dog = new Cachorro();
        
        /*metodo sobreposto*/
        dog.emitirSom();
        
        /*metodo de sobrecarga, o que diferencia qual vai ser sua execução e a 
        sua assinatura ou seja os parametros e o tipo de parametros*/
        dog.reagir("ola");
        dog.reagir(true);
        dog.reagir(16, 13);
        dog.reagir(8, 13.5);
        
    }
    
}
