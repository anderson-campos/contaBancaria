public class contaBancaria {
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    String titular;
    int saldo;

    public contaBancaria(String titular, int saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public int depositar(int novoDeposito){
        saldo += novoDeposito;
        return saldo;
    }

    public int sacar(int novoSaque){
        saldo -= novoSaque;
        return saldo;
    }
}
