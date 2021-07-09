package oop;

public class Practice extends Test{

    @Override
    public int getValue(int val) {
        return 10;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.printValue();
    }
}


abstract class Test {

    abstract public int getValue(int value);

    public void printValue() {
        System.out.println("Here");
    }
}
