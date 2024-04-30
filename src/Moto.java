import java.util.Scanner;

public class Moto extends Automotores {
    private String ptdEletrica;
    private String Cilindrada;

    public Moto(String codigo, String cor, String marca, String modelo, String valor) {
        super(codigo, cor, marca, modelo, valor); // Chamando o construtor da classe pai (Veiculos)
//        this.ptdEletrica = ptdEletrica;
//        this.Cilindrada = Cilindrada;
    }


    public String ptdEletrica(){
        Scanner scr = new Scanner(System.in);

        System.out.println("Informe se a partida é eletrica: ");
        ptdEletrica = scr.nextLine();

        return ptdEletrica;
    }

    public String Cilindrada(){
        Scanner scr = new Scanner(System.in);

        System.out.println("Informe a quantidade de Cilindradas: ");
        Cilindrada = scr.nextLine();

        System.out.println("Moto cadastrada com sucesso!!!");

        return Cilindrada;
    }

    public String isPtdEletrica() {
        return ptdEletrica;
    }

    public void setPtdEletrica(String ptdEletrica) {
        this.ptdEletrica = ptdEletrica;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        Cilindrada = cilindrada;
    }


}
