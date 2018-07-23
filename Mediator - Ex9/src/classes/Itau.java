package classes;

import abstract_classes.Colleague;
import interfaces.Mediator;

public class Itau extends Colleague {

    private Double saldo;

    public Itau(Mediator m){
        super(m);
    }

    @Override
    public void receberTransferencia(Double valor, String mensagem){
        System.out.println("Itaú recebeu R$" +valor+"." + mensagem);
        System.out.println("Saldo antes da transferência: " + this.saldo);
        this.saldo += valor;
        System.out.println("Saldo após transferência: " + this.saldo);
    }

}
