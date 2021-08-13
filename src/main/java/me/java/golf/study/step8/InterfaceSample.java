package me.java.golf.study.step8;

public interface InterfaceSample {
    
    int plus(int a, int b);

    default int multiple(int a, int b) {
        return a * b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
}

class Calculator {

    public static void main(String[] args) {

        int minusNum = InterfaceSample.minus(5, 3);

        System.out.println(minusNum);
 
        InterfaceSample interfaceSample = new InterfaceSample(){

            @Override
            public int plus(int a, int b) {
                return a + b;
            }
            
            // // Method does not override method from its superclass 
            // @Override
            // // Inner classes cannot have static declarations
            // int minus(int a, int b) { 
            //     return a - b;
            // }        
        };

        
        // 구현 방식 1 = lambda 방식 (JDK 8+)
        InterfaceSample interfaceSampleOflamda = (a, b) -> a + b;
        
        System.out.println(interfaceSample + " " + interfaceSampleOflamda);
    }
}
