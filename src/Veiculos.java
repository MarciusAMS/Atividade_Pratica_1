import java.util.Scanner;

public class Veiculos{
        private String codigo;
        private String cor;
        private String marca;
        private String modelo;
        private String valor;

        public Veiculos cadastrarVeiculoComum() {
                Scanner scr = new Scanner(System.in);

                System.out.println("Informe o código do veiculo: ");
                codigo = scr.nextLine().toUpperCase();

                System.out.println("Informe a cor do veiculo: ");
                cor = scr.nextLine().toUpperCase();

                System.out.println("Informe a marca do veiculo : ");
                marca = scr.nextLine().toUpperCase();

                System.out.println("Informe o modelo do veiculo: ");
                modelo = scr.nextLine().toUpperCase();

                System.out.println("Informe o valor do veiculo: ");
                valor = scr.nextLine().toUpperCase();

                return new Veiculos(codigo, cor, marca, modelo, valor);
        }

        public void cadastrarVeiculo() {
                Scanner scr = new Scanner(System.in);

                int opcao;

                do {
                        System.out.println("\nQual tipo de veículo será cadastrado?");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        System.out.println("3 - Caminhão");
                        System.out.println("4 - Bicicleta");
                        System.out.println("5 - Voltar ao menu inicial");

                        opcao = Integer.parseInt(scr.nextLine());

                        Veiculos veiculos = null;

                        switch (opcao) {
                                case 1:
                                        System.out.println("Veiculo Carro");
                                        Carro carro = new Carro(codigo, cor, marca, modelo, valor);
                                        veiculos = carro.cadastrarVeiculoComum();
                                        carro.quantidadePortas();
                                        break;
                                case 2:
                                        System.out.println("Veiculo Moto");
                                        Moto moto = new Moto(codigo, cor, marca, modelo, valor);
                                        veiculos = moto.cadastrarVeiculoComum();
                                        moto.ptdEletrica();
                                        moto.Cilindrada();
                                        break;
                                case 3:
                                        System.out.println("Veiculo Caminhão");
                                        Caminhoes caminhoes = new Caminhoes(codigo, cor, marca, modelo, valor);
                                        veiculos = caminhoes.cadastrarVeiculoComum();
                                        caminhoes.cargaMax();
                                        caminhoes.numEixos();
                                        break;
                                case 4:
                                        System.out.println("Veiculo Bicicleta");
                                        Bicicleta bicicleta = new Bicicleta(codigo, cor, marca, modelo, valor);
                                        veiculos = bicicleta.cadastrarVeiculoComum();
                                        bicicleta.tipoFreio();
                                        break;
                                case 5:
                                        return;
                                default:
                                        System.out.println("Opção inválida! Por favor selecione uma opção válida!!!");
                        }
                } while (opcao != 5);

                scr.close();
        }

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
}
