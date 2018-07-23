package main;

import classes.*;

public class Main {

    public static void main(String[] args) {
        TransferenciaMediator mediator = new TransferenciaMediator();

        BancoDoBrasil bb = new BancoDoBrasil(mediator, 5000.00);
        Bradesco bradesco = new Bradesco(mediator,5000.00);
        CaixaEconomicaFederal caixa = new CaixaEconomicaFederal(mediator,5000.00);
        Itau itau = new Itau(mediator,5000.00);

        mediator.adicionarColleague(bb);
        mediator.adicionarColleague(bradesco);
        mediator.adicionarColleague(caixa);
        mediator.adicionarColleague(itau);

        bb.realizarTransferencia(100.00, bradesco);
        System.out.println();
        itau.realizarTransferencia(500.00, caixa);
        System.out.println();
        bradesco.realizarTransferencia(50.00, caixa);
        System.out.println();
        caixa.realizarTransferencia(400.00, bb);
        System.out.println();

        // ADICIONANDO NOVO BANCO
        NuBank nu = new NuBank(mediator,5000.00);

        // ERRO DE BANCO NÃO CADASTRADO
        nu.realizarTransferencia(1000.00, itau);
        System.out.println();
        
        mediator.adicionarColleague(nu);
        nu.realizarTransferencia(1000.00, itau);
        System.out.println();
        caixa.realizarTransferencia(400.00, nu);
        System.out.println();
    }
}
