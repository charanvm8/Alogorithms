package geeksForGeeks.hashing.classroom.chaining;

import java.util.*;

public class ChainingStructure {

//    int capacity;
//    ArrayList<LinkedList<Integer>> data;
//
//    ChainingStructure(int capacity){
//        this.capacity = capacity;
//        data = new ArrayList();
//        for(int i=0;i<capacity;i++){
//            data.add(new LinkedList<>());
//        }
//    }
//
//    void insert(int i){
//        int hash = i%capacity;
//        LinkedList ll = data.get(hash);
//        if(!ll.contains(i)){
//            ll.add(i);
//        }
//    }
//
//    boolean search(int i){
//        int hash = i%capacity;
//        LinkedList ll = data.get(hash);
//        return ll.contains(i);
//    }
//
//    void delete(int i){
//        int hash = i%capacity;
//        LinkedList ll = data.get(hash);
//        ll.remove(i);
//    }

    int capacity,size;
    ArrayList<ArrayList<Integer>> hash;

    ChainingStructure(int capacity){
        this.capacity = capacity;
        this.size = 0;
        hash = new ArrayList<>();
        for(int i=0;i<capacity;i++){
            this.hash.add(new ArrayList<>());
        }
    }

    //insert
    public void insert(int i){
        int hashVal = i%capacity;
        if(!hash.get(hashVal).contains(i)){
            hash.get(hashVal).add(i);
            this.size++;
        }
    }
    //search
    public boolean search(int i){
        int hashVal = i%capacity;
        return hash.get(hashVal).contains(i);
    }

    //delete
    public boolean delete(int i){
        int hashVal = i%capacity;
        if(search(i)){
            hash.get(hashVal).remove(i);
            this.size--;
            return true;
        }
        return false;
    }


}
