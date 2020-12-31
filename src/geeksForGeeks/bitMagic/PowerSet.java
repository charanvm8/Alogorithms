package geeksForGeeks.bitMagic;

public class PowerSet {

    public static void printAllSubsets(String s){
        int range = 1<<s.length();
        char[] chars = s.toCharArray();
        for(int i=0;i<range;i++){
            String res = "";
            int ref = i;
            int counter = 0;
            while(ref>0){
                if((ref&1) == 1){
                    res+=chars[counter];
                }
                counter++;
                ref = ref>>1;
            }
            System.out.println(res);
        }

    }

    public static void main(String[] args) {
        String s = "abc";
        printAllSubsets(s);
    }
}
