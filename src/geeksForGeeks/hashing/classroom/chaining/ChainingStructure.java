package geeksForGeeks.hashing.classroom.chaining;

import java.util.*;

public class ChainingStructure {

    int capacity;
    ArrayList<LinkedList<Integer>> data;

    ChainingStructure(int capacity){
        this.capacity = capacity;
        data = new ArrayList();
        for(int i=0;i<capacity;i++){
            data.add(new LinkedList<>());
        }
    }

    void insert(int i){
        int hash = i%capacity;
        LinkedList ll = data.get(hash);
        if(!ll.contains(i)){
            ll.add(i);
        }
    }

    boolean search(int i){
        int hash = i%capacity;
        LinkedList ll = data.get(hash);
        return ll.contains(i);
    }

    void delete(int i){
        int hash = i%capacity;
        LinkedList ll = data.get(hash);
        ll.remove(i);
    }

}
