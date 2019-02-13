package com.luciano.chatthing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatThingApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ChatThingApplication.class, args);
    }

}

//usuario: id (int), nombre (string), contactos (set usuarios), chats (chat)
//app: usuarios (usuario), chats (chat)
//chat: mensajes (mensaje), usuarios (int (id))
//mensaje: texto (string), dueño (int (id))

//crear usuario
//borrar usuario
//agregar contacto
//borrar contacto
//crear chat con contacto
//borrar chat con contacto
//crear mensaje en chat