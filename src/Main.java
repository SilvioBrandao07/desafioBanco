import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Cliente Brandao = new Cliente();
        Brandao.setNome("Brandao");

        Conta corrente = new ContaCorrente(Brandao);

        corrente.depositar(500);


        Conta poupanca= new ContaPoupanca(Brandao);

        corrente.trasferir(200, poupanca);

        poupanca.depositar(500);
        poupanca.sacar(20);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();



        }
    }
