package JavaBasic2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {

        //Like array store different type of value what type of data is given
        HashSet<String> h = new HashSet<String>();
        h.add("mahadi");
        h.add("kamal");
        h.add("ujamal");
        System.out.println(h);

        h.remove("mahadi");
        System.out.println(h.size());

        System.out.println(h.contains("mahadi"));
        System.out.println(h.isEmpty());
        // h.clear();

        Object[] test = h.toArray();

        // Do not maintain position or order random comes
        System.out.println(test[0]);

        System.out.println(h.hashCode());

        Iterator<String> it = h.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
