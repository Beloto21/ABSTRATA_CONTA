package Contas;

// classe Main pra fazer o teste
public class Main {
    public static void main(String[] args) {
    	
    	
    	// instanciando as classes ContaCorrete e a ContaPoupanca
    	ContaCorrente cc = new ContaCorrente(200.0, 50.0);
        ContaPoupanca cp = new ContaPoupanca(3000.0);
        
        // chamando os metodos 
        System.out.println("---- Conta Corrente ----");
        
        cc.consultarSaldo();
        cc.depositar(250.0);
        cc.sacar(50.0);
        cc.consultarSaldo();

        System.out.println("");
        
        // chamando os metodos 
        System.out.println("---- Conta Poupança ----");
        
        cp.consultarSaldo();
        cp.depositar(2000.0);
        cp.sacar(100.0);
        cp.consultarSaldo();
    }
}