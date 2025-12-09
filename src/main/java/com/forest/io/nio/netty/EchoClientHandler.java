package com.forest.io.nio.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * 客户端处理器
 *
 * @author Forest Dong
 * @date 2025年12月08日 17:59
 */
// 标记该类的实例可以被多个 Channel 共享
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {
    /**
     * 在到服务器的连接连接已经建立之后将被调用
     *
     * @param ctx
     * @throws Exception
     * @author Forest Dong
     * @date 2025/12/09 09:42:30
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // 当被通知 Channel是活跃的时候，发送一条消息
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!",
                CharsetUtil.UTF_8));
    }

    /**
     * 当从服务器接收到一条消息时被调用
     *
     * @param ctx
     * @param msg
     * @throws Exception
     * @author Forest Dong
     * @date 2025/12/09 09:43:10
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        // 记录已接收消息的转储
        System.out.println(
                "Client received: " + msg.toString(CharsetUtil.UTF_8));
    }

    /**
     * 在处理过程中引发异常调用
     *
     * @param ctx
     * @param cause
     * @throws Exception
     * @author Forest Dong
     * @date 2025/12/09 10:23:46
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.err.println("123");
        // 在发生异常时，记录错误并关闭Channel
        cause.printStackTrace();
        ctx.close();
    }
}
