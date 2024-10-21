package Contas;

// classe abastrata com heranca de outra classe "ContaBancaria"
public class ContaPoupanca extends ContaBancaria {
	
	// atributos da ContaCorrente
    private final double taxaSaque = 4.0;
    private final double taxaDeposito = 1.5;
    private final double taxaConsulta = 0.5;
    
    // construtor de outra classe "ContaCorrente"
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    // metodo de sacar 
    @Override
    public void sacar(double valor) {
    	
        double totalComTaxa = valor + taxaSaque;
        if (saldo >= totalComTaxa) {
        	
            saldo -= totalComTaxa;
            System.out.println("R$ " + valor + " Saque feito com sucesso. Taxa: R$ " + taxaSaque);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // metodo de depositar 
    @Override
    public void depositar(double valor) {
    	
        saldo += valor - taxaDeposito;
        System.out.println("R$ " + valor + " Deposito realizado com sucesso. Taxa: R$ " + taxaDeposito);
    }
    
 	// metodo consultarSald 
    @Override
    public void consultarSaldo() {
    	
        saldo -= taxaConsulta;
        System.out.println("Saldo disponível da conta: R$ " + saldo + ". Taxa: R$ " + taxaConsulta);
    }
}