package educative.topKElements;


import java.util.*;

public class TopKElements {

    public static List<Integer> getTopKList(int[] arr,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            queue.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>queue.peek()){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return new ArrayList<>(queue);
    }

    public static String[] getAllPaths(String domainPath){
        if(domainPath==null){
            return null;
        }
        String[] currPaths = domainPath.split("/");
        boolean isFolder = domainPath.charAt(domainPath.length()-1)=='/';
        int currPathsLength = currPaths.length;
        StringBuilder currString = new StringBuilder();
        String[] allPaths = new String[currPathsLength];
        for(int i=0;i<currPathsLength-1;i++){
            currString.append(currPaths[i]+"/");
            allPaths[i] = currString.toString();
        }
        if(isFolder){
            currString.append(currPaths[currPathsLength-1]+"/");
            allPaths[currPathsLength-1] = currString.toString();
        }
        else{
            currString.append(currPaths[currPathsLength-1]);
            allPaths[currPathsLength-1] = currString.toString();
        }
        return allPaths;
    }

    class Person {
        String s;
        String val;

        Person(String s,String val){
            this.s = s;
            this.val = val;
        }

//        @Override
//        public int hashCode() {
//            int result = 17;
//            result = 31 * result + name.hashCode();
//            result = 31 * result + age;
//            result = 31 * result + passport.hashCode();
//            return result;
//        }

    }

    public static String getDateString(String summary){
        int a = summary.lastIndexOf('_');
        int b = summary.indexOf(".zip");
        return summary.substring(a+1,b);

    }


    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Map.Entry<Integer,Integer> value:map.entrySet()){
            System.out.println(value.getValue());

        }
        char z = 'a';

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> test = new ArrayList<>();
        //test.add

        String s  =  "a/b/c/";


        String[] res = getAllPaths(s);
        for(String i:res){
            System.out.println(i);
        }


        Map<Integer,Integer> test1 = new HashMap();


        String fafsd = "20210331_BioPreferred_Product_Report.ZIP";
        System.out.println(fafsd.substring(0,8));

        int sdf = 13;
        System.out.println(13>>1);

        String[] dsaf = {"Charan","Vara"};
        for(String y:dsaf){
            System.out.println(y);
        }


        String dsfa = "ABC|BFA|EEW";
        StringBuilder query = new StringBuilder();
        query.append(" org_id in ('");
        query.append(dsfa.replace("|","','"));
        query.append("')");
        System.out.println(query.toString());
        int[] rtest = {10,20};
        List<Integer> testing = new ArrayList<>();
    }


    public static void testMethod(int variable) {
        
    }

}
