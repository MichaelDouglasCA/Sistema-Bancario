import java.util.Scanner;  

public class App {
    public static void main(String[] args) throws Exception {

        // --------------- Poupanca ----------------
        
        Poupanca p1 = new Poupanca();

        p1.depositar(100.0);
        p1.sacar(30.0);
        //p1.saldo();
        //System.out.println(p1.getSaldo());


        // ----------------- Corrente -------------------
        ContaCorrente c1 = new ContaCorrente();

        c1.depositar(50.0);
        c1.sacar(30.0);
        //c1.saldo();
        
        // ----------------- Corrente Especial -------------------
        ContaCorrenteEspecial e1 = new ContaCorrenteEspecial();

        //e1.depositar(100.0);
        

        Scanner myObj = new Scanner(System.in); 
        


        System.out.println("Entre com o valor para depositar: ");
        String deposito = myObj.nextLine();
        e1.depositar(Double.parseDouble(deposito));


        System.out.println("Entre com o valor para Sacar: ");
        String saque = myObj.nextLine();
        e1.sacar(Double.parseDouble(saque));


        e1.saldo();


    }
}
