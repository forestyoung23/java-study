package com.forest.io.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Forest Dong
 * @date 2025年07月19日 10:26
 */
public class ForestClient {
    public static void main(String[] args) throws IOException {
        String msg = "68 31 00 31 00 68 c9 29 00 01 00 00 02 72 00 00 01 00 68 16";
        try (Socket socket = new Socket("127.0.0.1", 8080)) {
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            out.write(msg.getBytes());
            out.flush();
            System.out.println("Sent: " + msg);
            byte[] bytes = new byte[1024];
            int readLen;
            while ((readLen = in.read(bytes)) != -1) {
                System.err.println("Received: " + new String(bytes, 0, readLen));
                out.write(bytes, 0, readLen);
                out.flush();
            }
        }
    }
}
