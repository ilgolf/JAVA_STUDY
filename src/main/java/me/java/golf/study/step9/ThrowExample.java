package me.java.golf.study.step9;

public class ThrowExample {
    public void someMethod() {
        int a = 0;
        
        // ... code

        if(a < 1) {
            throw new RuntimeException();
        }

        // ... code
    }

    public static void main(String[] args) {
        try {
            throw new RuntimeException("hello");
        } catch(RuntimeException e) {
            e.printStackTrace();
        }        
    }
}
