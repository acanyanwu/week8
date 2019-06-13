package day2.prob1;

import java.util.function.Predicate;

public class MyTestClass
{   
    private final int x;
    private final int y;
    
    public MyTestClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    
    @Override
    public String toString() {
        return String.format("[x=%s, y=%s]", x, y);
    }
    
    public Predicate<Object> checkIfEqual() {
        System.out.println("****checking equality with " + this);
        Predicate<Object> check = this::equals;
        return check;
    }
    
    
    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if((other instanceof MyTestClass) == false) return false;
        MyTestClass mtc = (MyTestClass) other;
        return mtc.x == this.x && mtc.y == this.y;
    }
    
    public static void main(String[] args) {
        MyTestClass testClass = new MyTestClass(3, 4);
        MyTestClass testClass2 = new MyTestClass(7, 109);
        MyTestClass testClass3 = new MyTestClass(3, 4);
        System.out.println(String.format("checkIfEqual %s and %s = %s", testClass, testClass2, testClass.checkIfEqual().test(testClass2)));
        System.out.println(String.format("checkIfEqual %s and %s = %s", testClass, testClass3, testClass.checkIfEqual().test(testClass3)));
    }
}
