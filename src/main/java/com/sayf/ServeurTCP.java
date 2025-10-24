package com.sayf;

import java.io.*;
import java.net.*;
public class ServeurTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket serveur = new ServerSocket(5000);
        System.out.println("Serveur TCP démarré sur le port 5000...");

        Socket socket = serveur.accept();
        System.out.println("Client connecté !");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String message = in.readLine();
        System.out.println("Message reçu : " + message);

        out.println("Bien reçu : " + message);

        socket.close();
        serveur.close();
    }
}