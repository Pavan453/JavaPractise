import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args){

        Map<Integer,String> countryMap=new HashMap<>();


        countryMap.put(91,"India");
        countryMap.put(92,"paki");
        countryMap.put(108,"Australia");
        countryMap.put(67,"Australia");

        Set<Integer> countrycode=countryMap.keySet();

        Iterator<Integer> countrycodeIterator=countrycode.iterator();
        while(countrycodeIterator.hasNext()){
            System.out.println(countrycodeIterator.next());
        }


        System.out.println(countrycode);




    }
}
