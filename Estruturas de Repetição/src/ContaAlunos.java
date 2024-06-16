public class ContaAlunos {

    //utilizando arrays

    public static void main(String[] args) {
        
        //em arrays o indice de elementos inicia em ZERO
        String alunos[] = { "Luiz", "Matheus", "Luana", "Samara" };

        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos [x]);
        }
        
        //Forma Abreviada

        /*
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + alunos);
        }  
        */
    }
}