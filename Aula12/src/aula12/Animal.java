
package aula12;

//classe abstrata
public abstract class Animal
{
    //
    protected double peso;
    protected int idade;
    protected int membros;
    
    //metodo abstrato
    public abstract void emitirSom();
    
    //
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
