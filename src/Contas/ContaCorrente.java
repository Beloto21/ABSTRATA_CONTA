package Contas;

// classe abastrata com heranca de outra classe "ContaBancaria"
public class ContaCorrente extends ContaBancaria {
	
	// atributos da classe 
    private double limite;
    private final double taxaSaque = 7.0;
    private final double taxaDeposito = 3.0;
    private final double taxaConsulta = 1.0;

    // construtor da classe 
    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    // metodo de sacar 
    @Override
    public void sacar(double valor) {
    	
        double totalComTaxa = valor + taxaSaque;
        if (saldo + limite >= totalComTaxa) {
        	
            saldo -= totalComTaxa;
            System.out.println("R$ " + valor + " Saque realizado com sucesso. Taxa: R$ " + taxaSaque);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // metodo de depositar 
    @Override
    public void depositar(double valor) {
    	
        saldo += valor - taxaDeposito;
        System.out.println("R$ " + valor + " Depositovrealizado com sucesso. Taxa: R$ " + taxaDeposito);
    }
    
    // metodo consultarSaldo 
    @Override
    public void consultarSaldo() {
    	
        saldo -= taxaConsulta;
        System.out.println("Saldo disponível da conta: R$ " + saldo + ". Taxa: R$ " + taxaConsulta);
    }
}