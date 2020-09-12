package geeksForGeeks.hashing.classroom.openAddressing;

public class OpenAddressing {
    int[] data;
    int capacity;
    int size;

    OpenAddressing(int i){
        this.capacity = i;
        this.size = 0;
        data = new int[i];
        for(int j=0;j<i;j++){
            data[j] = -1;
        }
    }

    int hash(int i)
    {
        return i%capacity;
    }

    boolean search(int i){
        int hash = hash(i);
        int j = hash;
        while (j!=-1){
            if(data[j]==i){
                return true;
            }
            i = (i+1)%capacity;
            if(i==hash){
                return false;
            }
        }
        return false;

    }

    boolean insert(int i){
        if(size==capacity){
            return false;
        }
        int hash = hash(i);
        int j = hash;
        while (data[j]!=-1 && data[j]!=-2 && data[j]!=i){
            j = (i+1)%j;
        }
        if(data[hash]==i){
            return false;
        }
        else{
            data[j] = i;
            size++;
            return true;
        }
    }

    void erase(int i){
        int hash  = hash(i);
        int j = hash;
        while (data[j]!=-1 && data[j]!=i){
            j = (j+1)%capacity;
        }
        if(data[j]==-1){
            return;
        }
        else{
            data[i] = -2;
            size--;
        }

    }
}
