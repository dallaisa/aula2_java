A arquitetura utilizada é monolítica em camadas e orientada a objetos.

É monolítica porque toda a aplicação está dentro do mesmo projeto e executa no mesmo processo, sem separação em serviços independentes.

É em camadas porque há divisão clara entre domínio, serviços, aplicação e interface, cada uma com responsabilidades específicas.

Também é orientada a objetos, pois utiliza classes, encapsulamento, interfaces e polimorfismo para organizar o sistema.

Não é orientada a serviços ainda, pois não há comunicação com serviços externos. Porém, a estrutura atual já facilita uma futura evolução para esse modelo.

Parte 1 — Implementação

O método addScore foi implementado para somar pontos ao jogador, garantindo que a pontuação não fique negativa. Depois, a regra de pontuação foi movida para um ScoreService, deixando o Player apenas como entidade de domínio.

Foi criada a classe AdvancedMissionValidatorService, que valida a missão apenas quando a dificuldade é par. Isso permite usar diferentes estratégias de validação sem alterar o GameEngine.

Parte 2 — Refatoração Arquitetural

O GameEngine passou a depender de interfaces e recebe MissionValidatorService e ScoreService via construtor. Assim, o sistema fica desacoplado e preparado para trocar implementações sem modificar a lógica principal.

Arquitetura

A aplicação é monolítica em camadas e orientada a objetos. É monolítica porque roda em um único sistema, em camadas porque separa domínio, serviço, aplicação e interface, e orientada a objetos pelo uso de classes, interfaces e polimorfismo. A estrutura já está preparada para evoluir para SOA no futuro.
