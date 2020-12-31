package geeksForGeeks.arrays;

public class SubsetsOfK {

    public static int numTeams(int[] rating) {
        int len = rating.length;
        if(len<3){
            return 0;
        }
        return numTeamsForThree(rating,len,0,1,2);
    }

    public static int numTeamsForThree(int[] rating,int len,int i,int j,int k){
        if(i==j || j==k || k==len){
            return 0;
        }
        System.out.println(i+" "+j+" "+k);
        int res = 0;
        if((rating[i]>rating[j] && rating[j]>rating[k]) ||
                (rating[i]<rating[j] && rating[j]<rating[k])){
            res++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] rating = {2,5,3,4,1};
        System.out.println(numTeams(rating));

    }
}
