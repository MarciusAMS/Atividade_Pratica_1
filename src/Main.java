import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sair = false;
        List<Veiculos> veiculosList = new ArrayList<>();

        Scanner scr = new Scanner(System.in);

        do {
            int opcao;
            System.out.println("==============================================");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 – Cadastrar novo veículo");
            System.out.println("2 – Editar veículo");
            System.out.println("3 – Ver informações de um veículo específico");
            System.out.println("4 – Excluir veículo");
            System.out.println("5 – Ver todos os veículos");
            System.out.println("6 – Sair");
            System.out.println("==============================================");

            opcao = Integer.parseInt(scr.nextLine());

            switch (opcao) {
                case 1:
                    Veiculos.cadastrarVeiculo(veiculosList);
                    break;
                case 2:
                    editarVeiculo(veiculosList);
                    break;
                case 3:
                    buscarVeiculoPorCodigo(veiculosList);
                    break;
                case 4:
                    excluirVeiculo(veiculosList);
                    break;
                case 5:
                    listarVeiculos(veiculosList);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (!sair);
    }

    public static void editarVeiculo(List<Veiculos> veiculosList) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Informe o código do veículo que deseja editar: ");
        String codigo = scr.nextLine().toUpperCase();

        for (Veiculos veiculo : veiculosList) {
            if (veiculo.getCodigo().equals(codigo)) {
                System.out.println("Veículo encontrado. Digite os novos dados:");

                System.out.print("Nova cor: ");
                String novaCor = scr.nextLine().toUpperCase();
                veiculo.setCor(novaCor);

                System.out.print("Nova marca: ");
                String novaMarca = scr.nextLine().toUpperCase();
                veiculo.setMarca(novaMarca);

                System.out.print("Novo modelo: ");
                String novoModelo = scr.nextLine().toUpperCase();
                veiculo.setModelo(novoModelo);

                System.out.print("Novo valor: ");
                String novoValor = scr.nextLine().toUpperCase();
                veiculo.setValor(novoValor);

                if (veiculo instanceof Automotores) {
                    Automotores automotor = (Automotores) veiculo;
                    do {
                        System.out.print("Informe o tipo de combustível (G, A, F, E, D): ");
                        char novoCombustivel = scr.nextLine().toUpperCase().charAt(0);

                        if (novoCombustivel == 'G' || novoCombustivel == 'A' || novoCombustivel == 'F' || novoCombustivel == 'E' || novoCombustivel == 'D') {
                            automotor.setCombustivel(novoCombustivel);
                            break;
                        } else {
                            System.out.println("Opção inválida! Por favor, escolha um combustível válido.");
                        }
                    } while (true);
                }

                if (veiculo instanceof Carro) {
                    Carro carro = (Carro) veiculo;
                    System.out.print("Nova quantidade de portas: ");
                    int novaQuantidadePortas = Integer.parseInt(scr.nextLine());
                    carro.setQtdePortas(novaQuantidadePortas);
                } else if (veiculo instanceof Moto) {
                    Moto moto = (Moto) veiculo;
                    System.out.print("Nova cilindrada: ");
                    String novaCilindrada = (scr.nextLine());
                    moto.setCilindrada(novaCilindrada);
                    System.out.print("Partida elétrica (true/false): ");
                    boolean novaPartidaEletrica = Boolean.parseBoolean(scr.nextLine());
                    moto.setPtdEletrica(novaPartidaEletrica);
                } else if (veiculo instanceof Caminhoes) {
                    Caminhoes caminhoes = (Caminhoes) veiculo;
                    System.out.print("Nova carga máxima: ");
                    String novaCargaMax = (scr.nextLine());
                    caminhoes.setCargaMax(novaCargaMax);
                    System.out.print("Novo número de eixos: ");
                    String novoNumEixos = (scr.nextLine());
                    caminhoes.setNumEixos(novoNumEixos);
                } else if (veiculo instanceof Bicicleta) {
                    Bicicleta bicicleta = (Bicicleta) veiculo;
                    System.out.print("Novo tipo de freio: (C, V, F, M, H)");
                    char novoTipoFreio = scr.nextLine().toUpperCase().charAt(0);
                    bicicleta.setTipoFreio(novoTipoFreio);
                }

                System.out.println("Veículo editado com sucesso.");
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    public static void buscarVeiculoPorCodigo(List<Veiculos> veiculosList) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Informe o código do veículo: ");
        String codigo = scr.nextLine().toUpperCase();

        boolean encontrado = false;

        for (Veiculos veiculo : veiculosList) {
            if (veiculo.getCodigo().equals(codigo)) {
                encontrado = true;
                System.out.println("Código: " + veiculo.getCodigo());
                System.out.println("Cor: " + veiculo.getCor());
                System.out.println("Marca: " + veiculo.getMarca());
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Valor: " + veiculo.getValor());

                if (veiculo instanceof Carro) {
                    Carro carro = (Carro) veiculo;
                    carro.imprimirInformacoesEspecificas();
                }
                if (veiculo instanceof Moto){
                    Moto moto = (Moto) veiculo;
                    moto.imprimirInformacoesEspecificas();
                }
                if (veiculo instanceof Caminhoes){
                    Caminhoes caminhoes = (Caminhoes) veiculo;
                    caminhoes.imprimirInformacoesEspecificas();
                }
                if (veiculo instanceof Bicicleta){
                    Bicicleta bicicleta = (Bicicleta) veiculo;
                    bicicleta.imprimirInformacoesEspecificas();
                }
                break; // Uma vez que o veículo foi encontrado, não há necessidade de continuar iterando sobre a lista
            }
        }

        if (!encontrado) {
            System.out.println("Veículo não encontrado.");
        }
    }

    public static void excluirVeiculo(List<Veiculos> veiculosList) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Informe o código do veículo que deseja excluir: ");
        String codigo = scr.nextLine().toUpperCase();

        for (Veiculos veiculo : veiculosList) {
            if (veiculo.getCodigo().equals(codigo)) {
                veiculosList.remove(veiculo);
                System.out.println("Veículo excluído com sucesso.");
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    public static void listarVeiculos(List<Veiculos> veiculosList) {
        if (veiculosList.size() > 0) {
            System.out.println("Listagem de Veículos:");
            System.out.println(String.format("%-10s %-10s %-10s %-10s", "Código", "Marca","Modelo", "Valor"));
            System.out.println("==============================================");

            for (Veiculos veiculo : veiculosList) {
                System.out.println(String.format("%-10s %-10s %-10s %-10s", veiculo.getCodigo(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getValor()));
            }
        } else {
            System.out.println("Não há veículos cadastrados.");
        }
    }
}
