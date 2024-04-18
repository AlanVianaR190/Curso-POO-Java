
package aula08;

public class Aula08
{
    public static void main(String[] args)
    {
        //instanciando a classe pessoa
        Pessoa p[] = new Pessoa[2];
        
        //instanciando a classe livro
        Livro l[] = new Livro[3];
        
        //objetos do vetor da classe pessoa
        p[0] = new Pessoa("Alan",33,"M");
        p[1] = new Pessoa("Viana", 15, "M");
        
        //objetos do vetor da classe livro
        l[0] = new Livro("Java", "James, Mike & Patrick", 99, p[1]);
        l[1] = new Livro("POO", "Ohle, Dawn & Kristen", 64, p[0]);
        l[2] = new Livro("Logica de Programação", "George Boole", 55, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
    }
}
