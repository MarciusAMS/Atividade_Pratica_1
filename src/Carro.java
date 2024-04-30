import java.util.Scanner;

public class Carro extends Automotores {
   private int qtdePortas;

    public Carro(String codigo, String cor, String marca, String modelo, String valor) {
        super(codigo, cor, marca, modelo, valor);
    }
    public Integer quantidadePortas(){
        Scanner scr = new Scanner(System.in);

        System.out.println("Informe a quantidade de portas: ");
        qtdePortas = Integer.parseInt(scr.nextLine());

        System.out.println("Carro cadastrado com sucesso!!!");

        return qtdePortas;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas() {
        this.qtdePortas = qtdePortas;
    }

}
