### AkrayAS
- Lista 01 - 03/03/2020
- Lista 02 - 06/03/2020
    - Exercício 01 não está correto. Veja a organização de classes em pacotes e a implicação disso para compilar e executar.
    - Exercício 2.01. Losango com 3 linhas não está correto.
    - Exercício 2.03. Resumo não está completamente correto.
        - Entrada: `10 10 2 3 4 5 6 7 8 9 11 0 2`
```
Total de números únicos: 11
Número com o maior número de repetições: 10
Total de números pares: 6
Total de números impares: 5
Total de números primo: 6
```
- Lista 03 - 13/03/2020
    
    - ok
    
- Lista 04 - 18/03/2020
    - Exercício 01
        - Método `setWidth` não está correto
        - Métodos desenhar compartilham lógica. Logo, será possível refatorar isso para evitar duplicidade.
    - Exercício 02
         - Está fazendo uso de literais espalhas pelo código
    
- Lista 05 - 01/04/2020

    - Exercício 01

        - Não foi possível adicionar pessoa

            - ```
                ----MENU----
                1 - Adiciona Pessoa
                2 - Remove Pessoa
                3 - Adiciona Telefone
                4 - Adicona Email
                5 - Atualiza Telefone
                6 - Atualiza Email
                7 - Remove Telfone
                8 - Remove Email
                9 - Mostrar na tela
                Pressione Qualquer outro botão para sair.
                ---- ----
                1
                Insira o nome:
                abc
                Insira o sobrenome:
                def
                Insira a data de nascimento (dd/mm/yyyy):
                10/20/2011
                Input errado.
                10/10/2011
                Input errado.
                10/10/1900
                Input errado.
                ```

        - O método `remove` da HashMap usada na classe Email retorna String associada com a chave, se a chave existir, ou retorna `null`. A lógica dentro do método `remove` da classe Email está equivocada. O mesmo para classe Telefone

        - Uso indevido de `try...catch` em diversos métodos, por exemplo, todos da classe Pessoa

    - Exercíco 02

        - A classe `Coordenada` não está representando uma coordenada, pois a lógica de altitude e mover são lógicas para o Drone e não para coordenada. Coordenada deveria representar uma coordenada no plano cartesiano e só. O teu plano de voo, na classe Principal, poderia ser um ArrayList de Coordenadas. 

        - A movimentação com o plano de voo é por coordenadas e não por direção, como fora feito no exercício do Robô Explorador.

        - Erro na execução do aplicativo

            - ```
                ---- Menu ----
                1 - Decolar 
                2 - Alterar Altitude
                3 - Mover Drone
                4 - Obter posição do Drone
                5 - Obter porcentagem da bateria.
                6 - Capturar foto
                7 - Carregar Plano
                8 - Voo Autonomo
                9 - Trocar o tipo de Camera
                10 - Alterar a velocidade de Rotação
                11 - Voltar Drone a Origem
                Pressione Qualquer botão para sair.---- ----
                1
                Sucesso ao decolar.
                1
                Erro.
                2
                Cima ou Baixo: 
                cima
                Valor: 
                1
                Erro.
                
                Input Errado.
                Cima
                Input Errado.
                1
                Erro.
                1
                Erro.
                ```

