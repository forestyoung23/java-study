package com.forest.io;

import java.io.*;

/**
 * @author Forest Dong
 * @date 2024年03月19日 11:33
 */
public class ResourceTest {
    /**
     * 使用绝对路径获取
     *
     * @throws IOException
     * @author Forest Dong
     * @date 2024/03/19 11:39
     */
    public void getResource1() throws IOException {
        File file = new File("/Users/forest/Work/IdeaProjects/study/java-study/src/main/resources/application.yml");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s = "";
            while ((s = br.readLine()) != null)
                System.out.println(s);
        }
    }

    /**
     * 使用相对路径获取
     *
     * @throws IOException
     * @author Forest Dong
     * @date 2024/03/19 11:39
     */
    public void getResource2() throws IOException {
        File file = new File("src/main/resources/application.yml");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s = "";
            while ((s = br.readLine()) != null)
                System.out.println(s);
        }
    }

    /**
     * Jar中读取
     *
     * @throws IOException
     * @author Forest Dong
     * @date 2024/03/19 11:56
     */
    public void getResource3() throws IOException {
        InputStream is = this.getClass().getResourceAsStream("/application.yml");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String s = "";
            while ((s = br.readLine()) != null)
                System.out.println(s);
        }
    }

    public static void main(String[] args) throws IOException {
        ResourceTest resource = new ResourceTest();
        resource.getResource1();
        resource.getResource2();
        resource.getResource3();
    }
}
