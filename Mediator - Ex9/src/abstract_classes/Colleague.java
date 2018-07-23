package abstract_classes;

import interfaces.Mediator;

public abstract class Colleague {

    private Mediator mediator;
    protected Double saldo;
    protected String nome;

    public Colleague(Mediator m){
        this.mediator = m;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void realizarTransferencia(Double valor, Colleague destino){
        this.saldo -= valor;
        this.mediator.realizar(valor, this, destino);
    }

    public abstract void receberTransferencia(Double valor, Colleague origem);
}
