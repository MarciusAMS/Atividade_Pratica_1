import java.util.Scanner;

public class Caminhoes extends Automotores{
   private String cargaMax;
   private String numEixos;

    public Caminhoes(String codigo, String cor, String marca, String modelo, String valor) {
        super(codigo, cor, marca, modelo, valor); // Chamando o construtor da classe pai (Veiculos)
//        this.cargaMax = cargaMax;
//        this.numEixos = numEixos;
    }

    public String cargaMax(){
        Scanner scr = new Scanner(System.in);

        System.out.println("Informe a carga máxima suportada: ");
        cargaMax = scr.nextLine();

        return cargaMax;
    }

    public String numEixos(){
        Scanner scr = new Scanner(System.in);

        System.out.println("Informe o número de eixos: ");
        numEixos = scr.nextLine();

        System.out.println("Caminhão cadastrado com sucesso!!!");

        return numEixos;
    }

    public String getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(String cargaMax) {
        this.cargaMax = cargaMax;
    }

    public String getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(String numEixos) {
        this.numEixos = numEixos;
    }
}
