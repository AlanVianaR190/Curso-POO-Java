
package aula11;

public class Cachorro extends Mamifero
{
    //metodo da classe
    public void enterrarOsso()
    {
        System.out.println("Enterrando osso... ");
    }
    
    public void abanarRabo()
    {
        System.out.println("Abanando rabo... ");
    }

    //
    @Override
    public void emitirSom()
    {
        System.out.println("Au au au...");
    }
  
}
