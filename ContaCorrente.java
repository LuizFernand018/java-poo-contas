package Exercicio_1;

public class ContaCorrente extends Conta {
    @Override
    String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public double sacar(double valor){
        if(getSaldo() >= valor + 1){
            double novoSaldo = getSaldo() - valor - 1;
            setSaldo(novoSaldo);
            return novoSaldo;
        }
        else{
            System.out.println("Saldo Insuficiente");
            return getSaldo();
        }
    }   
}
