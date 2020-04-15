package shapes;

import java.util.*;

public class TestSelection {

    public static void generateAlphaNumeric(String number){
        List<String> alphaNumerics = new ArrayList<>();

        createAlphaNumerics(number.toCharArray(),number.length()-1,alphaNumerics);

        for(String s:alphaNumerics){
            System.out.println(s);
        }

        System.out.println(alphaNumerics.size());

        Set<String> newSet = new HashSet<>(alphaNumerics);

        System.out.println(newSet.size());
    }

    public static void createAlphaNumerics(char[] number,int index,List<String> alphaNumbers){
        if(index==-1){
            return;
        }
        char[] getAlphabets = getAlphabetsForGivenNumber(number[index]);
        for(int i=0;i<getAlphabets.length;i++){
            number[index] = getAlphabets[i];
            alphaNumbers.add(String.valueOf(number));
            createAlphaNumerics(number,index-1,alphaNumbers);
        }

    }


    public static char[] getAlphabetsForGivenNumber(char a){
        switch (a){
            case '1':
                char[] oneAlphabets = {'1'};
                return oneAlphabets;
            case '2':
                char[] twoAlphabets = {'A','B','C','2'};
                return twoAlphabets;
            case '3':
                char[] threeAlphabets = {'D','E','F','3'};
                return threeAlphabets;
            case '4':
                char[] fourAlphabets = {'G','H','I','4'};
                return fourAlphabets;
            case '5':
                char[] fiveAlphabets = {'J','K','L','5'};
                return fiveAlphabets;
            case '6':
                char[] sixAlphabets = {'M','N','O','6'};
                return sixAlphabets;
            case '7':
                char[] sevenAlphabets = {'P','Q','R','S','7'};
                return sevenAlphabets;
            case '8':
                char[] eightAlphabets = {'T','U','V','8'};
                return eightAlphabets;
            case '9':
                char[] nineAlphabets = {'W','X','Y','Z','9'};
                return nineAlphabets;
            case '0':
                char[] zeroAlphabets = {'0'};
                return zeroAlphabets;
            default:
                char[] defAlphabets = {};
                return defAlphabets;
        }
    }

    //public static String

    public static void main(String[] args) {
        generateAlphaNumeric("2403");
        String s = "a";



        int size = 41;
        int remainder = size%10;
        int division = size/10;
        int pages = remainder>0?division+1:division;
        //System.out.println(pages);
    }
}

