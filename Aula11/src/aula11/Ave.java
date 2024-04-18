
package aula11;


public class Ave extends Animal
{
    //atributos
    private String corPena;
    
    //
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //metodo
    public void fazerNinho()
    {
        System.out.println("Construiu um  ninho");
    }
    
    //metodos sobrepostos
    @Override
    public void locomover() 
    {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de ave.");
    }
    
}
