
package aula10;

public class Aula10 
{

    public static void main(String[] args)
    {
        //tentando instanciar um objeto da classe ABSTRATA pessoa, não e possivel
        //Pessoa p1 = new Pessoa();
        
        /*instanciando um objeto da classe Visitante eu tenho acesso a metodos
        da classe Abstrata Pessoa da qual e uma extenção da classe Visitante*/ 
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal Juvencio");
        v1.setIdade(77);
        v1.setSexo("F");
        System.out.println(v1.toString());
        
        System.out.println("");
        
        //instanciando um objeto da classe Aluno, tambem tem acesso a Pessoa
        Aluno a1 = new Aluno();
        a1.setNome("Motherfucker");
        a1.setMatricula(6924);
        a1.setCurso("Programador");
        a1.setIdade(17);
        a1.setSexo("Feminino");
        a1.pagMensal();
        
        System.out.println("");
        
        /*instanciando um objeto da classe Bolsista, esta tem acesso a Pessoa
        e Aluno, e seu metodo pagMensal() e diferente do da classe Aluno*/
        Bolsista b1 = new Bolsista();
        b1.setNome("Pobre Louco");
        b1.setIdade(40);
        b1.setMatricula(1313);
        b1.setBolsa(149.99);
        b1.pagMensal();
        b1.renovBolsa();
        
        
    }
    
}
