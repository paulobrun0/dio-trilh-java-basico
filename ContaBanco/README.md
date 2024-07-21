
# Conta Bancária - Projeto Java

## Descrição
Este projeto é um simples aplicativo de terminal em Java que simula a criação de uma conta bancária. O usuário insere seu nome, número da agência, número da conta e saldo inicial. Com base nessas informações, o programa cria uma instância da classe `CriarConta` e exibe uma mensagem de boas-vindas com os detalhes da conta.

## Estrutura do Projeto

- `CriarConta.java`: Classe que representa a conta bancária. Contém os atributos do cliente, métodos para inicialização e um método para exibir uma mensagem de boas-vindas.
- `ContaTerminal.java`: Classe principal que interage com o usuário através do terminal, captura as informações necessárias e utiliza a classe `CriarConta` para criar uma nova conta.

## Funcionalidades

1. Captura de informações do usuário:
   - Nome do cliente
   - Número da agência
   - Número da conta
   - Saldo inicial

2. Criação de uma conta bancária utilizando as informações fornecidas.

3. Exibição de uma mensagem de boas-vindas com os detalhes da conta criada.

## Como Executar

1. Certifique-se de ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado em seu sistema.

2. Clone o repositório ou baixe os arquivos do projeto.

3. Navegue até o diretório do projeto e compile os arquivos Java:
   ```sh
   javac CriarConta.java ContaTerminal.java
   ```

4. Execute o programa:
   ```sh
   java ContaTerminal
   ```

5. Siga as instruções no terminal para inserir os detalhes da conta.

## Exemplo de Execução

```sh
Digite seu nome:
João Silva
Olá, João Silva. Por favor, digite o número da agência:
1234
Olá, João Silva. Por favor, digite o número da conta:
567890
Olá, João Silva. Por favor, digite o seu saldo inicial:
1500.50
Olá João Silva, obrigado por criar uma conta em nosso banco. Sua agência é 1234, conta 567890 e seu saldo 1500.5 já está disponível para saque.
```

```

## Contribuição

Sinta-se à vontade para contribuir com este projeto. Você pode abrir issues para relatar bugs ou sugerir melhorias, e enviar pull requests para adicionar novas funcionalidades ou corrigir problemas.
