
package aula10;

public class Bolsista extends Aluno
{
    //atributos
    private double bolsa;
    
    //metodos getters and setters
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    //metodo
    public void renovBolsa()
    {
        System.out.println("Renovando bolsa do aluno... " + this.getNome());
    }
    
    //metodo sobreposto, importado da classe Aluno
    @Override
    public void pagMensal()
    {
        System.out.println(this.getNome() + " e bolsista. Pagamento facilitado!");
    }
    
    /*O metodo pagMensal() desta classe e diferente do metodo do mesmo nome da classe
    Aluno */
    
}
