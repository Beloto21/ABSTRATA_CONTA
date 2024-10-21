package Contas;

// classe abastrata 
public abstract class ContaBancaria {
	
	// atributo da classe 
    protected double saldo;
    
    // construtor da classe 
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // metodos da classe 
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void consultarSaldo();
    
    // metodo Getter
    public double getSaldo() {
        return saldo;
    }
}