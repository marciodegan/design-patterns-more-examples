## Command Pattern

>O Padrão Command encapsula uma solicitação como um objeto, o que lhe permite parametrizar outros objetos (ex.: cliente) com diferentes solicitações,
enfileirar ou registrar solicitações e implementar recursos de cancelamento (undo()) de operações.

* O objeto de comando *encapsula um solicitação* vinculando um conjunto de ações em um receptor específico.
* Para fazer isso ele empacota as ações e o receptor em um objeto que expõe um único método, execute().
* Quando execute() é chamado, as ações são invocadas no receptor.
* Externamente, nenhum outro objeto sabe realmente quais ações são executadas em qual receptor; 
eles apenas sabem que suas solicitações são atendidas quando o método execute() é acionado.

#### Some straight-forward references from the book Head First Design Patterns:

<img src="https://user-images.githubusercontent.com/58707950/140544735-2e2d5f8d-f3cc-402c-8369-40c3492b0334.PNG" width="13%"></img> 
<img src="https://user-images.githubusercontent.com/58707950/140544733-bdf88ec5-de27-4c40-8008-1e7a8a949f9f.PNG" width="13%"></img> 
<img src="https://user-images.githubusercontent.com/58707950/140544739-db1fac60-9f55-4bca-9d4a-1f04716f559e.PNG" width="13%"></img>  


- Via de regra devemos tentar criar objetos de comando "burros" que apenas invoquem uma ação num receptor.
- Existem muitos exemplos de objetos de comando "inteligentes" que implementam a maior parte ou até toda a lógica necessária p/ atender uma solicitação.
- Nada o impede de fazer isso, mas lembre-se de que você não terá o mesmo nível de desconexão entre invocador e receptor, 
- nem poderá parametrizar os seus comando com receptores.


### Mais usos do Padrão Command: "enfileirando solicitações"
- Os comandos nos oferecem uma maneira de "empacotar" uma sequência de computations (um receptor e um conjunto de ações) e passá-la adiante como um objeto de primeira classe.
- Quando isso é feito, a computação propriamente dita pode ser invocada muito tempo depois de o aplicativo-cliente criar o objeto de comando.
- De fato, ela pode até ser invocada por outra sequência de processamento. Essa característica permite o seu emprego em muitas aplicações úteis, como temporizadores, pools de processamento e filas de tarefas, entre outras.

### Mais usos do Padrão Command: "registrando solicitações"
- A semântica de certas aplicações exige que todas as ações sejam registradas para poderem ser reinvocadas como parte do processo de reucpacao de falhas.
- O padrão Command pode suportar essa semântica através do acréscimo de dois métodos: store() e load().
- Enquanto os comandos são executados, armazenamos em disco um histórico da sua execução. Quando ocorre uma falha, recarregamos os objetos de comando e invocamos seus métodos execute() em lote e em sequencia.
- Em aplicações cujas ações afetam grandes estruturas de dados que não podem ser salvas cada vez que sofrem alguma alteração, podemos criar um histórico dessas ações, e salvar todas as operações executadas desde o último ponto de controle e, caso haja alguma falha do sistema, reaplicar essas operações aos dados na forma em que estavam no ponto de controle.


Another example of Command Pattern: https://github.com/marciodegan/design-pattern-command