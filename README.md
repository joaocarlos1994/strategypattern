# Strategy Pattern

O Strategy pattern é usado para executar diferentes tipo de algoritmos em tempo de execução. Ele tem como base o uso da interface e composição.

A classe que deseja calcular diferentes algoritimos tem referência para abastração, no caso a interface, as demais classes que vão executar seu algoritimo de forma única devem implementar a interface, fazendo a lógica do algoritimo.

No Java em tempo de execução a JVM reconheçe qual o método implementado deve chamar. 
