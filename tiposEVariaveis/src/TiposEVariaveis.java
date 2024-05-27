public class TiposEVariaveis {
    public static void main(String[] args) throws Exception {
       double salarioMinimo = 2500;

       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

            System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI = 10.75; 
        // Para variáveis não serem alteradas
        // será necessário utilizar o termo final 
        // antes de declarar e atribuir um valor a variável
        // É necessário ainda que a variável seja declarada toda em maiúscula
        // Constantes sempre são declarados em maiúscula

        String meuNome = "Luiz";
        String minhaCidade = "São Gonçalo";
        String meuHobby = "Tocar violão";

        int minhaIdade = 30;

        System.out.println(meuNome);
        System.out.println(minhaIdade);
        System.out.println(meuHobby);
        System.out.println(minhaCidade);
    }
}
