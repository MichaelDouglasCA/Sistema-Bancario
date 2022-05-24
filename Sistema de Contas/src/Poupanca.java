public class Poupanca extends ContaBancaria{
    private String dia_rendimento;

    public void calculaNovoSaldo(){
        Double novo = this.getSaldo()+this.getSaldo()*0.005;
        this.setSaldo(novo);
    }

    @Override
    public void sacar(Double valor){

        if(super.getSaldo() > valor){
            Double saque = super.getSaldo() - valor;
            super.setSaldo(saque);
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }

    @Override
    public  void depositar(Double valor){
        this.setSaldo(valor);
}
    @Override
    public void saldo(){
        System.out.println("O saldo na conta Poupanca é de: "+this.getSaldo());
    }
}
