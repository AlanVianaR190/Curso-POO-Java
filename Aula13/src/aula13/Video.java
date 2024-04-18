
package aula13;

//implementando a interface de 
public class Video implements AcoesVideo
{
    //atributos
    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //construtor
    public Video(String titulo)
    {
        this.titulo = titulo;
        this.avaliacao = 0.0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
    //getters setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) 
    {
        double nova;
        nova = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //metodos sobrepostos
    @Override
    public void play() 
    {
        this.reproduzindo = true;
    }

    @Override
    public void pause()
    {
        this.reproduzindo = false;
    }

    @Override
    public void like() 
    {
        this.curtidas += 1;
    }
    
    //toString
    @Override
    public String toString() {
        return "Video: " + "titulo = " + titulo + ", avaliacao = " + avaliacao +
                ", views = " + views + ", curtidas = " + curtidas +
                ", reproduzindo = " + reproduzindo + ';';
    }
    
}
