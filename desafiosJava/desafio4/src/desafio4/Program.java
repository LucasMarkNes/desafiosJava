package desafio4;


import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args){

    List<Aluno> alunos = new ArrayList<Aluno>();

    Aluno Lucas = new Aluno("Lucas",10,10);
    Aluno Luan = new Aluno("Luan", 10,1.2);
    Aluno Bruno = new Aluno("Bruno", 10,5.9);

    alunos.add(Lucas);
    alunos.add(Luan);
    alunos.add(Bruno);

    var soma = Lucas.getNota() + Luan.getNota() + Bruno.getNota();

    System.out.println("a soma das notas são:"+ soma);
    }

}
