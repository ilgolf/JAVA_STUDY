package me.java.golf.study.step11;

public class Enum01 {

    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();

        for(Rainbow rb : arr) {
            System.out.println(rb);
        }
    }
}