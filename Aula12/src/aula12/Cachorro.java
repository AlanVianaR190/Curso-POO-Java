
package aula12;

public class Cachorro extends Lobo
{
    //metodo sobreposto
    @Override
    public void emitirSom()
    {
        System.out.println("Au au au...");
    }
    
    //sobrecarga de metodos
    public void reagir(String frase)
    {
        if ("toma comida".equals(frase) || "ola".equals(frase))
        {
            System.out.println("Abanar o rabo e latir...");
            this.emitirSom();
        }
        else
        {
            System.out.println("Rosnar...");
        }
    }
    
    public void reagir(int hora, int min)
    {
        if(hora < 12)
        {
            System.out.println("Abanar...");
        }
        else if (hora >=18)
        {
            System.out.println("Ignorar...");
        }
        else
        {
            System.out.println("Abanar e latir...");
            this.emitirSom();
        }
    }
    
    public void reagir(boolean dono)
    {
        if (dono == true)
        {
            System.out.println("Abanar...");
        }
        else
        {
            System.out.println("Rosnar e latir...");
            this.emitirSom();
        }
    }
    
    public void reagir(int idade, double peso)
    {
        if (idade < 5)
        {
            if (peso < 10){
                System.out.println("Abanar...");
            }
            else
            {
                System.out.println("Latir...");
                this.emitirSom();
            }
        }
        else
        {
            if(peso < 10)
            {
                System.out.println("Rosnar...");
            }
            else
            {
                System.out.println("Ignorar...");
            }
        }
    }
}
