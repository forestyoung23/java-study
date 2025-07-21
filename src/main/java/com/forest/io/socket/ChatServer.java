package com.forest.io.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Forest Dong
 * @date 2025年07月19日 10:49
 */
public class ChatServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket socket = serverSocket.accept();
            System.out.println("Connection accepted: " + socket);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            new Thread(() -> {
                byte[] bytes = new byte[1024];
                int len;

                try {
                    while((len = in.read(bytes)) != -1) {
                        String revMsg = new String(bytes, 0, len);
                        System.err.println("对方: " + revMsg);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                out.write(str.getBytes());
                out.flush();
                System.err.println("我: " + str);
            }
        }
    }
}
