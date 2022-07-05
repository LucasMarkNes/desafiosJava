package Desafio3;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Program {

    public static void main(String[] args){

        int aluno = 0;
        int mNota = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ente com a Quantidade de alunos");
        aluno = sc.nextInt();

        int[] nota = new int[aluno];
        String[]nome = new String[aluno];

        for (int i = 0; i < aluno; i++){
            System.out.println("Entre com o nome do aluno:" + (i + 1));
            nome[i] = sc.next();
            System.out.println("Entre com a nota do aluno:");
            nota[i] = sc.nextInt();

            if (i > 0 &&(nota[i] > nota[mNota]))mNota = i;
        }
        System.out.println("O aluno com maior nota é:");
        System.out.println(nome[mNota]);
        System.out.println(nota[mNota]);
    }
}