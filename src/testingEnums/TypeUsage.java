package testingEnums;

public class TypeUsage {

    public static void main(String[] args) {
        Types t = Types.getType("saved");
        System.out.println(t.getValue());
        Character s = 'z';
        //System.out.println((int) s);
        String q = "charaz";
        char[] result = new char[q.length()];
        for(int i=0;i<q.length();i++){
            int res = q.charAt(i);
            res = res+2;
            if(res>122){
                res = res-26;
            }
            result[i]= (char)res;
        }
        System.out.println(result);
        System.out.println(52%26);
    }
}
