package com.luciano.chatthing.services;

import com.luciano.chatthing.entities.Chat;
import com.luciano.chatthing.entities.Message;
import com.luciano.chatthing.entities.User;

import java.util.Map;
import java.util.Set;

public interface ChatService
{
    Map<Integer, User> getUsers();
    User getUser(int userId);

    Set<Integer> getContacts(int userId);

    void addContact(int userId, int contactId);
    void removeContact(int userId, int contactId);

    void addChat(int userId, int contactId, Chat chat);
    void removeChat(int userId, int contactId);

    void addMessage(int user1Id, int user2Id, Message message);
}
