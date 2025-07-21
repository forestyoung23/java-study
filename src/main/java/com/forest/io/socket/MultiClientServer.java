package com.forest.io.socket;

import lombok.SneakyThrows;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Forest Dong
 * @date 2025年07月21日 20:21
 */
public class MultiClientServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                Socket socket = serverSocket.accept();
                Thread.sleep(20000l);
                new Thread(new ConnectHandler(socket)).start();
            }
        }
    }

    public static class ConnectHandler implements Runnable {
        private Socket socket;
        public ConnectHandler(Socket socket) {
            this.socket = socket;
        }

        /**
         * Runs this operation.
         */
        @SneakyThrows
        @Override
        public void run() {
            System.out.println("接收到新连接: " + socket +" 线程id: " + Thread.currentThread().threadId());
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while((len = in.read(bytes)) != -1) {
                System.out.print("Received: ");
                for (int i = 0; i < len; i++) {
                    System.out.printf("%02X ", bytes[i]);
                }
                System.out.println();
            }
        }
    }
}
