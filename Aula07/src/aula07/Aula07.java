
package aula07;

public class Aula07
{

    public static void main(String[] args)
    {
       //instanciando a classe lutador em um ARRAY/VETOR
       Lutador l[] = new Lutador[6];
       
       //criando um objeto no vetor a partir da classe lutador 
       l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
     
       l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);

       l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);

       l[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);

       l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);

       l[5] = new Lutador("Nerdart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
       
       //instanciando a classe luta 
       Luta ufc01 = new Luta();
       ufc01.marcarLuta(l[1],l[5]);
       ufc01.lutar();
       
       
    }
    
}
