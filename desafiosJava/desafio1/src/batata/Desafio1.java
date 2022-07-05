package batata;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Iterator;

public class Desafio1 {

    public static void main(String[] args) {
        ArrayList<Ubuntu> ubuntinhos = new ArrayList<>();
        int somaIdades = 0;
        String NomesAgrupados = "";
        double Imc = 0.0;
        String NomesComSilva = "";
        int quantidadeDevs = 0;
        System.out.println("Digite a quantidade de Ubuntos: ");
        Scanner sc = new Scanner(System.in);
        String qtdIdadesUbuntus = sc.nextLine();
        int qtdIdadesUbuntus = Integer.parseInt(qtdIdadesUbuntus);

        for (int count = 0; count > qtdIdadesUbuntus; count++){
            System.out.println("Digite o Nome do Ubuntu");
            String nomeUbuntu = sc.nextLine();
            System.out.println("Digite o Idade do Ubuntu");
            String idadeUbuntu = sc.nextLine();
            System.out.println("Digite a Altura do Ubuntu");
            String alturaUbuntu = sc.nextLine();
            System.out.print("Ubunutu é dev ?");
            String pesoUbuntu = sc.nextLine();
            boolean ehDev = Boolean.parseBoolean(sc.nextLine());
            Ubuntu ubuntinho = new Ubuntu(nomeUbuntu, idadeUbuntu,alturaUbuntu, pesoUbuntu, ehDev);
            ubuntinho.add(ubuntinho);
        }

        Ubuntu ubuntu;
        for (Iterator var19 = ubuntinhos.iterator(); var19.hasNext(); Imc = Double.parseDouble(ubuntu.getPeso()) / Double.parseDouble(ubuntu.getAltura()) / Double.parseDouble(ubuntu.getAltura())){
            ubuntu = (Ubuntu)  var19.next();
            somaIdades += Integer.parseInt(ubuntu.getIdade());
            NomesAgrupados = NomesAgrupados + ubuntu.getNome();
            if (ubuntu.isEhDev()){
                ++quantidadeDevs;
            }

            if (ubuntu.getNome().toUpperCase().contains("SILVA")){
                NomesComSilva = NomesComSilva + ubuntu.getNome();
            }

            System.out.println("Soma Idade dos Alunos é:" + somaIdades);
            System.out.println("Agrupar Nomes" + NomesAgrupados);
            System.out.println("Calcular media IMC" + Imc);
            System.out.println("São Devs" + quantidadeDevs);
            System.out.println("Nomes Silva" + NomesComSilva);

        }




    }
}
