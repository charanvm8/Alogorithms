package dynamicProgramming.classroom;

public class MaxCuts {

    public static int maxCuts(int a, int b, int c, int val){
        if(val==0){
            return 0;
        }
        if(val<0){
            return -1;
        }
        int res = Math.max(maxCuts(a,b,c,val-a),
                Math.max(maxCuts(a,b,c,val-b),maxCuts(a,b,c,val-c)));
        if(res==-1){
            return res;
        }
        else{
            return 1+res;
        }
    }

    public static int maxCuts1(int a,int b,int c,int val){
        if(val==0){
            return -1;
        }
        int[] res = new int[val+1];
        for(int i=1;i<=val;i++){

        }
        return res[val];
    }

    public static void main(String[] args) {
        System.out.println(maxCuts1(1,2,3,5));
    }
}
