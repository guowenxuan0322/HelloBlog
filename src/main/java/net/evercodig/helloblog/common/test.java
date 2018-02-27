package net.evercodig.helloblog.common;

import java.util.ArrayList;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","张三");
        map.put("b","李四");
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");

        System.out.println(map);
    }
}
