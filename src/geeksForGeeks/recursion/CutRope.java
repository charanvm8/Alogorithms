package geeksForGeeks.recursion;

public class CutRope {

    public int cutRope(int ropeLen,int size1,int size2,int size3){
        if(ropeLen == 0){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
        int res = Math.max(cutRope(ropeLen-size1,size1,size2,size3),
                Math.max(cutRope(ropeLen-size2,size1,size2,size3),cutRope(ropeLen-size3,size1,size2,size3)));
        if(res == -1){
            return -1;
        }
        return res+1;
    }
}
