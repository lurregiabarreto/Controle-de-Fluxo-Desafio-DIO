# DesafioControleFluxo

## Descrição

O **DesafioControleFluxo** é um projeto simples em Java que ilustra o uso de controle de fluxo, especificamente com loops `for` e exceções customizadas. O programa solicita ao usuário que insira dois números inteiros via terminal. Em seguida, imprime uma sequência de números incrementados com base na diferença entre os dois números, ou lança uma exceção se o primeiro número for maior que o segundo.

## Tecnologias Utilizadas

- **Java 17**: A versão do Java utilizada para o desenvolvimento deste projeto.
- **IDE**: Qualquer IDE que suporte Java (IntelliJ IDEA, Eclipse, VS Code, etc.).
- **Terminal/Prompt de Comando**: Utilizado para executar o programa e interagir com o usuário.

## Pré-requisitos

- **Java 17** instalado no seu sistema.
- Um ambiente de desenvolvimento configurado para compilar e executar código Java.

## Como Configurar o Projeto

1. **Clone o Repositório**: Clone o repositório do projeto na sua máquina local ou crie um arquivo `Contador.java` e `ParametrosInvalidosException.java` com o código fornecido.

2. **Verifique a Instalação do Java**: Certifique-se de que o Java 17 está instalado. Você pode verificar a instalação executando:

   ```bash
   java -version
   ```

   Se o Java não estiver instalado, faça o download e a instalação do Java 17 através do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

## Como Executar o Projeto

Siga os passos abaixo para compilar e executar o programa.

### Passos para Compilação e Execução

1. **Navegue até o diretório do projeto**: Abra o terminal ou prompt de comando e vá até o diretório onde os arquivos `Contador.java` e `ParametrosInvalidosException.java` estão localizados.

   ```bash
   cd caminho/para/o/projeto
   ```

2. **Compile o código**: Compile os arquivos `.java` utilizando o comando `javac`:

   ```bash
   javac Contador.java ParametrosInvalidosException.java
   ```

   Esse comando criará arquivos `.class` no mesmo diretório.

3. **Execute o programa**: Para rodar o programa, use o comando `java`:

   ```bash
   java Contador
   ```

4. **Interaja com o programa**: Siga as instruções exibidas no terminal para inserir as informações solicitadas. Por exemplo:

   ```
   Digite o primeiro parâmetro:
   12
   Digite o segundo parâmetro:
   30
   ```

   Após inserir os números, o programa imprimirá a sequência de números ou exibirá uma mensagem de erro se o primeiro número for maior que o segundo.

### Como Testar o Projeto

1. **Teste com Números Válidos**: Insira um número menor primeiro e um número maior depois (ex: `12` e `30`). O programa deve imprimir "Imprimindo o número 1" até "Imprimindo o número 18".

2. **Teste com Números Inválidos**: Insira um número maior primeiro e um número menor depois (ex: `30` e `12`). O programa deve lançar a exceção `ParametrosInvalidosException` e exibir a mensagem: "O segundo parâmetro deve ser maior que o primeiro".

