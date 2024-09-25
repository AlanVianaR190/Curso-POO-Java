
package aula02;

//clase
public class Caneta 
{
    //atributos da classe
    String modelo, cor;
    double ponta;
    int carga;
    boolean tampada;
    
    //metodos <void> não possui retorno
    void status()
    {
        //<this> e uma referencia a um atributo da classe
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Do modelo: " + this.modelo);
        System.out.println("De ponta: " + this.ponta);
        System.out.println("Com a carga em: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    //metodos da classe
    void rabiscar()
    {
        if (this.tampada){
            System.out.println("ERRO, NÃO POSSO ESCREVER!");
        }
        else
        {
            System.out.println("ESCREVA");
        }
    }
    void tampar()
    {
        //o ponto de exclamação antes do this indica (not)
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
    void destampar()
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
