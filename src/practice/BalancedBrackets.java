package practice;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        Stack<Character> valueStack = new Stack();
        for(int i=0;i<str.length();i++){
            char val = str.charAt(i);
            if(val==']' && valueStack.size()>0 && valueStack.pop()=='['){
                continue;
            }
            else if(val=='}' && valueStack.size()>0 && valueStack.pop()=='{'){
                continue;
            }
            else if(val==')' && valueStack.size()>0 && valueStack.pop()=='('){
                continue;
            }
            else{
                valueStack.push(str.charAt(i));
            }
        }
        System.out.println(valueStack);
        return valueStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(balancedBrackets(")[]}"));

        char q = '{';
        System.out.println('{'==   q);
    }
}
