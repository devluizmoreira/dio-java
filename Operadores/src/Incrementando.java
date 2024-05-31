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

        //A mesma regra para decrementar, utilizando o operador -
        numero --;

        //Ou imprimindo direto na tela
            System.out.println(-- numero);

        //Valores Booleanos

        boolean variavel = true;

        //Para negar o valor da variavel booleana criada
        //basta utilizar o operador !

        System.out.println(!variavel);

        //Quando a alteração ocorre somente no comando
        //de imprimir, fica restrita a memória
        //O valor da variável continua sendo o mesmo
        //Nesse caso, "true".

        System.out.println(variavel);

        //Para alterar o valor da variável booleana
        //permanentemente, usamos:

        variavel = !variavel;
            System.out.println(variavel);

    }
}
