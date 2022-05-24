import java.security.Principal;

public class ContaCorrente extends ContaBancaria{


@Override
public void sacar(Double valor){

    if(super.getSaldo() > valor){
        Double saque = super.getSaldo() - valor;

        Double taxa = saque*0.005;

        Double saque_final = saque - taxa;
        super.setSaldo(saque_final);
    }else{
        System.out.println("Saldo insuficiente");
    }
    
}

public  void depositar(Double valor){
        super.setSaldo(valor);
}


public  void saldo(){
    System.out.println("O saldo na conta corrente é de: "+this.getSaldo());
}

    
}
