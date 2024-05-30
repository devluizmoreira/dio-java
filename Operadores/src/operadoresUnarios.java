public class operadoresUnarios {
    
    public static void main(String[] args) {
        
        //Declarando uma variável positiva e exibindo como negativa
        //Esse processo não altera a variável para negativa
            int numero = 5;
                System.out.println(- numero);
             System.out.println(numero);

        //Para transformar um número positivo em negativo
            numero = - numero;  
                System.out.println(numero);

        //Para tornar um número negativo em positivo
            numero = numero * -1;
                System.out.println(numero);

    }
}
