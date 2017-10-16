package ru.techlab.risks.web.config.ws;

import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * Created by rb052775 on 16.10.2017.
 */
public class EchoWebSocketHandler implements WebSocketHandler {
    @Override
    public Mono<Void> handle(WebSocketSession session) {
        return session
                .send(session.receive().delayElements(Duration.ofSeconds(1)).log());
    }
}
