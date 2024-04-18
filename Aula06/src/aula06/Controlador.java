
package aula06;

//interface
public interface Controlador
{
    /*metodos que podem sem implementado por uma classe, todos são abstract pois
    serão desenvolvidos fora, e todos devem ser publico*/
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
