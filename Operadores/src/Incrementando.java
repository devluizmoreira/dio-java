public class Incrementando {
    public static void main(String[] args) {
        
        //Geralmente utilizados em operações de repetição

        int numero = 5;

        //Estrutura de repetição x
        numero = numero + 2;
            System.out.println(numero);

        //Caso quisesse incrementar apenas +1 em cada
        //repetição não é necessário utilizar a estrutura
        //acima. Podendo abreviar a expressão para:
        numero++;
            System.out.println(numero);

        //Para imprimir diretamente com a incrementação
        //é possível antecipando o operador de incremento
            System.out.println(++ numero);  
    }
}
