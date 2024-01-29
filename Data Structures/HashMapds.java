import java.util.*;
public class HashMapds {
    //Hashmap=key+value
    //key will be unique
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        
        //Insertion
        map.put("India",130);
        map.put("pakistan",54);
        map.put("america",34);
         System.out.println(map);
        //search
        if(map.containsKey("India")){
            System.out.println("yes");
        }
        System.out.println(map.get("pakistan"));
        System.out.println(map.get("chaina"));

        //Iteration with both key and value
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
        // making a set of keys (Only key set)
        Set<String> keys = map.keySet();
        
        //delete
        map.remove("India");
    }
    
}
