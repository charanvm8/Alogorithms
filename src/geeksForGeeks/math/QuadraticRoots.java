package geeksForGeeks.math;

public class QuadraticRoots {

    public void quadraticRoots(int a,int b,int c)
    {
        double z = Math.sqrt(Math.pow(b,2)-(4*a*c));
        if(z!=z){
            System.out.print("Imaginary");
            return;
        }
        double cal1 = (-b-z)/(2.0*a);
        double cal2 = (-b+z)/(2.0*a);

        System.out.print((int)Math.floor(Math.max(cal1,cal2))+ " " + (int)Math.floor(Math.min(cal1,cal2)));
    }
}
