package classes;

import abstract_classes.Colleague;
import interfaces.Mediator;

import java.util.ArrayList;

public class TransferenciaMediator implements Mediator {

    private ArrayList<Colleague> contatos;

    public TransferenciaMediator(){
        this.contatos = new ArrayList<Colleague>();
    }

    public void adicionarColleague(Colleague colleague){
        this.contatos.add(colleague);
    }

    private boolean isContato(Colleague colleague){
        for (Colleague contato: contatos){
            if(contato == colleague){
                return true;
            }
        }
        return false;
    }

    @Override
    public void realizar(Double valor, Colleague origem, Colleague destino){
        if(isContato(origem)){
            for (Colleague contato: contatos){
                if(contato == destino){
                    contato.receberTransferencia(valor, origem);
                }
            }
        }else{
            System.out.println("Banco não cadastrado no sistema!");
        }
    }
}
