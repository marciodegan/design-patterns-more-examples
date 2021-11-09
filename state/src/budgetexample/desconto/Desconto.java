package budgetexample.desconto;

import budgetexample.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    // protected - classes-filhas conseguem acessar atributo.
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    // com método abstract, toda classe filha implementa método
    // método se torna publico e não mais abstrato. chama o deveAplicar que é abstrato, mas nas classes filhas ele é implementado
    public BigDecimal calcular(Orcamento orcamento){
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        BigDecimal prox = proximo.calcular(orcamento);
        return proximo.calcular(orcamento);
    };

    // protected - p/ que nao seja exposto para quem tiver chamando a classe
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);

    }
