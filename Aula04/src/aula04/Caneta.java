
package aula04;

public class Caneta 
{
    //atributos
    public String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;
      
    //Metodo construtor com parametro
    public Caneta(String m, double p, String c)
    {
        this.setModelo(m);
        this.setPonta(p);
        
        this.cor = c;
        
        this.tampar();
    }
    
    // metodo geter (metodo de acesso)
    public String getModelo()
    {
        return this.modelo;
    }
    
    //metodo seter (metodo modificador)
    public void setModelo(String m)
    {
        this.modelo = m;
    }
    public double getPonta()
    {
        return this.ponta;
    }
    public void setPonta(double p)
    {
        this.ponta = p;
    }
    public void tampar()
    {
        this.tampada = true;
    }
    public void destampar()
    {
        this.tampada = false;
    }
    
    //
    public void status()
    {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("O modelo e: " + this.modelo);
        System.out.println("A ponta e: " + this.ponta);
        System.out.println("A cor e: " + this.cor);
        System.out.println("E esta tampada: " + this.tampada);
    }
    
    /*Utilizando o comando <Alt + Insert> e possivel criar o metodo construtor e 
    tambem criar os metodos seters e geters, a partir dos objetos definidos*/
}
