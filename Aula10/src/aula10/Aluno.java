
package aula10;

/*acrescentando a palavra final depois da palavra de acessibilidade evita 
que a CLASSE possa ser uma extenção de outra classe, ou seja ela não pode ter
filhos*/

public class Aluno extends Pessoa
{
    //atributos
    private int matricula;
    private String curso;
    
    //metodos getters and setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //metodo
    public void pagMensal()
    {
        System.out.println("Pagando mensalidade do aluno... " + this.getNome());
    }
    
    /*acrescentando a palavra final depois da palavra de acessibilidade evita 
    que o METODO seja sobreposto na subclasse*/
}
