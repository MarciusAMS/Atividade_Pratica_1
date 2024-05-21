import java.util.Scanner;

public class Carro extends Automotores {
    private int quantidadePortas;

    public Carro(String codigo, String cor, String marca, String modelo, String valor, int quantidadePortas) {
        super(codigo, cor, marca, modelo, valor);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void imprimirInformacoesEspecificas() {
        System.out.println("Quantidade de portas: " + quantidadePortas);
        System.out.println("Combustível: " + getCombustivelDescricao());
    }

    public static Carro cadastrarVeiculo() {
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

        System.out.println("Informe a quantidade de portas: ");
        int quantidadePortas = Integer.parseInt(scr.nextLine());

        Carro carro = new Carro(codigo, cor, marca, modelo, valor, quantidadePortas);
        carro.informarCombustivel(); // Definir o combustível após a criação do objeto

        return carro;
    }

    public void setQtdePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
