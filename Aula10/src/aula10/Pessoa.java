
package aula10;

/* classe abstrata, não é possivel instancia-la é
usada quando você quer definir um comportamento comum para várias subclasses*/
public abstract class Pessoa 
{
    //atributs
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
    
    //to String
    @Override
    public String toString() {
        return "Dados {" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
    //metodo
    public void fazAniver()
    {
        this.idade += 1;
    }
}
