public class operadoresRelacionais {
    public static void main(String[] args) {

    // == Quando desejamos verificar se uma variável é IGUAL a outra
    // != Quando desejamos verificar se uma variável é DIFERENTE da outra
    // > Quando desejamos verificar se uma variável é MAIOR QUE a outra
    // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra
    // < Quando desejamos verificar se uma variável é MENOR QUE a outra
    // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra

        
    int numero1 = 1;
    int numero2 = 2;

    String nomeUm = "Luiz";
    String nomeDois = new String("Luiz");

        /*System.out.println(nomeUm == nomeDois);*/

        //Para comparar se objetos e strings são iguais é necessário utilizar o metodo equals
    
        System.out.println(nomeUm.equals(nomeDois));



            /*boolean simNao = numero1 == numero2;
                System.out.println("numero1 é igual a numero2? " + simNao);

            simNao = numero1 != numero2;
                System.out.println("numero1 é diferente do numero2? " + simNao);

            simNao = numero1 > numero2;
                System.out.println("numero1 é maior do que numero2? " + simNao);
            simNao = numero1 < numero2;
                System.out.println("numero1 é menor do que numero2? " + simNao);*/ 
    //Os operadores relacionais servem para retornar se uma determinada condição é verdadeira ou não
            /*if(numero1 < numero2) {
                System.out.println("A nossa condição é verdadeira");
        }*/




    }
}
