package abstract_classes;

import interfaces.Mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator m){
        mediator = m;
    }

    public void realizarTransferencia(Double valor, String mensagem, Colleague colleague){
        mediator.realizar(valor, mensagem, colleague);
    }

    public abstract void receberTransferencia(Double valor, String mensagem);
}
