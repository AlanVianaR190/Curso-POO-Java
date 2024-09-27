
package aula11;

public class Mamifero extends Animal
{
    //atributos da classe
    private String corPelo;
    
    //metodo getter and setter
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    //metodos sobrepostos da classe Animal
    @Override
    public void locomover() 
    {
        System.out.println("Correndo.");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de mamifero.");
    }
    
    //
    
}
