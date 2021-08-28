package me.java.golf.study.step10;

public class Thread02 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadWithRunnable());
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread2.setPriority(10);

        thread1.start();
        thread2.start();

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
    }
}
