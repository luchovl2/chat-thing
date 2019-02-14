package com.luciano.chatthing.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chat
{
    private Set<Integer> users = new HashSet<>();
    private List<Message> messages = new ArrayList<>();

    public void addUser(int userId)
    {
        users.add(userId);
    }

    public void addMessage(Message message)
    {
        messages.add(message);
    }

    public Set<Integer> getUsers()
    {
        return users;
    }

    public void setUsers(Set<Integer> users)
    {
        this.users = users;
    }

    public List<Message> getMessages()
    {
        return messages;
    }

    public void setMessages(List<Message> messages)
    {
        this.messages = messages;
    }
}
