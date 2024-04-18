
package aula09;

public class Pessoa
{
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //metodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //metodos
    public void fazerAniv()
    {
        this.idade = this.idade +1;
    }
    
    //to string
    @Override
    public String toString() {
        return "Pessoa {" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
}
