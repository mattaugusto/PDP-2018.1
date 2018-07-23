package classes;

import abstract_classes.Colleague;
import interfaces.Mediator;

public class BancoDoBrasil extends Colleague {

    public BancoDoBrasil(Mediator m, Double saldo){
        super(m);
        this.nome = "Banco do Brasil";
        this.saldo = saldo;
    }

    @Override
    public void receberTransferencia(Double valor, Colleague origem){
        System.out.println("BB recebeu R$" +valor+". " + "Transferência realizada por "+origem.getNome()+".");
        System.out.println("Saldo antes da transferência: " + this.saldo);
        this.saldo += valor;
        System.out.println("Saldo após transferência: " + this.saldo);
    }
}
