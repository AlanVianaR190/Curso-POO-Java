
package aula09;

public class Professor extends Pessoa
{
    //atributos
    private String especialidade;
    private double salario;
    
    //metodos getters and setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //metodos
    public void recebAument(double aument)
    {
        this.salario = this.salario + aument;
    }
    
}
