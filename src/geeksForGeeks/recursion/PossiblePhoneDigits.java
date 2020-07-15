package geeksForGeeks.recursion;

public class PossiblePhoneDigits {

    public static char[] test(int x){
        char[] result;
        switch(x){
            case 2:
                result = new char[]{'A','B','C'};
                return result;
            case 3:
                result = new char[]{'A','B','C'};
                return result;
            case 4:
                result = new char[]{'A','B','C'};
                return result;
            case 5:
                result = new char[]{'A','B','C'};
                return result;
            case 6:
                result = new char[]{'A','B','C'};
                return result;
            case 7:
                result = new char[]{'A','B','C'};
                return result;
            case 8:
                result = new char[]{'A','B','C'};
                return result;
            case 9:
                result = new char[]{'A','B','C'};
                return result;
            default:
                result = new char[]{};
                return result;
        }
    }

    public static void main(String[] args) {
        char[] ch = test(0);
        System.out.println(ch);
    }
}
