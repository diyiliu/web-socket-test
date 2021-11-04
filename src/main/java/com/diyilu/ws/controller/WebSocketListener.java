package com.diyilu.ws.controller;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

/**
 * WebSocketListener
 *
 * @author: DIYILIU
 * @date: 2021/11/04
 */

@Component
public class WebSocketListener {

    @EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
        System.out.println("Connect");
        System.out.println(event.getMessage().getHeaders().keySet());
    }

    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        System.out.println("Disconnect");
        System.out.println(event.getMessage().getHeaders().keySet());
    }

}
