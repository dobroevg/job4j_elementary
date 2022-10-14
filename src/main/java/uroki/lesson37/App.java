package uroki.lesson37;

import javax.swing.*;
import java.io.InputStream;
import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class WierString{



    @Override
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        WierString wierd = (WierString) obj;
        return this.str.equals(wierd.str);
    }

    @Override
    public  int hashCode() {
        return str.hashCode();
    }
    @Override
    public String toString() {
        return str;
    }

    public  WierString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    private String str;
}

public class App {
   static void print(Object obj) {
       System.out.println("hash: " + obj.hashCode() + ", " + obj);
   }

   static void example1() {
       String str = "some text";
       String str2 = "some" + " " + "text";
       int[] arr = new int[] {1, 2, 3};
       Object obj = new Object();
       Scanner sc = new Scanner(System.in);
       InputStream in = System.in;

       print(str);
       print(str2);
       print(arr);
       print(obj);
       print(sc);
       print(in);
   }

    public static void main(String[] args) {
        HashMap<Object, Integer> map = new HashMap<Object, Integer>();
        map.put("key1", 45);
        map.put("key2", 100);
        map.put("key3", 49);
        long[] arr = new long[] {1000L, 99999999L, -903270273507L};
        map.put(arr, arr.length);
        long[] arr2 = new long[] {1000L, 99999999L, -903270273507L};
        map.put(arr2, arr.length * 2);
        WierString w1 = new WierString("hello");
        map.put(w1, w1.getStr().length());
        WierString w2 = new WierString("hash code");
        map.put(w2, w2.getStr().length());


        for (Entry<Object, Integer> item : map.entrySet()) {
            Object key = item.getKey();
            Integer value = item.getValue();
            System.out.printf("%d: %s - %d\n", key.hashCode(), key, value);
        }
        System.out.println();

        WierString wierKey = new WierString("hash code");
        Integer number = map.get(wierKey);
        System.out.println(wierKey.hashCode() + " key: " + wierKey + ", value: " + number);



   }
}
