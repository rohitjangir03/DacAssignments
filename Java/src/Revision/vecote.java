package Revision;

import java.util.Vector;

public class vecote {
    public static void main(String[] args) {
        Vector<String> vect = new Vector<>(5, 12);
        String[] string = new String[]{"rohit","jangir","devyani","oho","soni","charlie","hello"};
        for(int i=0;i<string.length;i++){
            vect.add(string[i]);
        }
        System.out.println(vect);
        System.out.println(vect.size());
        System.out.println(vect.capacity());
    }

}