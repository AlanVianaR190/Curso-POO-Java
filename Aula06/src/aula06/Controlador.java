
package aula06;

//interface
public interface Controlador
{
    /*metodos que podem sem implementado por uma classe, todos são abstract pois
    serão desenvolvidos fora, e todos devem ser publico (não e necessario colocar)*/

    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    void fecharMenu();
     void maisVolume();
     void menosVolume();
     void ligarMudo();
     void desligarMudo();
     void play();
     void pause();
}
