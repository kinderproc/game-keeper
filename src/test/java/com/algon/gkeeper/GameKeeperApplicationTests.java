package com.algon.gkeeper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.socket.WebSocketHandler;

@SpringBootTest
class GameKeeperApplicationTests {

  @Autowired WebSocketHandler webSocketHandler;

  @Test
  void contextLoads() {
    assertNotNull(webSocketHandler);
  }
}
