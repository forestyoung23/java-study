package com.forest.concurrency;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Forest
 * @date 2020年06月24日 09:11
 */
public class InnerClassTest {
    public static void main(String[] args) throws IOException {
         String json = "{\n" +
                "    \"type\": \"bba\",\n" +
                "    \"size\": {\n" +
                "        \"length\": 5,\n" +
                "        \"width\": 3,\n" +
                "        \"nmd\": [\n" +
                "            {\n" +
                "                \"name\": \"123\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
        // Car car = JSONObject.parseObject(json, Car.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(json, Car.class);
    }
}
