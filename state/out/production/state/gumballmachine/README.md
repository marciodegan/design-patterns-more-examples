## State Pattern

>O Padrão State permite que um objeto altere o seu comportamento quando o seu estado interno muda.
>O objeto parecerá ter mudado de classe.
* Como o padrão encapsula os estados em classes separadas e delega as tarefas para o objeto que representa o estado atual,
* nós sabemos que os comportamentos mudam juntamento com o estado interno.
* *"O objeto parece mudar de classe"* => Considere isto o ponto de vista do cliente: se um objeto que você está usando pode mudar totalmente de comportamento,
* então terá a impressão de que uma nova instância do objeto foi criada a partir de outra classe.
* Na verdade, porém, estamos usando a composição para criar uma aparência de mudança de classe simplemente referenciando diferentes objetos de estado.

> O **princípio de Aberto/Fechado** propõe que entidades (classes, funções, módulos, etc.) 
> devem ser abertas para extensão, mas fechadas para modificação. 
> #### A entidade pode permitir que o seu comportamento seja estendido sem modificar seu código-fonte.


- ENCAPSULAR O QUE VARIA: Delimitar o comportamento de cada estado. Assim quando fizermos mudanca num estado, nao correremos o risco de afetar o restante do codigo.
- Se colocarmos o comportamento de cada estado dentro da sua proria classe, entao os estados individuais implementarão as suas próprias ações.
- A maquina delega tarefas ao objeto que representa o estado atual.
- Para Novos estados: cria-se uma nova classe e poucas modificações no código.
> #### Em vez de adaptar o codigo existente, vamos refazê-lo para que os objetos de estado estejam encapsulados em suas proprias classes e então delegar as operações à classe atual quando uma ação ocorrer.
> 1) Definir uma interface State contendo um método para cda acão da maquina.
> 2) Implementar a classe State para cada estado da máquina. Essas classes serão responsáveis pelo comportamento da maquina qdo ela estiver no estado correspondente
> 3) Removeremos todo o código condicional e, em vez disso, delegaremos as tarefas necessárias à classe do estado.
>
<img src="https://user-images.githubusercontent.com/58707950/141131310-0c8b0f83-349e-4581-aad6-918420788e7c.jpg" width="45%"></img> 