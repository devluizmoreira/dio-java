public class Comentarios {
    
    public static void main(String[] args) {
        
        //Comentário em uma única linha

        /*Mult Line - 
         * Quando for preciso
         * utilizar comentários
         * mais detalhados.
        */
    }

        /**
         * Começando com duas estrelas
         * identifica um comentário
         * elaborado á nível
         * de documentação.
         */
         public void metodoExemplo(){

         }

         /*
          * Este método foi elaborado as pressas
          * por isso eu abreviei o nome das variáveis 
          * mas olha, ele tem a finalidade de somar ou multiplicar dois números.
          */
         public int somaMultiplica (int n, int x, String m) {

            int r = 0; // r é igual ao resultado - Seria muito melhor utilizar uma variável com nome "resulado"
            if (m == "M") { //M = multiplicação
                r = n * x;
            }else{
                // se não, somente soma
                r = n + x;
            }

            return r;
        }

        /*
         * Os comentários não servem como muleta para a não utilização correta e legível do código.
         * Devemos ter todo cuidado e utilizar as convenções corretas para que o nosso código
         * seja legível e limpo,
         * sem a necessidade de um comentário para explicação de cada linha.
         */



}
