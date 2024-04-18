
package aula09;

public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;
    
    // metodos getters ans setters
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
    
    //metodos
    public void cancelMatric()
    {
        System.out.println("Cancelando matricula... ");
    }
}
