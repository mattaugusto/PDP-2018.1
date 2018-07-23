package classes;

import abstract_classes.Colleague;
import interfaces.Mediator;

public class CaixaEconomicaFederal extends Colleague {

    public CaixaEconomicaFederal(Mediator m, Double saldo){
        super(m);
        this.nome = "Caixa Econômica Federal";
        this.saldo = saldo;
    }

    @Override
    public void receberTransferencia(Double valor, Colleague origem){
        System.out.println("Caixa Econômica Federal recebeu R$" +valor+". "
                + "Transferência realizada por "+origem.getNome()+".");
        System.out.println("Saldo antes da transferência: " + this.saldo);
        this.saldo += valor;
        System.out.println("Saldo após transferência: " + this.saldo);
    }
}
