import java.util.Scanner;

public class Caminhoes extends Automotores {
    private String cargaMax;
    private String numEixos;

    public Caminhoes(String codigo, String cor, String marca, String modelo, String valor, String cargaMax, String numEixos) {
        super(codigo, cor, marca, modelo, valor);
        this.cargaMax = cargaMax;
        this.numEixos = numEixos;
    }

    @Override
    public void imprimirInformacoesEspecificas() {
        System.out.println("Carga Máxima: " + cargaMax);
        System.out.println("Número de Eixos: " + numEixos);
        System.out.println("Combustível: " + getCombustivelDescricao());
    }

    public static Caminhoes cadastrarVeiculo() {
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

        System.out.println("Informe a carga máxima: ");
        String cargaMax = scr.nextLine().toUpperCase();

        System.out.println("Informe o número de eixos: ");
        String numEixos = scr.nextLine().toUpperCase();

        Caminhoes caminhoes = new Caminhoes(codigo, cor, marca, modelo, valor, cargaMax, numEixos);
        caminhoes.informarCombustivel(); // Definir o combustível após a criação do objeto

        return caminhoes;
    }

    public void setCargaMax(String cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setNumEixos(String numEixos) {
        this.numEixos = numEixos;
    }
}
