public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("======Extrato da conta Corrente======");
        super.imprimirInfoComuns(this.agencia, this.numero, this.saldo, this.cliente);
    }


}

