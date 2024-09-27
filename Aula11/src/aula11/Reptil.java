
package aula11;

public class Reptil extends Animal
{
    //atributo da claase
    private String corEscama;
    
    //
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //metodos sobrepostos da classe Animal
    @Override
    public void locomover() 
    {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo vegetais.");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("som de Reptil.");
    }
    
}
