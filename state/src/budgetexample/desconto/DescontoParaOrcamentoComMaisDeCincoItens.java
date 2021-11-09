package budgetexample.desconto;

import budgetexample.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply((new BigDecimal("0.1")));

        // sai o return do "proximo", pois já está sendo chamado na classe mãe. Fazendo só a regra do desconto.
        // return proximo.calcular(orcamento);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
