package classes;

import abstract_classes.Colleague;
import interfaces.Mediator;

public class Bradesco extends Colleague {

    public Bradesco(Mediator m, Double saldo){
        super(m);
        this.nome = "Bradesco";
        this.saldo = saldo;
    }

    @Override
    public void receberTransferencia(Double valor, Colleague origem){
        System.out.println("Bradesco recebeu R$" +valor+". " + "Transferência realizada por "+origem.getNome()+".");
        System.out.println("Saldo antes da transferência: " + this.saldo);
        this.saldo += valor;
        System.out.println("Saldo após transferência: " + this.saldo);
    }
}
