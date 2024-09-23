# Sistema Bancário em Java

Este é um programa simples de sistema bancário desenvolvido em Java que permite ao usuário consultar o saldo, receber e transferir valores entre uma Conta Corrente e uma Conta Poupança. O sistema inclui uma verificação de senha para realizar transferências de forma segura.

## Funcionalidades

- **Consulta de saldo**: Verifica o saldo disponível em uma Conta Corrente ou Poupança.
- **Recebimento de valor**: Adiciona um valor ao saldo da Conta Corrente ou Poupança.
- **Transferência de valor**: Permite a transferência de valores, verificando saldo suficiente e senha correta.
- **Validação de entradas**: Certifica que os valores informados sejam válidos e positivos.

## Pré-requisitos

Para rodar este projeto, você precisa ter instalado:

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Um editor de código ou IDE, como o [Eclipse](https://www.eclipse.org/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Como Executar

1. Clone o repositório ou baixe os arquivos para sua máquina local.

2. Compile o arquivo `Main.java` usando um dos comandos abaixo, dependendo do seu sistema operacional:

    ```bash
    javac Main.java
    ```

3. Após a compilação, execute o programa com:

    ```bash
    java Main
    ```

4. O programa solicitará que você insira seu nome, senha e escolha entre Conta Corrente ou Poupança para realizar operações bancárias.

<h4>Segue abaixo um exemplo de uso:</h4>  

![Desktop 2024 09 23 - 15 16 53 02](https://github.com/user-attachments/assets/f0eab451-4d1b-4b3c-a297-cc9d35dd7021)

## Exemplo de Uso

Ao executar o programa, você verá o seguinte fluxo:

```text
Digite seu nome:
João

Digite sua senha (contendo somente números):
1234

Selecione uma opção:
1 - Conta Corrente
2 - Poupança
1

*****************************************
Nome: João
Tipo Conta: Conta Corrente
Saldo: R$2500.00
*****************************************

Operações:
1 - Consultar Saldos
2 - Receber Valor
3 - Transferir Valor
4 - Sair
```

## Colaboradores

- [Gabrielly Barbosa da Silva](https://github.com/gabriellybarbosasilva)



Esse `README` cobre as principais informações sobre o funcionamento, execução e possíveis melhorias para o programa.


