import java.util.List;
import java.util.Scanner;

public abstract class Veiculos{
    private String codigo;
    private String cor;
    private String marca;
    private String modelo;
    private String valor;

    public Veiculos(String codigo, String cor, String marca, String modelo, String valor) {
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public static Veiculos cadastrarVeiculo(List<Veiculos> veiculosList) {
        Scanner scr = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("==============================================");
            System.out.println("Qual tipo de veículo será cadastrado?");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");
            System.out.println("4 - Bicicleta");
            System.out.println("5 - Voltar ao menu inicial");
            System.out.println("==============================================");

            opcao = Integer.parseInt(scr.nextLine());

            switch (opcao) {
                case 1:
                    Carro carro = Carro.cadastrarVeiculo();
                    veiculosList.add(carro);
                    return carro;
                case 2:
                    Moto moto = Moto.cadastrarVeiculo();
                    veiculosList.add(moto);
                    return moto;
                case 3:
                    Caminhoes caminhoes = Caminhoes.cadastrarVeiculo();
                    veiculosList.add(caminhoes);
                    return caminhoes;
                case 4:
                    Bicicleta bicicleta = Bicicleta.cadastrarVeiculo();
                    veiculosList.add(bicicleta);
                    return bicicleta;
                case 5:
                    return null; // Volta ao menu principal
                default:
                    System.out.println("Opção inválida! Por favor selecione uma opção válida!!!");
            }
        } while (true);
    }

    public abstract void imprimirInformacoesEspecificas();
}