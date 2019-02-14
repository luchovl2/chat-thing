package com.luciano.chatthing.entities;

public class Message
{
    private String text;
    private int author;

    public Message(String text, int author)
    {
        this.text = text;
        this.author = author;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public int getAuthor()
    {
        return author;
    }

    public void setAuthor(int author)
    {
        this.author = author;
    }
}
