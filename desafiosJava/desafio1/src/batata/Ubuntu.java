package batata;

public class Ubuntu {

    private String nome;
    private String idade;
    private String peso;
    private String altura;
    private boolean ehDev;

    public Ubuntu(String nome, String idade, String peso, String altura, boolean ehDev){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.ehDev = ehDev;

    }
    public boolean isEhDev(){return this.ehDev;}
    public void setEhDev(boolean ehDev){this.ehDev = ehDev;}
    public void setNome(String nome){this.nome = nome;}

    public  Ubuntu(){
    }

    public String getNome(){return this.nome;}
    public String getIdade(){return  this.idade;}
    public void setNome(){this.nome = nome;}
    public void setIdade(){this.idade = idade;}

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void add(Ubuntu ubuntinho) {
    }
}
