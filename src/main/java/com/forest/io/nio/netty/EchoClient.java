package com.forest.io.nio.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * 引导客户端
 *
 * @author Forest Dong
 * @date 2025年12月09日 10:44
 */
public class EchoClient {
    public static void main(String[] args) throws InterruptedException {
        new EchoClient().start("127.0.0.1", 8080);
    }

    private void start(String host, int port) throws InterruptedException {
        NioEventLoopGroup group = new NioEventLoopGroup();
        try {
            // 创建Bootstrap
            Bootstrap bootstrap = new Bootstrap();
            // 指定 EventLoopGroup 以
            //处理客户端事件
            bootstrap.group(group)
                    // 需要适用于 NIO 的实现适用于 NIO 传输的Channel 类型
                    .channel(NioSocketChannel.class)
                    .remoteAddress(new InetSocketAddress(host, port))
                    //在创建Channel时，向 ChannelPipeline中添加一个 EchoClientHandler 实例
                    .handler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        protected void initChannel(NioSocketChannel ch) {
                            ch.pipeline().addLast(new EchoClientHandler());
                        }
                    });
            // 连接到远程节点，阻塞等待直到连接完成
            ChannelFuture future = bootstrap.connect().sync();
            // 阻塞，直到Channel 关闭
            future.channel().closeFuture().sync();
        } finally {
            // 关闭线程池并且释放所有的资源
            group.shutdownGracefully().sync();
        }
    }
}
