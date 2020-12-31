package geeksForGeeks.recursion;

public class CutRope {

    public static int cutRope(int ropeLen,int size1,int size2,int size3){
        if(ropeLen<0){
            return -1;
        }
        if(ropeLen==0){
            return 0;
        }
        int res = Math.max(cutRope(ropeLen-size1,size1,size2,size3),Math.max(
                cutRope(ropeLen-size2,size1,size2,size3),cutRope(ropeLen-size3,size1,size2,size3)
        ));

        return res==-1?-1:res+1;
    }

    public static void main(String[] args) {
        System.out.println(cutRope(5,2,5,1));
    }
}
