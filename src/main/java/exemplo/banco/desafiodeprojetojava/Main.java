package exemplo.banco.desafiodeprojetojava;

public class Main {
    public static void main(String[] args) {
        Cliente Emerson = new Cliente();
        Emerson.setNome("Emerson");

        Conta cc = new ContaCorrente(Emerson);
        Conta poupanca = new ContaPoupanca(Emerson);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
