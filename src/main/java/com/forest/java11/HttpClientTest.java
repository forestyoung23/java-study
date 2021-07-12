package com.forest.java11;

import cn.hutool.json.JSONUtil;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * HttpClient支持
 *
 * @author dongyang
 * @date 2021年07月12日 15:18
 */
public class HttpClientTest {
    public static void get() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://127.0.0.1:8084/hc/getTest"))
                .build();
        // 同步
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("同步" + response.statusCode());
        System.out.println("同步" + response.body());
    }

    public static void get1() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://127.0.0.1:8084/hc/getTest"))
                .build();
        // 异步
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(r -> {
                    System.out.println(r.statusCode());
                    return r;
                }).thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

    // 异步调用 POST
    public static void asyncPost() throws Exception {
        HttpClient client = HttpClient.newBuilder()
                // http1.1 or http2.0默认2.0
                .version(HttpClient.Version.HTTP_2)
                // 是否遵从服务器发出的重定向
                .followRedirects(HttpClient.Redirect.NORMAL)
                // 超时时间
                .connectTimeout(Duration.ofSeconds(20))
                // 代理
                // 身份认证
                // 等等
                .build();

        String jsonBody = JSONUtil.toJsonStr("HttpClient.....post");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://127.0.0.1:8084/hc/postTest"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(r -> {
                    System.out.println(r.statusCode());
                    return r;
                }).thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
