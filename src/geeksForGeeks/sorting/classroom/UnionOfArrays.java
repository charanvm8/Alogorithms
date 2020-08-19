package geeksForGeeks.sorting.classroom;

public class UnionOfArrays {

    public static void unionOfArrays(int[] a,int[] b){
        int aLen = a.length;
        int bLen = b.length;
        int aCurr = 0;
        int bCurr = 0;
        int curr = Integer.MIN_VALUE;
        while (aCurr<aLen && bCurr<bLen){
            if(a[aCurr] == curr){
                aCurr++;
            }
            else if(b[bCurr] == curr){
                bCurr++;
            }
            else if(a[aCurr]==b[bCurr]){
                System.out.println(a[aCurr]);
                curr = a[aCurr];
                aCurr++;
                bCurr++;
            }
            else if(a[aCurr]>b[bCurr]){
                curr = b[bCurr++];
                System.out.println(curr);
            }
            else{
                curr = a[aCurr++];
                System.out.println(curr);
            }
        }

        while(aCurr<aLen){
            System.out.println(a[aCurr++]);
        }
        while(bCurr<bLen){
            System.out.println(b[bCurr++]);
        }
    }

}
