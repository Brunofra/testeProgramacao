# testeProgramacao
Projeto Mavem foi utilizada apenas a dependencia lombok, para os getters e setter.
Foi criado o pacote e classe de entidades, para guardar as informações digitadas pelo usuario.
Foi criado o pacote e classe de Funções, onde foram criados os métodos para execução das regras de negócios necessarios.
Foi criado a classe "Controller" para controlar a execução dos métodos. nela foi injetada a classe "Funcoes" e criado contrutores para execução dos metodos desta classe, conforme necessidade.

Foi criado a classe App, como classe principal, para execução do sistema, chamando a classe "Controller" e seus contrutores. Foi utilizado o Scanner para obtenção de informações do usuario.


#testes executados

- numerosPrimos(1,10) = 7, numerosPrimos(1,100) = 97;
- criptografia(bruno) = criptografia =euxqr, descriptografia = bruno; 
- fibonacci(30) resultado = sequencial até 832040;
- fibonacci(100000000) resultado = (foi ate a memoria atingir o limite de 240616 antes que estore a memória
