
package aula07;

import java.util.Random;

public class Luta
{
    /* Estes atributos são referências a objetos da classe Lutador,
   o que permite acessar os métodos definidos nessa classe */
    private Lutador desafiado;
    private Lutador desafiante;
    
    //atributos
    private int rounds;
    private boolean aprovada;
    
    
    //metodos getters e setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //metodos
    public void marcarLuta(Lutador l1, Lutador l2)
    {
        //
        //utilizando metodo da classe instanciada nos atributos desafiantes e desafiado
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)
        {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else
        {
            this.setAprovada(false);

            //<null> e vazio, não existe
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    //
    public void lutar()
    {
        if (this.getAprovada() == true){
            
            System.out.println("DESAFIADO: ");

            //utilizando metodo da classe instanciada nos atributos desafiante e desafiado
            this.desafiado.apresentar();
            System.out.println("DESAFIANTE: ");
            this.desafiante.apresentar();
            
            //instanciando um objeto da classe random
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            //
            switch(vencedor)
            {
                //empate
                case 01:
                    System.out.println("Empatou");
                    //utilizando metodo da classe instanciada nos atributos
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                //vitoria do desafiado
                case 02:
                    System.out.println("Vencedor..." + this.desafiado.getNome());
                    //utilizando metodos da classe instanciada nos atributos
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                //vitoria do desafiante
                case 03:
                    System.out.println("Vencedor..." + this.desafiante.getNome());
                    //utilizando metodos da classe instanciada nos atributos
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
        }
        else{
            System.out.println("A luta não pode acontecer!");
        }
    }
}
