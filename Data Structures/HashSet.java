import java.util.HashSet;
import java.util.Iterator;
class hashSetds{
    public static void main(String[] args){
        //Creating
        HashSet <Integer> set = new HashSet<>();
        //Insert
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(4);

        // search - contains
        if(set.contains(1)){
            System.out.println("Yes");
        }
        //delete
        set.remove(1);

        //print all element
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        //hasNext(), next()
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}