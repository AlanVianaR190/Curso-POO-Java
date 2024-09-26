
package aula05;

//
public class ContaBanco
{
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //metodo construtor, sem parametro
    public ContaBanco()
    {
        //
        this.status = false;
        this.saldo = 0;
    }
    
    //metodos personalizados da classe
    public void abrirConta(String t)
    {
        //
        this.setTipo(t);
        this.setStatus(true);
        
        //
        if ("CC".equals(t))
        {
            this.setSaldo(50);
        }
        else if ("CP".equals(t))
        {
            this.setSaldo(150);
        }
        
        //
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta()
    {
        //
        if (this.getSaldo() > 0)
        {
            System.out.println("Conta com dinheiro, não pode ser fechada");
        }
        else if (this.getSaldo() < 0)
        {
            System.out.println("Conta em debito, não pode ser fechada");
        }
        else
        {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(double v)
    {
        //
        if (this.getStatus())
        {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.dono);
        }
        else 
        {
            System.out.println("Não e possivel fazer o deposito");
        }
    }
    public void sacar(double v)
    {
        //
        if (this.getStatus())
        {
            //
            if (this.getSaldo() >= 0)
            {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado da conta " + this.dono);
            }
            else if (this.getSaldo() < 0)
            {
                System.out.println("Não foi possivle fazer o saque");
            }
        }
        else
        {
            System.out.println("Não foi possivle fazer o saque");
        }
    }
    public void pagarMensal()
    {
        //
        double mens=0;
        
        //
        if (this.getTipo().equals("CC"))
        {
            mens = 12;
        }
        else if (this.getTipo().equals("CP"))
        {
            mens = 20;
        }
        
        //
        if (this.getStatus())
        {
            //
            if (this.getSaldo() >= 0)
            {
                this.setSaldo(this.getSaldo() - mens);
                System.out.println("Pagamento realizado da conta " + this.dono);
            }
            else if (this.getSaldo() < 0)
            {
                System.out.println("Não foi possivel fazer o pagamento");
            }

        }
        else
        {
            System.out.println("Não foi possivel fazer o pagamento");
        }
    }
    public void exibirStats()
    {
        //
        System.out.println("------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("");
    }
    
    //metodo getters, metodo acessor
    public int getNumConta() {
        return numConta;
    }

    //metodo setters, metodo modificador
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
