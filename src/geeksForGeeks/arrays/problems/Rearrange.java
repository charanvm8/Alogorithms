package geeksForGeeks.arrays.problems;

public class Rearrange {

    static void arrange(long arr[], int n)
    {
        int i = 0;

        // changing the array elements
        for(i = 0; i < n; i++)
            arr[(int)i]+=(arr[(int)arr[(int)i]]%n)*n;

        // this step will rearrange the elements finally
        for(i = 0; i < n; i++)
            arr[(int)i] = arr[(int)i]/n;
    }
}
