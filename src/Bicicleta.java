import java.util.Scanner;

public class Bicicleta extends Veiculos {
    private char tipoFreio;

    // Construtor
    public Bicicleta(String codigo, String cor, String marca, String modelo, String valor, char tipoFreio) {
        super(codigo, cor, marca, modelo, valor);
        this.tipoFreio = tipoFreio;
    }

    public static Bicicleta cadastrarVeiculo() {
        Scanner scr = new Scanner(System.in);

        System.out.println("Informe o código do veículo: ");
        String codigo = scr.nextLine().toUpperCase();

        System.out.println("Informe a cor do veículo: ");
        String cor = scr.nextLine().toUpperCase();

        System.out.println("Informe a marca do veículo: ");
        String marca = scr.nextLine().toUpperCase();

        System.out.println("Informe o modelo do veículo: ");
        String modelo = scr.nextLine().toUpperCase();

        System.out.println("Informe o valor do veículo: ");
        String valor = scr.nextLine().toUpperCase();

        char tipoFreio;
        do {
            System.out.println("Escolha o tipo de freio (C, V, F, M, H): ");
            tipoFreio = scr.nextLine().toUpperCase().charAt(0); // Converter para maiúsculas e pegar o primeiro caractere

            switch (tipoFreio) {
                case 'C':
                    System.out.println("Freio Cantiléver");
                    break;
                case 'V':
                    System.out.println("Freio V-Brake");
                    break;
                case 'F':
                    System.out.println("Freio Ferradura");
                    break;
                case 'M':
                    System.out.println("Freio Disco Mecânico");
                    break;
                case 'H':
                    System.out.println("Freio Disco Hidráulico");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (tipoFreio != 'C' && tipoFreio != 'V' && tipoFreio != 'F' && tipoFreio != 'M' && tipoFreio != 'H');

        System.out.println("Bicicleta cadastrada com sucesso!");

        return new Bicicleta(codigo, cor, marca, modelo, valor, tipoFreio);
    }

    public char getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(char tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public String freioDescricao() {
        switch (tipoFreio) {
            case 'C':
                return "Cantiléver";
            case 'V':
                return "V-Brake";
            case 'F':
                return "Ferradura";
            case 'M':
                return "Disco Mecânico";
            case 'H':
                return "Disco Hidráulico";
            default:
                return "Desconhecido";
        }
    }

    @Override
    public void imprimirInformacoesEspecificas() {
        System.out.println("Tipo de Freio: " + freioDescricao());
    }

    public static void editarVeiculo(Bicicleta bicicleta) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Nova cor: ");
        String novaCor = scr.nextLine().toUpperCase();
        bicicleta.setCor(novaCor);

        System.out.print("Nova marca: ");
        String novaMarca = scr.nextLine().toUpperCase();
        bicicleta.setMarca(novaMarca);

        System.out.print("Novo modelo: ");
        String novoModelo = scr.nextLine().toUpperCase();
        bicicleta.setModelo(novoModelo);

        System.out.print("Novo valor: ");
        String novoValor = scr.nextLine().toUpperCase();
        bicicleta.setValor(novoValor);

        char novoTipoFreio;
        do {
            System.out.println("Escolha o novo tipo de freio (C, V, F, M, H): ");
            novoTipoFreio = scr.nextLine().toUpperCase().charAt(0); // Converter para maiúsculas e pegar o primeiro caractere

            switch (novoTipoFreio) {
                case 'C':
                    System.out.println("Freio Cantiléver");
                    break;
                case 'V':
                    System.out.println("Freio V-Brake");
                    break;
                case 'F':
                    System.out.println("Freio Ferradura");
                    break;
                case 'M':
                    System.out.println("Freio Disco Mecânico");
                    break;
                case 'H':
                    System.out.println("Freio Disco Hidráulico");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (novoTipoFreio != 'C' && novoTipoFreio != 'V' && novoTipoFreio != 'F' && novoTipoFreio != 'M' && novoTipoFreio != 'H');

        bicicleta.setTipoFreio(novoTipoFreio);

        System.out.println("Bicicleta editada com sucesso!");
    }
}
