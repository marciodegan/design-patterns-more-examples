## State Pattern

>O Padrão State permite que um objeto altere o seu comportamento quando o seu estado interno muda.
>O objeto parecerá ter mudado de classe.
* Como o padrão encapsula os estados em classes separadas e delega as tarefas para o objeto que representa o estado atual,
* nós sabemos que os comportamentos mudam juntamento com o estado interno.
* *"O objeto parece mudar de classe"* => Considere isto o ponto de vista do cliente: se um objeto que você está usando pode mudar totalmente de comportamento,
* então terá a impressão de que uma nova instância do objeto foi criada a partir de outra classe.
* Na verdade, porém, estamos usando a composição para criar uma aparência de mudança de classe simplemente referenciando diferentes objetos de estado.