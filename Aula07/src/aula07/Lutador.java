
package aula07;

//classe lutador
public class Lutador 
{
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;;
    private int derrotas;
    private int empates;

    //metodo construtor
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        
        /*recebendo o peso, que ira ser analisado
        para clasificar a categoria (ver metodo setPeso())*/
        this.setPeso(pe);
        
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    //metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;

        //metodo interno
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    //
    private void setCategoria() {
        if (this.getPeso() < 52.2)
        {
            this.categoria = "Invalido";
        }
        else if (this.getPeso() <= 70.3)
        {
            this.categoria = "Leve";
        }
        else if (this.getPeso() <= 83.9)
        {
            this.categoria = "Medio";
        }
        else if (this.getPeso() <= 120.2)
        {
            this.categoria = "Pesado";
        }
        else
        {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //metodos
    public void apresentar()
    {
        System.out.println("ITS TIIIMEE!!!");
        System.out.println("Apresentando do(a) " + this.getNacionalidade());
        System.out.println("Com " + this.getAltura() + "m de altura e pesando " + this.getPeso() + "kg");
        System.out.println("De " + this.getIdade() + " anos, com " + this.getVitorias() + " vitorias e " + this.getDerrotas() + " derrotas");
        System.out.println(this.getNome() + "!!!") ;
        System.out.println("");
    }
    
    public void status()
    {
        System.out.println("-=-=-=-= CARD =-=-=-=-");
        System.out.println("NOME: " + this.getNome());
        System.out.println("PAIS: " + this.getNacionalidade());
        System.out.println("IDADE: " + this.getIdade());
        System.out.println("ALTURA: " + this.getAltura() + "m");
        System.out.println("PESO: " + this.getPeso() + "kg");
        System.out.println("CATEGORIA: " + this.getCategoria());
        System.out.println("VITORIAS: " + this.getVitorias());
        System.out.println("DERROTAS: " + this.getDerrotas());
        System.out.println("EMPATES: " + this.getEmpates());
        System.out.println("");
    }
    
    public void ganharLuta()
    {
        //this.vitorias += 1;
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta()
    {
        //this.derrotas = this.derrotas + 1;
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
}
