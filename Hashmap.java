import java.util.*;
class Hashmap{
    public static void main(String args[]){
        Map<String,Integer>m=new HashMap<>();
        m.put("d",1);
        m.put("a",1);
        m.put("c",1);
        m.put("a",1+1);
        System.out.println(m);
    }
}