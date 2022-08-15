package listapessoas;

import java.util.*;

public class Cadastro {
    public static void main(String[] args) throws Exception {

        try {

            List<Pessoa> pessoas = new ArrayList<Pessoa>();

            Scanner leia = new Scanner(System.in);

            int conte = 0;

            System.out.println("********************************");
            System.out.println("PROGRAMA DE CADASTRO DE PESSOAS");
            System.out.println("********************************");

            while (conte != 5) {

                System.out.println(
                        "Digite a opção desejada (apenas números):\n1 -> Cadastrar\n2 -> Listar em Ordem Alfabética\n3 -> Listar em Ordem de Idade\n4 -> Ver Lista Classificada por Idade\n5 -> Sair");
                conte = Integer.parseInt(leia.nextLine());

                if (conte == 1) {

                    Pessoa pessoa = new Pessoa();

                    System.out.println("Digite o nome: ");
                    pessoa.setNome(leia.nextLine());

                    System.out.println("Digite a idade: ");
                    int leu = Integer.parseInt(leia.nextLine());
                    pessoa.setIdade(leu);

                    String categoria = "";

                    if (leu < 12) {
                        categoria = "Criança";
                        pessoa.setCategoria(categoria);
                    }
                    if (leu >= 12 && leu <= 19) {
                        categoria = "Adolescente";
                        pessoa.setCategoria(categoria);
                    }
                    if (leu > 19 && leu < 65) {
                        categoria = "Adulto";
                        pessoa.setCategoria(categoria);
                    }
                    if (leu >= 65) {
                        categoria = "Idoso";
                        pessoa.setCategoria(categoria);
                    }

                    pessoas.add(pessoa);

                }

                if (conte == 2) {
                    System.out.println("Lista em Ordem Alfabética");
                    Collections.sort(pessoas, new ListaAlfabetica());
                    System.out.println(pessoas);
                }

                if (conte == 3) {
                    Collections.sort(pessoas);
                    System.out.println("Lista em Ordem de Idade");
                    System.out.println(pessoas);
                }

                else {
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println("\n- " + pessoas.get(i).getNome() + "\n " + pessoas.get(i).getIdade() + "\n "
                                + pessoas.get(i).getCategoria());
                    }
                }
            }

        } catch (Exception e) {
            // Tratamento de Exceção
            System.out.println("Comando inválido!");
        }
    }

}
