# Keep — pom.xml

Este documento contém anotações de estudo sobre a estrutura e os conceitos de arquivos `pom.xml` utilizados em projetos Maven.

---

## Primeiro pom.xml

### Finalidade do elemento `<project>`

Define que o arquivo segue o padrão oficial do Maven.  
Permite que o Maven e as IDEs saibam como interpretar e validar o projeto.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
Identidade do projeto e versionamento
xml
Copiar código
<groupId>br.com.mel</groupId>
<artifactId>gerenciador-tarefas</artifactId>
<version>1.0-SNAPSHOT</version>
groupId: representa o pacote-base do projeto.

artifactId: nome do projeto.

version: versão atual do projeto.

Esses elementos definem a identidade do projeto dentro do ecossistema Maven e ajudam na organização e versionamento de projetos Java.

Versão do Java e compatibilidade
xml
Copiar código
<properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>
Define a versão do Java utilizada para compilar o projeto, garantindo compatibilidade entre o código-fonte e o ambiente de execução.

Dependências
Dependências são bibliotecas externas que o projeto necessita para funcionar.
O Maven faz o download e o gerenciamento automático dessas bibliotecas.

Exemplo de dependência — JUnit 5
xml
Copiar código
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
JUnit 5 é um framework de testes automatizados.

scope = test significa que a dependência:

é utilizada apenas durante os testes;

não é incluída no código final da aplicação.

Essa separação é importante para manter o código de produção isolado do código de teste e é base para práticas como TDD (Test-Driven Development).

Segundo pom.xml
Identidade do projeto
xml
Copiar código
<groupId>PetModel</groupId>
<artifactId>PetModel</artifactId>
<version>0.0.1-SNAPSHOT</version>
A versão 0.0.1-SNAPSHOT indica que o projeto está em estágio inicial.

O sufixo SNAPSHOT representa uma versão ainda em desenvolvimento.

Dependências
xml
Copiar código
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.5</version>
</dependency>
O Apache POI é uma biblioteca utilizada para trabalhar com arquivos como:

Excel (.xlsx)

Word

PowerPoint

É usada para integrar aplicações Java com arquivos externos e manipular dados fora do sistema.

Build
A seção build define como o projeto será compilado.

xml
Copiar código
<sourceDirectory>src</sourceDirectory>
Indica onde está localizado o código-fonte do projeto.

Plugins
Plugins são extensões do Maven responsáveis por executar tarefas específicas durante o build.

Exemplo: Maven Compiler Plugin
xml
Copiar código
<plugin>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.13.0</version>
    <configuration>
        <release>21</release>
    </configuration>
</plugin>

Esse plugin controla o processo de compilação do projeto e define a versão do Java utilizada (Java 21, neste caso).
