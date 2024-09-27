
package aula13;

public class Aula13
{
    //programa principal
    public static void main(String[] args)
    {
        
        //instanciando um vetor de uma classe
        Video v[] = new Video[3];
        
        v[0] = new Video("As tranças do rei careca");
        v[1] = new Video("As aventuras de Kiko, Zinho & Branco");
        v[2] = new Video("A dramatica historia de Paula Tejano");
        
        //
        Gafanhoto g[] = new Gafanhoto[3];
        
        g[0] = new Gafanhoto("Jubileu", 50, "M", "jujuba24");
        g[1] = new Gafanhoto("Minny", 30, "F", "balzaca69");
        g[2] = new Gafanhoto("Zeca", 45, "M", "maloqueiroMM");
        
        //
        Vizualizacao viz[] = new Vizualizacao[3];
        
        viz[0] = new Vizualizacao(g[0], v[1]);
        viz[0].avaliar();
        System.out.println(viz[0].toString());
        System.out.println("");
        
        viz[1] = new Vizualizacao(g[0], v[2]);
        viz[1].avaliar(88.0);
        System.out.println(viz[1].toString());
        System.out.println("");
        
        viz[2] = new Vizualizacao(g[1], v[1]);
        viz[2].avaliar(7.7);
        System.out.println(viz[2]);
        System.out.println("");
        
    }
}
