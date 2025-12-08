package com.forest.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author Forest Dong
 * @date 2025年12月05日 17:59
 */
public class NioServer {
    public static void main(String[] args) throws IOException {
        // 1.创建ServerSocketChannel
        ServerSocketChannel server = ServerSocketChannel.open();
        server.configureBlocking(false);
        server.bind(new InetSocketAddress(8081));
        // 2.创建Selector
        Selector selector = Selector.open();
        // 3.注册accept事件
        server.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("NIO Server started on port 8081...");
        while (true) {
            // 4.阻塞直到有事件发生（重要）
            selector.select();
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isAcceptable()) {
                    // ① 接受新连接
                    ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                    SocketChannel client = ssc.accept();
                    client.configureBlocking(false);

                    System.out.println("Accepted new client: " + client.getRemoteAddress());
                    // 注册可读事件
                    client.register(selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    // ② 读取客户端数据
                    SocketChannel client = (SocketChannel) key.channel();

                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int read = client.read(buffer);

                    if (read == -1) {
                        System.out.println("Client closed: " + client.getRemoteAddress());
                        client.close();
                        continue;
                    }

                    buffer.flip();
                    String msg = new String(buffer.array(), 0, buffer.limit());
                    System.out.println("Received: " + msg);

                    // ③ 回写数据
                    buffer.clear();
                    buffer.put(("Echo: " + msg).getBytes());
                    buffer.flip();
                    client.write(buffer);
                } else if (key.isConnectable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    System.out.println("Client connected: " + client.getRemoteAddress());
                }
            }
        }
    }
}
