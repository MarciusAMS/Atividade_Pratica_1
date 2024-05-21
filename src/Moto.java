import java.util.Scanner;

public class Moto extends Automotores {
    private String cilindrada;

    public void setPtdEletrica(boolean ptdEletrica) {
        this.ptdEletrica = ptdEletrica;
    }

    private boolean ptdEletrica;

    public Moto(String codigo, String cor, String marca, String modelo, String valor, String cilindrada) {
        super(codigo, cor, marca, modelo, valor);
        this.cilindrada = cilindrada;
        this.ptdEletrica = ptdEletrica;
    }

    @Override
    public void imprimirInformacoesEspecificas() {
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Combustível: " + getCombustivelDescricao());
    }

    public static Moto cadastrarVeiculo() {
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

        System.out.println("Informe a cilindrada: ");
        String cilindrada = scr.nextLine().toUpperCase();

        Moto moto = new Moto(codigo, cor, marca, modelo, valor, cilindrada);
        moto.informarCombustivel(); // Definir o combustível após a criação do objeto

        return moto;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
