# Factory Method

O Factory Method é um padrão criacional de projeto que fornece uma interface ou classe abstratab para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Em outras palavras, as subclasses são responsáveis por criar a instância da classe.

Neste exemplo de implementação vamos abordar o código como se este pertencesse a uma aplicação de gerenciamento de logística. O problema que o código resolve é o seguinte: imagine que a primeira versão da aplicação lidava apenas com entregas por terra e com cargas pequenas, porém, neste momento é necessário expandir as entregas para via maritma e entregar cargas pesadas, então, também vai ser necessario checar o peso da entrega e encaixar na categoria pesada ou leve.

Com isso agora existem 4 tipos de transporte: por terrado leve, por terra pesado, por mar leve e por mar pesado. Todos possuem caracteristicas unicas e contruções especificas.

Aplicamos então o padrão Factory Method, mais precisamente o Simple Factory que consiste em termos apenas uma classe de Factory para contruir todas as instancias que precisamos. Este Factory recebe o tipo de entrga (SEA ou EARTH) e o peso para determinar a instancia que deve ser criada.
