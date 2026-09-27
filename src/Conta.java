public class Conta {


    protected static final int AGENCIA_PADRAO = 1 ;
    private static int SEQUENCIAL = 1 ;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }




    public void sacar(double valor){
        saldo -= valor;

    }
    public void depositar(double valor){
        saldo += valor;

    }
    public void trasferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void imprimirExtrato(){

    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {return cliente;}


    protected static void imprimirInfoComuns(int agencia, int numero, double saldo, Cliente cliente) {
        System.out.println(String.format("Cliente: %s,", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero:  %d" , numero));
        System.out.println(String.format("Saldo: %.2f,", saldo));

    }

}


