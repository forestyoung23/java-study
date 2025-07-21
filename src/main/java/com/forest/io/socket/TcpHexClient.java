package com.forest.io.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TcpHexClient {

    private String serverHost;
    private int serverPort;

    public TcpHexClient(String host, int port) {
        this.serverHost = host;
        this.serverPort = port;
    }

    /**
     * 将十六进制字符串转换为 byte[]
     */
    private byte[] hexStringToBytes(String hex) {
        hex = hex.replaceAll("\\s+", ""); // 去掉空格
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i+1), 16));
        }
        return data;
    }

    /**
     * 建立连接并发送报文
     */
    public void connectAndSend(String hexMessage) {
        try (Socket socket = new Socket(serverHost, serverPort)) {
            System.out.println("Connected to " + serverHost + ":" + serverPort);
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            byte[] msg = hexStringToBytes(hexMessage);
            out.write(msg);
            out.flush();
            System.out.println("Sent: " + hexMessage);

            // 接收响应
            byte[] buffer = new byte[1024];
            int readLen = in.read(buffer);
            if (readLen != -1) {
                System.out.print("Received: ");
                for (int i = 0; i < readLen; i++) {
                    System.out.printf("%02X ", buffer[i]);
                }
                System.out.println();
            }

            // 不关闭连接：模拟长连接（可以手动控制 keep-alive）
            Thread.sleep(5000000); // 保持连接 5 秒

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 多线程执行 TCP 连接
     */
    public void runMultiClient(int threadCount, String hexMessage) {
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        for (int i = 0; i < threadCount; i++) {
            final int id = i;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            executor.submit(() -> {
                System.out.println("Thread " + id + " started");
                connectAndSend(hexMessage);
            });
        }
        executor.shutdown();
    }

    /**
     * 示例调用
     */
    public static void main(String[] args) {
        TcpHexClient client = new TcpHexClient("localhost", 8080);

        String hexMessage = "68 31 00 31 00 68 c9 29 00 01 00 00 02 72 00 00 01 00 68 16 "; // 支持任意十六进制报文格式

        int threadCount = 100; // 启动5个客户端线程
        client.runMultiClient(threadCount, hexMessage);
    }
}
