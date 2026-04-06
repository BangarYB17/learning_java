import java.util.Hashtable;

public class Hashtable_ex {
    public static void main(String[] args) {
        Hashtable<Integer , String> table = new Hashtable<>();

        // put()- add elements
        table.put(1,"java");
        table.put(2,"python");
        table.put(3,"c");
        table.put(4,"sql");

        System.out.println(table);

        //get()
        System.out.println("value for key 2: "+table.get(2));

        //remove()
        table.remove(4);

        //containskey()
        System.out.println("contains key 2" + table.containsKey(2));

        //containsvalue()
        System.out.println("Contains value java: "+table.containsValue("java"));

        //size()
        System.out.println("table size:"+table.size());

        //iterator()
        for(Integer  values :table.keySet()){
            System.out.println(values+"->"+table.get(values));
        }

    }
}
