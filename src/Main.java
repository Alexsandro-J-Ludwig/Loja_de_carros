import Entidades.Carros;
import Entidades.Condicao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carros listaCarro =  new Carros();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while(true){
            System.out.println("Digite o nome do carro: ");
            listaCarro.addCarro(input.nextLine());

            if(listaCarro.getCarros().size() > 5){
                System.out.println("Deseja continuar? (S/N)");
                String escolha = input.nextLine();

                if(Condicao.fromString(escolha) == Condicao.NAO){
                    break;
                }
            }
        }

        String carro;
        do{

            while(true){
                listaCarro.listarCarros();
                System.out.println("Escolha um carro: ");
                carro = input.nextLine();

                if(listaCarro.getCarros().contains(carro)){
                    break;
                }

                }

            System.out.println("Se possui um carro, deseja dar como troca? (S/N)");
            String escolha = input.nextLine();

            if(Condicao.fromString(escolha) == Condicao.SIM){
                System.out.println("Informe seu carro: ");
                listaCarro.substituirCarro(carro, input.nextLine());
            }

            if(Condicao.fromString(escolha) == Condicao.NAO){
                listaCarro.removeCarro(carro);
            }

            System.out.println("Deseja comprar outro? (S/N): ");
            String escolha2 = input.nextLine();

            if(Condicao.fromString(escolha2) == Condicao.NAO){
                continuar = false;
            }
            } while(continuar);

        System.out.println("Obrigado pro comprar conosco");
        input.close();

        }
    }