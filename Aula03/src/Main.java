public class Main {
    public static void main(String[] args) {
        //instanciando um objeto da clase
        Caneta c1;
        c1 = new Caneta();

        // atribuindo valores diretamente aos atributos dessa instância.
        c1.cor = "Azul";
        c1.modelo = "BIC";

        //erro objeto privado
        //c1.ponta = 1.0;

        c1.carga = 35;

        //erro objeto privado
        //c1.tampada = false;

        c1.tampar();

        //chamada de metodo
        c1.status();

        /*Os atributos como <protected> podem ser usados nesta classe porque
        vem da classe instanciada*/
    }
}