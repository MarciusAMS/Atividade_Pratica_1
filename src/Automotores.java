import java.util.Scanner;

public class Automotores extends Veiculos {
   private char Combustivel;

    public Automotores(String codigo, String cor, String marca, String modelo, String valor) {
        super(codigo, cor, marca, modelo, valor);
    }

    public void Automotores(char combustivel) {
        this.Combustivel = combustivel;

        Scanner scr = new Scanner(System.in);

        do {
            System.out.println("Informe o tipo de combustível (G, A, F, E, D) ");
            combustivel = scr.nextLine().toUpperCase().charAt(0);

            switch (combustivel) {
                case 'G':
                    System.out.println("Combustível: Gasolina");
                    break;
                case 'A':
                    System.out.println("Combustível: Álcool");
                    break;
                case 'F':
                    System.out.println("Combustível: Flex");
                    break;
                case 'E':
                    System.out.println("Elétrico");
                    break;
                case 'D':
                    System.out.println("Combustível: Diesel");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha um combustível válido");
            }
        } while (combustivel != 'G' && combustivel != 'A' && combustivel != 'F' && combustivel != 'E' && combustivel != 'D');
        scr.close();
    }
}
