package com.example.chatroom.service;

import com.example.chatroom.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private final List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void broadcastMessage(Message message) {
        // Logic to broadcast message to all connected clients
    }
}