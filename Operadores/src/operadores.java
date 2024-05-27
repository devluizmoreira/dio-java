public class operadores {
    public static void main(String[] args) {
        
        //Operador de atribuição é representado por =
        String nome = "Luiz";
        int idade = 30;
        double peso = 130.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
    
        //Operadores Aritiméticos +, -, *, /, %
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20*7;
        int divisao = 15/3;
        int modulo = 18%3;
        double resultado = (10*7) + (20/4);

        

        // A utilização do operador + em variáveis string realizará a concatenação das palavras
        String nomeCompleto = "Luiz" + " " + "Moreira";
        System.out.println(nomeCompleto);

        //Concatenação de números e caracteres 
        String concatenacao = "?";
        
        //Enquanto temos apenas números na expressão o operador funciona como adição
        //Após aparecer um caracter o operador concatena o restante dos valores na expressão        
            concatenacao = 1+1+1+"1";
                System.out.println(concatenacao);
                
        //Ao aparecer um caracter logo no inicio o resultado do restante da operação
        //Será uma string concatenada  
        // Segue nos 3 próximos exemplos                
            concatenacao = 1+"1"+1+1;
                System.out.println(concatenacao);
            concatenacao = 1+"1"+1+"1";
                System.out.println(concatenacao);
            concatenacao = "1"+1+1+1;
                System.out.println(concatenacao);
        //Nesse caso, como aparece uma expressão separada, o resultado é a concatenação
        //Do primeiro valor com o resultado da soma do que está em parenteses
            concatenacao = "1"+(1+1+1);
                System.out.println(concatenacao);
    }   
}
