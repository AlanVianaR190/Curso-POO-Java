
package aula08;

public class Pessoa 
{
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //metodo construtor
    public Pessoa(String nome, int idad, String sexo)
    {
        this.nome = nome;
        this.idade = idad;
        this.sexo = sexo;
    }

    //metodos especiais
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }
    
    //metodo
    public void fazerAniver()
    {
        this.setIdade(this.getIdade() + 1);
    }
}
 