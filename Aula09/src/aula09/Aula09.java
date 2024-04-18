
package aula09;

public class Aula09
{

    public static void main(String[] args)
    {
        //instanciando objetos das classes disponiveis
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 =  new Professor();
        Funcionario p4 = new Funcionario();
        
        //setNome pode ser usado em ambas as classes
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudia");
        p4.setNome("Fabiana");
        
        //setSexo pode ser usado em ambas as classes
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("F");
        
        //setIdade pode ser usado em ambas as classes
        p1.setIdade(53);
        p2.setIdade(52);
        p3.setIdade(34);
        p4.setIdade(22);
        
        //
        p2.setCurso("Informatica");     //setCurso e um metodo da classe Aluno
        p3.setSalario(3000);        //setSalario e um metodo da classe Professor
        p4.setSetor("Estoque");     //setSetor e um metodo da classe Funcionario
        
        /*um objeto pode utilizar os metodos apenas de suas classes 
        correspondentes, com exessão dos metodos da superclasse Pessoa*/
        p4.recebAument(0);
        p2.trabalhando();
        p3.cancelMatric();
        
        
        //
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
