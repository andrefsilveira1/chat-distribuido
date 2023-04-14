package chat.client;

import chat.server.Server;

public class Client {
  private String name;

  public Client(String name, Server server) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
