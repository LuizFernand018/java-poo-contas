public class ContaPoupanca extends Conta {
    @Override
    String getTipo(){
        return "Conta Poupanca";
    }

    @Override
    public double sacar(double valor){
        if(getSaldo() >= valor){
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            return novoSaldo;
        }
        else{
            System.out.println("Saldo Insuficiente");
            return getSaldo();
        }
    }
}
