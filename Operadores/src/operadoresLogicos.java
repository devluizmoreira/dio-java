public class operadoresLogicos {
    
    public static void main (String args []) {

    boolean condicao1 = true;
    boolean condicao2 = true;


    // && - Expressão lógica que compara se a condição 1 E a condição 2 são verdadeiras
    // || - Expressão lógica que compara se condição 1 OU a condição 2 são verdadeiras

        if(condicao1 && ( 7 > 4 ) ){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim.");
    }
}
