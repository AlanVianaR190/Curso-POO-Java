
package aula02;

//clase
public class Caneta 
{
    //atributos
    public String modelo, cor;
    private double ponta;
    protected int carga;
    private boolean tampada;
    
    /*O atributo <private> pode ser usado apenas na clase corespondente*/
    
    //metodo <void> não possui retorno
    public void status()
    {
        //
        System.out.println("Uma caneta: " + this.cor);// <this> e uma referencia ao objeto chamado
        System.out.println("Do modelo: " + this.modelo);
        System.out.println("De ponta: " + this.ponta);
        System.out.println("Com a carga em: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    //metodo
    public void rabiscar()
    {
        if (this.tampada){
            System.out.println("ERRO, NÃO POSSO ESCREVER!");
        }
        else
        {
            System.out.println("ESCREVA");
        }
    }
    
    //metodo
    protected void tampar()
    {
        if (!this.tampada)
        {
            this.tampada = true;
            System.out.println("A caneta agora esta tampada!");
        }
        else
        {
            System.out.println("Não e possivel tampar a caneta, pois ela ja esta com a tampa!");
        }
    }
    
    //metodo
    protected void destampar()
    {
        if (this.tampada)
        {
            this.tampada = false;
            System.out.println("A caneta esta destampada!");
        }
        else
        {
            System.out.println("Não e possivel destampar a caneta, pois ela ja esta sem a tampa!");
        }
    }
    
}
