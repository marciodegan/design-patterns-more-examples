## State Pattern
### Adicionando fuature de Desconto Extra.

- Esse desconto extra vai estar relacionado ao Orçamento.
- Criado novo pacote de situações(Aprovado, EmAnalise, Reprovado, Finalizado)
- Criada uma classe-mae "SituacaoOrcamento" que será uma classe abstrata.
- Na classe Orcamento, o novo atributo agora será SituaçãoOrcamento.
- Criada uma classe DomainException que herda de RuntimeException.
- Para lidar com situações inválidas, por exemplo, a classe Aprovado - se entrar no método aprovar, deve lançar uma exceção.
- Na classe SituaçãoOrcamento conterá todos os métodos para transitar estados (aprovar, reprovar, finalizar...) e nas classes-filhas somente os métodos permitidos serão sobrescritos.
- Os métodos que não são permitidos, serão herdados da classe-mae, que lançam exceção.
- Na classe Orcamento, terá agora um método setSituacao e getSituacao.
- O padrão State, assim como o padrão Strategy, resolve o problema de muitos ifs no código.

- O padrão State é utilizado quando temos uma transição de estados ou quando precisamos aplicar alguma regra, algum algoritmo baseado num estado de um objeto/classe.
- É parecido com Strategy para resolver o problema dos ifs/elses, porém baseados no estado(state).
- Também quando tem uma regra de transição de estados. No caso, foi aplicado uma regra de desconto extra...em que o valor do desconto extra vai variar de acordo com a situação do objeto orcamento.
- Foi transformada a "situação" em uma classe, que será uma classe abstrata, funcionando como uma casca, um modelo para cada uma das situaçoes possiveis.
- Cada uma das situações é herdada da classe-mãe.
- É possível que um objeto se comporte de formas diferentes, dependendo do seu estado;
- Se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual:
