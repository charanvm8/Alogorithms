import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] subarraySort(int[] array) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=1;i<array.length;i++){
            int currIndex = i;
            int prevIndex = i-1;
            boolean changes = false;
            while(prevIndex>=0 && array[currIndex]<array[prevIndex]){
                changes = true;
                prevIndex--;
            }
            if(changes){
                first = Math.min(first,prevIndex+1);
                second = i;
            }
        }
        return new int[]{first==Integer.MAX_VALUE?-1:first,second==Integer.MAX_VALUE?-1:second};
    }

    public static void main(String[] args) {

//        List<Object> obj = new ArrayList<Object>(Arrays.asList(1,2,3,4,5));
//        System.out.println(obj.size());
//        System.out.println(ArrayList.class);
//        System.out.println(obj.getClass());
//        for(Object objs:obj){
//            System.out.print(objs.getClass()==Integer.class);
//        }
//        Integer firstObject = (Integer)obj.get(0);
//        System.out.println(firstObject);
//        Integer i=0;
//        System.out.print(i+1);
//
//        String s = "charan";
//        System.out.println(s+'r');
        int[] arr = new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        //int[] arr = new int[]{2,1};
            for(int i:subarraySort(arr)){
            //System.out.print(i);
        }

            List<Integer> arrList = new ArrayList<>();
            arrList.add(4);
        System.out.println(arrList.get(0));
        //System.out.println(subarraySort(arr));
    }
}
