package JAT1Ex5.com.javadevelopers.apps;
import JAT1Ex5.com.javadevelopers.projects.*;

public class JAT1Ex5 extends A {
    public static void main(String[] args) {
        new JAT1Ex5().test();
    }
    public void test() {
        System.out.println("Value is: " + a); // Compiler Error – LINE 11
    }
}
