
package aula08;

public class Livro implements Publicacao
{
    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //metodo construtor
    public Livro(String titlo, String aut, int totPag, Pessoa leitr) 
    {
        this.titulo = titlo;
        this.autor = aut;
        this.totPaginas = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitr;
    }
    
    //metodos especiais
    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public int getTotPaginas() 
    {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) 
    {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() 
    {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) 
    {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() 
    {
        return aberto;
    }

    public void setAberto(boolean aberto)
    {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() 
    {
        return leitor;
    }

    public void setLeitor(Pessoa leitor)
    {
        this.leitor = leitor;
    }
    
    //metodo toString
    public String detalhes()
    {
        return "Livro{" + "titulo = " + titulo + "\n, autor = "
                + autor + "\n, totPaginas = " + totPaginas + "\n, pagAtual = "
                + pagAtual + "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome() 
                + "\n, idade = " + leitor.getIdade() + "\n, sexo = " + leitor.getSexo() +'}';
    }
    
    //metodos da interface
    @Override
    public void abrir()
    {
        this.setAberto(true);
    }

    @Override
    public void fechar()
    {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) 
    {
        if (p > this.getTotPaginas())
        {
            this.setPagAtual(0);
        }
        else
        {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag()
    {
        this.setPagAtual(this.getPagAtual() +  1);
    }

    @Override
    public void voltarPag()
    {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
}
