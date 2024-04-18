
package aula06;

//esta classe implementa a interface <Controlador>, ela fornece implementações para os metodos da INTERFACE  
public class ControleRemoto implements Controlador
{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodo cnstrutor, sem parametros
    public ControleRemoto()
    {
        this.setVolume(25);
        this.setLigado(true);
        this.setTocando(false);
    }
    
    //metodos especiais
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos da interface
    
    //significa sobescrever
    @Override
    public void ligar() 
    {
        this.setLigado(true);
    }

    @Override
    public void desligar()
    {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu()
    {
        
        System.out.println("-=-=-=-= MENU =-=-=-=-");
        System.out.println("Esta ligado: " + this.getLigado());
        System.out.println("Esta tocando: " + this.getTocando());
        
        //
        System.out.println("No volume: " + this.getVolume());
        for (int quant = 1; quant <= this.getVolume(); quant += 1)
        {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu()
    {
        System.out.println("Menu FECHADO");
    }

    @Override
    public void maisVolume()
    {
        if (this.getLigado() == true)
        {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume()
    {
        if (this.getLigado() == true)
        {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo()
    {
        if (this.getLigado() == true && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo()
    {
        if (this.getLigado() == true && this.getVolume() <=0)
        {
            this.setVolume(25);
        }
    }

    @Override
    public void play()
    {
        if (this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause()
    {
        if (this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
        }
    }
    
}
