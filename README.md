# Introdução

## O que é o git?

O git é um software que serve para fazer **controle de versão**.
Isto é, ele serve para que a gente possa guardar as versões diferentes dos nossos arquivos.

Isso é muito importante quando estamos desenvolvendo software, porque teremos um histórico de todas as modificações que foram feitas.
Assim também podemos voltar facilmente para uma versão estável, caso alguma modificação dê errado.

Além disso, cada vez que salvamos os nossos arquivos no git fornecemos também uma mensagem, explicando o que fizemos e porque fizemos essas modificações.
Depois podemos listar todas essas mensagens com as suas respectivas versões.
Assim podemos encontrar a versão correta que procuramos com mais facilidade.

Por fim, uma das características mais interessantes do git é que ele é **distribuído**.
Isso quer dizer que cada desenvolvedor pode ter a sua cópia independente dos arquivos com todo um histórico de todas as versões.
Por causa disso esse histórico não se perde nunca e podemos até ter versões que tomam caminhos diferentes, ou seja, se ramificam em projetos diferentes.

# Básico

O fluxo básico do git começa com obter os arquivos com os quais vamos trabalhar.
Por exemplo, os códigos fonte dos programas.
Depois de obtidos esses códigos, podemos modificar eles na nossa máquina.
Depois de modificados localmente, precisamos enviar as nossas modificações para o servidor do git para que os outros desenvolvedores possam pegá-las.
Nós também podemos pegar as modificações de outros desenvolvedores que estejam disponíveis no servidor.

E esse ciclo se repete ao longo de todo o desenvolvimento:

1. Obter os arquivos ou modificações
2. Modificar os arquivos
3. Adicionar as modificações localmente
4. Enviar as modificações adicionadas

## Clonar um repositório

Um **repositório** é o nome que o git dá para um lugar onde estão os arquivos.
Muitas vezes também chamamos um repositório de um "repo".
Nós vamos trabalhar com dois tipos de repositórios: o **repositório remoto** e o **repositório local**.

Um repositório remoto é um que fica em outra máquina na rede.
No nosso caso, esse repositório vai ficar mesmo no servidor do Github.
Um repositório local é um que fica na nossa máquina e está diretamente acessível para que a gente modifique.

Em geral, não vamos modificar o repositório remoto diretamente, ao invés disso vamos obter uma cópia dele.
Obter essa cópia, no linguajar do git, é o que chamamos de **clonar** o repositório.

Para clonar um repositório, assumindo que temos acesso à ele, basta digitarmos:

```git clone <endereço_do_repositório> [<nome_do_repositório>]```

Onde `<endereço_do_repositório>` é o endereço do repositório remoto, por exemplo, o endereço desse repositório é <https://github.com/roger-willian/aula-git.git>.
Já o `<nome_do_repositório>` é opcional e, se deixarmos vazio, ele usa o nome que obtém do próprio endereço.
Para testar, execute na sua máquina o comando:

```git clone https://github.com/roger-willian/aula-git.git```

Executar o comando acima copia todo o conteúdo do repositório `aula-git` para uma pasta com o mesmo nome dentro do diretório atual.

### Configurar nome e email

## Modificar um arquivo

## Adicionar um arquivo para a área de stage

## Reverter um arquivo da área de stage

## Fazer um commit

## Fazer um push

## Fazer um pull

# Médio

## Resolver um conflito

## Descartar uma modificação local

## Criar uma branch

## Fazer um merge

# Avançado

## Criar um repositório

## Criar um pull request

## Fazer um code review

## Aceitar um pull request


