package classes;

import abstract_classes.Colleague;
import interfaces.Mediator;

public class Itau extends Colleague {

    public Itau(Mediator m, Double saldo){
        super(m);
        this.nome = "Itaú";
        this.saldo = saldo;
    }

    @Override
    public void receberTransferencia(Double valor, Colleague origem){
        System.out.println("Itaú recebeu R$" +valor+". " + "Transferência realizada por "+origem.getNome()+".");
        System.out.println("Saldo antes da transferência: " + this.saldo);
        this.saldo += valor;
        System.out.println("Saldo após transferência: " + this.saldo);
    }
}
