public class ContaCorrenteEspecial extends ContaCorrente{
    public static final Double limite = -1000.0;

    @Override
    public void sacar(Double valor){

        if(this.getSaldo() > limite){

            Double saque = this.getSaldo() - valor;
    
            Double taxa = saque*0.001;
    
            Double saque_final = saque - taxa;
            if(saque_final>limite){
                this.setSaldo(saque_final);
            }else{
                System.out.println("Limite Indisponível");
            }
            
        }
    }

    @Override
    public  void saldo(){
        if(this.getSaldo()>0){
            System.out.println("O saldo na conta corrente especial é de: "+this.getSaldo());
        }
        else{
            System.out.println("Voce entrou no limite! O valor devedor é de: "+this.getSaldo());
        }

        
    }

}
