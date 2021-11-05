## Command Pattern

>O Padrão Command encapsula uma solicitação como um objeto, o que lhe permite parametrizar outros objetos com diferentes solicitações,
enfileirar ou registrar solicitações e implementar recursos de cancelamento de operações.

* O objeto de comando *encapsula um solicitação* vinculando um conjunto de ações em um receptor específico.
* Para fazer isso ele empacota as ações e o receptor em um objeto que expõe um único método, execute().
* Quando execute() é chamado, as ações são invocadas no receptor.
* Externamente, nenhum outro objeto sabe realmente quais ações são executadas em qual receptor; 
eles apenas sabem que suas solicitações são atendidas quando o método execute() é acionado.

#### Some references from the book Head First Design Patterns:

<img src="https://user-images.githubusercontent.com/58707950/140544735-2e2d5f8d-f3cc-402c-8369-40c3492b0334.PNG" width="23%"></img> 
<img src="https://user-images.githubusercontent.com/58707950/140544733-bdf88ec5-de27-4c40-8008-1e7a8a949f9f.PNG" width="23%"></img> 
<img src="https://user-images.githubusercontent.com/58707950/140544739-db1fac60-9f55-4bca-9d4a-1f04716f559e.PNG" width="23%"></img>


