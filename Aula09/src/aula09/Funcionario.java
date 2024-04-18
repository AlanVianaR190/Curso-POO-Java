
package aula09;

public class Funcionario extends Pessoa
{
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //metodos getters and setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //metodos
    public void trabalhando()
    {
        if (this.trabalhando == true)
        {
            this.trabalhando = false;
        }
        else
        {
            this.trabalhando = true;
        }
    }
    
    
}
