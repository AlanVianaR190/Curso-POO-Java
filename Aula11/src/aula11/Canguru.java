
package aula11;

public class Canguru extends Mamifero
{
    //metodo sobreposto
    @Override
    public void locomover()
    {
        System.out.println("Saltando.");
    }
    
    //
    public void usarBolsa()
    {
        System.out.println("Usando bolsa.");
    }
    
}
