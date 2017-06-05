package JAT1Ex7.com.javadevelopers.apps;
import JAT1Ex7.com.javadevelopers.projects.*;

public class JAT1Ex7 extends A {
    public static void main(String[] args) {
        new B().test();
    }
}
class B extends JAT1Ex7 {
    public void test() {
        System.out.println("Value is: " + a); // Compiler Error – LINE 12
    }
}