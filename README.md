## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).


```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar( ) : void
        +pausar( ) : void
        +selecionarMusica( String musica) : String
    }

    class AparelhoTelefonico {
        +ligar(String numero) : String
        +atender( ) : void
        +iniciarCorreioVoz( ) : void
    }

    class NavegadorInternet {
        +exibirPagina(String url) : String
        +adicionarNovaAba( ) : void
        +atualizarPagina( ) : void
    }

    class iPod {
    }
    
    class Celular{
    }

    class Computador{
    }
    class iPhone {
    }

    iPod --> ReprodutorMusical
    Celular --> AparelhoTelefonico    
    Computador --> NavegadorInternet

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```




```
