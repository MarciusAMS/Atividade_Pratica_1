import java.util.Scanner;

public class Bicicleta extends Veiculos {
    private char tipoFreio;

    // Construtor
    public Bicicleta(String codigo, String cor, String marca, String modelo, String valor) {
        super(codigo, cor, marca, modelo, valor);
    }

    public char tipoFreio(){
        do {
            Scanner scr = new Scanner(System.in);

            System.out.println("Escolha o tipo de freio (C, V, F, M, H): ");
            tipoFreio = scr.nextLine().toUpperCase().charAt(0); // Converter para maiúsculas e pegar o primeiro caractere

            switch (tipoFreio) {
                case 'C':
                    System.out.println("Freio Cantiléver");
                    System.out.println("Bicicleta cadastrada com sucesso!");
                    break;
                case 'V':
                    System.out.println("Freio Brake");
                    System.out.println("Bicicleta cadastrada com sucesso!");
                    break;
                case 'F':
                    System.out.println("Freio Ferradura");
                    System.out.println("Bicicleta cadastrada com sucesso!");
                    break;
                case 'M':
                    System.out.println("Freio Disco Mecânico");
                    System.out.println("Bicicleta cadastrada com sucesso!");
                    break;
                case 'H':
                    System.out.println("Freio Disco Hidráulico");
                    System.out.println("Bicicleta cadastrada com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (tipoFreio != 'C' && tipoFreio != 'V' && tipoFreio != 'F' && tipoFreio != 'M' && tipoFreio != 'H');
        return tipoFreio;
    }
}



