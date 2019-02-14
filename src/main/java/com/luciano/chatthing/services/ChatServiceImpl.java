package com.luciano.chatthing.services;

import com.luciano.chatthing.entities.Chat;
import com.luciano.chatthing.entities.Message;
import com.luciano.chatthing.entities.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class ChatServiceImpl implements ChatService
{
    private Map<java.lang.Integer, User> users = new HashMap<>();

    public ChatServiceImpl()
    {
        users.put(1, new User(1, "Carlitos"));
        users.put(2, new User(2, "Juancito"));
        users.put(3, new User(3, "Susanita"));
        users.put(4, new User(4, "Tuvieja"));
        users.put(5, new User(5, "Mauricio"));
        users.put(6, new User(6, "Luciano"));

        users.get(1).addContact(2);
        users.get(1).addContact(4);
        users.get(3).addContact(2);
        users.get(3).addContact(4);
        users.get(3).addContact(6);
        users.get(5).addContact(1);
        users.get(5).addContact(3);
        users.get(5).addContact(6);
    }

    @Override
    public Map<Integer, User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser(int userId)
    {
        return null;
    }

    @Override
    public Set<Integer> getContacts(int userId)
    {
        if(users.containsKey(userId))
            return users.get(userId).getContacts();

        return null;
    }

    @Override
    public void addContact(int userId, int contactId)
    {

    }

    @Override
    public void removeContact(int userId, int contactId)
    {

    }

    @Override
    public void addChat(int userId, int contactId, Chat chat)
    {

    }

    @Override
    public void removeChat(int userId, int contactId)
    {

    }

    @Override
    public void addMessage(int user1Id, int user2Id, Message message)
    {

    }
}
