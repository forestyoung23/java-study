package com.forest.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author Forest Dong
 * @date 2025年12月08日 10:39
 */
public class NioClient {
    public static void main(String[] args) throws IOException {
        SocketChannel client = SocketChannel.open();
        client.connect(new InetSocketAddress("localhost", 8081));
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("hello".getBytes());
        buffer.flip();
        client.write(buffer);
    }
}
