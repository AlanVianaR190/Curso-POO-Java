
package aula13;

public class Vizualizacao
{
    //atributos / agregação
    private Gafanhoto espectador;
    private Video filme;
    
    //construtor
    public Vizualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        
        //
        this.espectador.setTotAssist(this.espectador.getTotAssist() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    //getters setters
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    //to string
    @Override
    public String toString(){
        return "Vizualizacao: " + "espectador = " + espectador + ", filme = " + filme + ';';
    }
    
    
    //metodo sobrecarga
    public void avaliar()
    {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(double nota)
    {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(int porc)
    {
        int total = 0;
        
        if (porc <= 20)
        {
            total = 3;
        }
        else if (porc <= 50)
        {
            total = 5;
        }
        else if (porc <= 90)
        {
            total = 8;
        }
        else
        {
            total = 10;
        }
    }

}
