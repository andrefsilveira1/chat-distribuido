# chat-distribuido
Criação de um chat utilizando programação distribuída através do Java RMI

## Passos iniciais:

1. Abra três terminais
2. Renomeie-os para "Client", "Server" e "RmiRegistry"
3. No RmiRegistry, execute o comando:

| Windows   | Linux e MacoS |
| ------------- | ------------- |
| `start rmiregistry 9100` | `rmiregistry 9100` |

4. No Server execute : `javac Server.java` + `java Server`
5. No Client, basta finalizar : `javac Client.Java` + `java Client`

Ao finalizar, teremos o ambiente em execução, que consegue passar informações através do client e do server.