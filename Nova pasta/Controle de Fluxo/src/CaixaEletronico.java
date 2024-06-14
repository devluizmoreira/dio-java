public class CaixaEletronico {

    public static void main(String[] args) {
        
        double saldo = 25.0;
        double saque = 30.0;

    
        if (saque < saldo){
            saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso!" + " " + "Seu saldo atual é:" + " " + saldo);
        }else    
            System.out.println("saldo insuficiente para saque!" + "Seu saldo atual é:" + " " + saldo);

   
    }

}