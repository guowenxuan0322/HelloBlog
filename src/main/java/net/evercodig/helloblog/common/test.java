package net.evercodig.helloblog.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String md5 = MD5.getMD5(new Random().toString());
        System.out.println(md5);
    }
}
