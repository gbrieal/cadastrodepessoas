# PROJETO DE CADASTRO DE PESSOAS

## 📊 O Comando

Desenvolva uma aplicação em qualquer linguagem de programação, de acordo com os requisitos abaixo. Não é necessário interface gráfica, no entanto deve haver uma forma de entrada de dados e verificação das saídas correspondentes, que não envolva inserção manual de dados no código fonte.

**Requisitos**

- A funcionalidade do programa é o armazenamento de dados cadastrais de pessoas. Devem constar os seguintes dados no cadastro: Nome e idade.

- Deve ser possível cadastrar / adicionar uma nova pessoa.

- Deve ser possível exibir uma lista de pessoas cadastradas, ordenada por idade (menor para maior) e nome (alfabética crescente).

- Deve ser possível categorizar as pessoas cadastradas por idade, de acordo com os critérios: 0 a 12 anos => Criança, 12 até 19 anos => Adolescente, 20 até 65 => Adulto, 65 ou mais => Idoso.

**Observações**

- Não utilize banco de dados, os dados devem ser mantidos em memória.

- Anexe instruções sobre como rodar a aplicação e testar cada uma das funcionalidades pedidas.

- O código deve ser disponibilizado via git, em repositório público de sua preferência (ex: Bitbucket, Github).

<hr>

## 👨🏽‍💻 Considerações do Dev

Optei por desevolver o projeto na linguagem **Java**, por ser a que eu mais tive contato até hoje e também analisando o comando, percebi ser mais direcionada para as implementações e métodos das bibliotecas Java; como criação de _Lista_, _Ordenações_ por Idade e/ou Alfabética; além de não ser permitido o uso de Banco de Dados.

## ☕ Composição do Programa

1. O programa são 03 arquivos tipo Java, cada uma com uma Class especificada: **Pessoa, Cadastro e ListaAlfabetica**;

2. Na classe **Pessoa** foi criada, por padrão, o modelo onde tem como atributos **Nome** e **Idade** privados para manter a segunrança das informações. Construtores criados conforme as necessidades de utilização na classe Principal (**main**), métodos **Getters** e **Setters**, o método **toString** para retornar os valores digitados pelo usuário (ao invés do "espaço de memória"). Implementação do **Comparable** que faz parte da biblioteca java.lang responsável por realizar a comparação numérica (por Idade);

3. A classe **Cadastro** é a principal responsável por rodar o código, contém a o main. optei por fazer um Tratamento de Exceção simples utilizando o **try/catch** a fim de melhorar a interface do uso de Menu de opções. Utilizei uma **ArrayList** (do tipo Pessoa) para guardar as informações que o usuário fornecer, inicializei a variável tipo int que complementa com o laço de repetição **While** o Menu. Quis simplificar então as interações são das classes padrões **Scanner e System** mesmo. Logo em seguida, utilizei a estrutura condicional **if** para categorizar os objetos de acordo com a idade para alimentarem a Array. Inseri o método **sort** da biblioteca **Collections** para fazer o ordenamento alfabético ou por idade de cada Pessoa.

4. A classe **ListaAlfabetica** foi criada para fazer a comparações dos objetos da Array e poder organizar essa Lista, foi implementada com o Comparator e Pessoa para haver conexão (e Herança) entre as classes.

### 💾 Instruções

1. Utilize o **GIT Clone** ou faça o download em ZIP do código;
2. É necessário ter a **JVM** (máquina virtual Java) instalada no computador para poder rodar o arquivo;
3. Depois de baixar o arquivo, extraia a pasta e utilize o caminho abaixo: <br>
   `..\cadastrodepessoas\listadepessoas\src\listapessoas`
4. Abra o arquivo `Cadastro.java` na IDE de sua preferência;
5. Inicie o **RUN** do código e pode digitar os comandos conforme o menu apresentar as opções.
   <br>

*Se tiver qualquer dúvida, por favor entre em contato, vou ter uma grande satisfação em te ajudar 🙋🏽‍♂️*
  
### 📚 Referências

- [**Curso Trabalhando com Collections Java** da Digital Innovation One Inc.](https://web.dio.me/course/trabalhando-com-collections-java/learning/a34f3db6-de2b-44fa-a059-6ae7785695cc)

- [Fórum **StackOverFlow**](https://pt.stackoverflow.com/)

- [**ArrayList in Java** da GeeksforGeeks](https://www.geeksforgeeks.org/arraylist-in-java/?ref=gcse)

- [Texto Java **List sort() Method** da Java T Point](https://www.javatpoint.com/java-list-sort-method?msclkid=83197a03ab1811ec874365278e3540ad)

- [Tutorial **How to Sort a List in Java** da Digital Ocean](https://www.digitalocean.com/community/tutorials/java-sort-list?msclkid=8319900dab1811ec8be249f47c75605c.)

<br>

> Desenvolvido por Gabriel G.
