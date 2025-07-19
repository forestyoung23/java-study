package com.forest.io.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Forest Dong
 * @date 2025年07月18日 17:07
 */
public class ForestServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Connection accepted: " + socket);
//                BufferedReader in =
//                        new BufferedReader(
//                                new InputStreamReader(
//                                        socket.getInputStream()));
//                PrintWriter out =
//                        new PrintWriter(
//                                new BufferedWriter(
//                                        new OutputStreamWriter(
//                                                socket.getOutputStream())), true);
//                while (true) {
//                    String str = in.readLine();
//                    if (str.equals("END")) break;
//                    System.out.println("Echoing: " + str);
//                    out.println(str);
//                }
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();
                byte[] buffer = new byte[1024];
                int readLen;
                while ((readLen = in.read(buffer)) != -1) {
                    System.out.print("Received: ");
                    for (int i = 0; i < readLen; i++) {
                        System.out.printf("%02X ", buffer[i]);
                    }
                    System.out.println();
                    // 回显二进制数据
                    out.write(buffer, 0, readLen);
                    out.flush();
                    System.out.println("Sent: " + new String(buffer, 0, readLen));
                }
                System.out.println("Client disconnected.");
            }
        }
    }
}
