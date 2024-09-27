
package aula11;

public class Canguru extends Mamifero
{
    //metodo sobreposto
    @Override
    public void locomover()
    {
        System.out.println("Saltando.");
    }
    
    //metodo classe
    public void usarBolsa()
    {
        System.out.println("Usando bolsa.");
    }
    
}
