# compiling
javac ./src/chat/client/Client.java \
  ./src/chat/server/Server.java  \
  ./src/chat/server/ServerImpl.java \
  ./src/chat/server/Main.java

java -cp src chat.server.Main