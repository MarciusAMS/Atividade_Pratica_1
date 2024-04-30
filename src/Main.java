import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean sair = false;
        do {
            Scanner scr = new Scanner(System.in);
            Veiculos veiculos = new Veiculos("codigo", "cor", "marca", "modelo", "valor");

            int opcao;

            System.out.println("O que você deseja fazer?");
            System.out.println("1 – Cadastrar novo veículo");
            System.out.println("2 – Editar veículo");
            System.out.println("3 – Ver informações de um veículo específico");
            System.out.println("5 – Ver todos os veículos");
            System.out.println("6 - Sair");

            opcao = Integer.parseInt(scr.nextLine());

            switch (opcao) {
                case 1:
                    veiculos.cadastrarVeiculo();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (!sair);
    }
}
