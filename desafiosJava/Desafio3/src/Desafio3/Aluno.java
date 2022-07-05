package Desafio3;

public class Aluno {
    private String nome;
    private int idade;
    private int alunos;
    private double nota;

    private String nome1;

public Aluno(String nome, int idade, int alunos, double nota, String nome1){
    this.nome = nome;
    this.idade = idade;
    this.alunos= alunos;
    this.nota = nota;
    this.nome1 = nome1;
}

public Aluno(){
}

public String getNome(){return  this.nome;}
public int getIdade(){return this.idade;}
public int getAlunos(){return  this.alunos;}
public double getNota(){return this.nota;}
public String getNome1(){return this.nome1;}

public void setNome(String nome){
    this.nome = nome;
}

public void setIdade(int idade){
    this.idade = idade;
}
public void setAlunos(int alunos){
    this.alunos = alunos;
}
public void setNota(double nota){
    this.nota = nota;
}

public void setNome1(String nome1){
    this.nome1 = nome1;
}

}

