import java.util.Scanner;

public class MenuRestaurante {



public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int opcao;
    int pedido = 0;
    double conta;

    do { 
       
        //Mostra o menu
        System.out.println("Menu do Restaurante: ");
        System.out.println("1. Ver cardápio");
        System.out.println("2. Fazer um pedido");
        System.out.println("3. Verificar Conta");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        opcao = scanner.nextInt(); 

        // Switch case para escolher a opção
        switch (opcao) {
            case 1:
                System.out.println("=== Cardápio ===");
                System.out.println("1. Prato do dia: R$ 15,00");
                System.out.println("2. Bebida: R$ 5,00");
                System.out.println("3. Sobremesa: R$ 7,00");
                break;
            case 2:
                System.out.println("=== Fazer um pedido ===");
                System.out.println("Escolha o que deseja pedir...");
                System.out.println("1. Prato do dia");
                System.out.println("2. Prato do dia + Bebida");
                System.out.println("3. Prato do dia + Bebida + Sobremesa");
                pedido = scanner.nextInt(); 
                break;
            case 3:
                System.out.println("=== Verificar conta ===");
                System.out.println("Calculando o total da sua conta...");
                if (pedido == 1) {
                    conta = 15.0;
                    System.out.println("Sua conta deu total de:" + " " + conta);
                } else if (pedido == 2) {
                    conta = 20.0;
                    System.out.println("Sua conta deu total de:" + " " + conta);
                } else if ( pedido == 3 ) {
                    conta = 27.0;
                    System.out.println("Sua conta deu total de:" + " " + conta);
                } else 
                    System.out.println("Nenhum pedido feito ainda.");
                break;
                case 4:
                    System.out.println("Saindo do programa...");
                break;
            default:
                    System.out.println("Opção Inválida. Tente novamente.");
            }

        } while (opcao !=4);
            System.out.println("Obrigado por utilizar o sistema do restaurante!");
       
            scanner.close();

    } 

}
