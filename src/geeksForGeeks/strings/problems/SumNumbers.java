package geeksForGeeks.strings.problems;

public class SumNumbers {

    public static long findSum(String s){

        String res = "";
        long val = 0;
        for(int i=0;i<s.length();i++){
            System.out.println((int)s.charAt(i));
            if((int)s.charAt(i)>47 && (int)s.charAt(i)<58){
                res+=s.charAt(i);
            }
            else{
                if(res.length()>0){
                    val+=(long)Integer.valueOf(res);
                }
                res = "";
            }
        }
        if(res.length()>0){
            val+=(long)Integer.valueOf(res);
        }
        return val;
    }
}
