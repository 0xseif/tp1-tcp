package com.sayf;
import java.io.*;
import java.net.*;
public class ClientTCP {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connexion établie avec le serveur.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Bonjour Serveur !");
        String reponse = in.readLine();
        System.out.println("Réponse du serveur : " + reponse);

        socket.close();
    }
}