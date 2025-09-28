package Learn;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String[] args){
        HashMap person=new HashMap();
        System.out.println(person);
        person.put("name","Naveen");
        person.put("place","Cbe");
        person.put("mobile",7845120369L);
        person.put("address", new String[]{"street", "first street","zipcode", String.valueOf(642100),"district","cbe"});
        person.put("mark", new int[]{95, 68, 72, 63, 88});
        System.out.println(person);
        System.out.println(person.get("mark"));
        int ch=(int) 2.5;
        System.out.println(ch);
        int[] marklist= (int[]) person.get("mark");
        for(int mark:marklist){
            System.out.println(mark);
        }


        System.out.println(person.get("address"));

        System.out.println(person.size());
        person.put("role","Developer");

        System.out.println(person);
        System.out.println(person.clone());
        System.out.println(person.isEmpty());
        System.out.println(person.entrySet());
        System.out.println(person.values());
        System.out.println(person.keySet());
        System.out.println(person.containsKey(" role".trim()));
        System.out.println(person.containsValue("developer"));
        System.out.println(person.replace("role","full stack developer"));
       // System.out.println(person.remove("address"));
        System.out.println(person);
        System.out.println(person.putIfAbsent("role1","Data Analyst"));
        System.out.println(person);
        person.clear();
        System.out.println(person);

        HashMap person2=new HashMap();
        person2.putAll(Map.of("name","Hari","place","cbe","mobile",7845120369L));
        System.out.println(person2);
       person2.forEach((a,b)->System.out.println(b));


    }







    }
