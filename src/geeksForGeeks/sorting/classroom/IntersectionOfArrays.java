package geeksForGeeks.sorting.classroom;

public class IntersectionOfArrays {

    public static void intersectionOfArrays(int[] a,int[] b){
        int aTotal = a.length;
        int bTotal = b.length;
        int aCurr = 0;
        int bCurr = 0;
        int prev = Integer.MIN_VALUE;
        while (aCurr<aTotal && bCurr<bTotal){
            if(a[aCurr] == b[bCurr]){
                if(prev!=a[aCurr]){
                    prev = a[aCurr];
                    System.out.println(a[aCurr]);
                }
                aCurr++;
                bCurr++;

            }else if(a[aCurr]>b[bCurr]){
                bCurr++;
            }
            else{
                aCurr++;
            }
        }
    }
}
