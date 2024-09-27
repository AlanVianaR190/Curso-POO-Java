
package aula11;

public class Aula11 {

    public static void main(String[] args)
    {
        /*Não e possivel criar o objeto da classe Animal, pois Animal e uma
        classe abstrata*/
        Animal a = new Animal();
        
        //
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        /*o mesmo metodo e chamado varias vezes, mas seu comportamento e diferente
        de acordo com a classe correspondente, isso e POLIMORFISMO*/
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        
        //
        Cachorro dog = new Cachorro();
        Cobra snake =  new Cobra();
        
        //
        Canguru jack = new Canguru();
        Tartaruga ralph = new Tartaruga();
        
        //
        jack.locomover();
        ralph.locomover();
        snake.locomover();
        dog.emitirSom();
    }
    
}
