public class Metodos {
    public static void main(String[] args) {
        
        //Variaveis e Métodos fazem parte da estrutura das classes
        //Variaveis seriam os atributos de determinada classe
        //E os metodos seriam funções ou subrotinas dentro das classes

        //Convenções gerais para métodos
        // Deve ser nomeado como verbo: Acelarar, Processar, Concluir
        //camelCase
        /*Exs: somar(int n1, int n2){}
               abrirConexao(){}
               concluirProcessamento() {}
               findById(int id) {}
               calcularImprimir(){} -- Apesar da sintaxe estar correta, um método deve ter apenas uma finalidade
                                        */  

        //Qual a proposta principal do método?
        //Qual o tipo de retorno esperado após executar o método?           
        //Caso o método não retorne nenhum valor ele será representado pela palavra-chave VOID
        //Quais parâmetros serão necessários para execução do método?
        //O método possui o risco de apresentar alguma exceção?
        //Qual a visibilidade do método?

        /* public class Myclass {

            public double somar (int num1, int num2) {
                //LOGICA - FINALIDADE DO MÉTODO
                return ...;
            }

            public void imprimir (String texto) {

                //LOGICA - FINALIDADE DO MÉTODO
                //AQUI NÃO PRECISA DE RETURN
                // POIS NÃO SERÁ RETORNARDO NENHUM RESULTADO
            }

            //MÉTODO DE EXCEÇÃO

            public double dividir(int dividendo, int divisor) throws Exception {}

            private void metodoPrivado(){

                - Este método não pode ser visto por outras classes

            }

        
            //Equivocos estruturais
            
            public void validar() {
                - Este método deveria retornar algum valor 
                - No caso um boolean (true ou false)
            }

            public void calcularEnviar() {
                - Um método deve representar uma única responsabilidade
            }

            public void gravarCliente(String nome, String cpf){
                - Esse método tem a finalidade de gravar informações de um cliente
                - Por que não criar um objeto cliente e passar como parâmetro?
            }

            Ex:

            public void gravarCliente(Cliente cliente){}
            ou
            public void gravar(Cliente cliente){}
            
        }
        
        */


    }
}
