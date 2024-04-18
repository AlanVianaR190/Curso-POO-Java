
package aula13;

//extenção de pessoa
public class Gafanhoto extends Pessoa
{
    //atributos
    private String login;
    private int totAssist;

    //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) 
    {
        //chamando a super instancia
        super(nome, idade, sexo);
        this.login = login;
        this.totAssist = 0;
    }
    
    //getters setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssist() {
        return totAssist;
    }

    public void setTotAssist(int totAssist) {
        this.totAssist = totAssist;
    }
    
    //to string
    @Override
    public String toString() {
        //chamando a super instancia
        return "Gafanhoto: " + super.toString() + "\nlogin = " + login + ", totAssist = " + totAssist + ';';
    }
    
    
}
