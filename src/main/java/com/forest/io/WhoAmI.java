package com.forest.io;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Forest Dong
 * @date 2025年07月15日 21:20
 */
public class WhoAmI {
    public static void main(String[] args) throws UnknownHostException {
//        if (args.length != 1) {
//            System.err.println("Usage: java com.forest.io.WhoAmI whoami");
//            System.exit(1);
//        }
        InetAddress a =
                InetAddress.getByName(null);
        System.out.println(a);
    }
}
