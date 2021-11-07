## Facade Pattern

> O Padrão Facade fornece uma interface unificada para um conjunto de interfaces em um subsistema.
> A Fachada define uma interface de nível mais alto que facilita a utilização do subsistema

- Quando você tiver que usar uma classe existente cuja interface não é adequada para suas necessidades, use um ADAPTER.
- Quando você precisar simplificar e unificar uma interface grande ou um conjunto completo de interfaces, use um FACADE.
- Um ADAPTER converte a interface de uma classe para outra interface que os clientes esperam encontrar. Permite a operação conjunta de classes que não poderiam fazê-lo de outra maneira porque suas interfaces são incompatíveis.
- Uma FACADE desconecta um cliente de um subsistema complexo.
- A implementação de um ADAPTER pode exigir pouco ou muito trabalho, dependendo do tamanho e da complexidade da interface-alvo.
- A implementação da FACADE exige que componhamos a fachada com o seu subsistema e usemos delegação para executar o trabalho da fachada.
- O Padrão ADAPTER possui dois formatos: adaptador de objetos e adaptador de classes. Os adaptadores de classes exigem herança múltipla.
- É possível implementar mais de uma fachada para o mesmo subsistema.
- Um adapter envelopa um objeto para mudar sua interface
- Um DECORATOR envelopa um objeto para adicionar novos comportamentos e responsabilidades.
- Um FACADE envelopa um conjunto de objetos para simplificá-los.


<img src="https://user-images.githubusercontent.com/58707950/140626864-d3de5798-44cc-4d88-a44d-d1be5485fee8.PNG" width="11%"></img> 
<img src="https://user-images.githubusercontent.com/58707950/140626865-cfea4e53-472a-44d7-b587-b39823ca902f.PNG" width="11%"></img> 
<img src="https://user-images.githubusercontent.com/58707950/140626866-0c53e165-c24d-4a9f-8ba0-eb4125335d34.PNG" width="11%"></img>



Another example for Facade Pattern: https://github.com/marciodegan/design-pattern-facade