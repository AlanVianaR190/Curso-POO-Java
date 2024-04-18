
package aula11;


public class Peixe extends Animal
{
    //atributo
    private String corEscama;
    
    //
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //metodo 
    public void soltarBolha()
    {
        System.out.println("Soltou uma bolha");
    }
    
    //metodos sobrepostos
    @Override
    public void locomover()
    {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo substancias.");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Peixe não emite som.");
    }
    
}
