package geeksForGeeks.bitMagic;

import java.util.*;

public class BitMain {

    public static void main(String[] args) {

        System.out.println(CountSetBits.countSetBits1(13));
        Map<Integer,Integer> map = new HashMap();
        map.put(1,1);
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.hasNext());
            if(map.get(itr.hasNext())==1){
                System.out.println("Here");
            }
            itr.next();
        }

        Set<Integer> set = new HashSet<>();

    }
}
