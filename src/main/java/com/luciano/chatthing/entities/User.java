package com.luciano.chatthing.entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User
{
    private int id;
    private String name;
    private String nickname;
    private String state;
    private Set<Integer> contacts = new HashSet<>();
    private Map<Integer, Chat> chats = new HashMap<>();

    public User()
    {

    }

    public User(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public boolean addContact(Integer id)
    {
        //no se puede tener a uno mismo de contacto
        return id != this.id? contacts.add(id): false;
    }

    public void addChat(Integer contactId, Chat chat)
    {
        if(!chats.containsKey(contactId))
        {
            chats.put(contactId, chat);
        }
    }

    public void removeChat(Integer contactId)
    {
        chats.remove(contactId);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public Set<Integer> getContacts()
    {
        return contacts;
    }

    public void setContacts(Set<Integer> contacts)
    {
        this.contacts = contacts;
    }
}
