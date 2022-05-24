public abstract class ContaBancaria {
    
    private String cliente;
    private int numero_conta;
    private Double saldo;

    public abstract void sacar(Double valor);
    public abstract void depositar(Double valor);
    public abstract void saldo();


    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero_conta() {
        return this.numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
