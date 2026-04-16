package Exercicio_1;

public abstract class Conta {
    private int numero;
    private double saldo;

    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    abstract String getTipo();

    public void depositar(double valor){
        saldo += valor;
    }
    public abstract double sacar(double valor);
}
