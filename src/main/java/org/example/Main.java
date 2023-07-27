package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in thread:: " + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        });
        thread.setName("worker");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("in thread:: " + Thread.currentThread().getName());
        thread.start();
        System.out.println("Hello world!");
    }
}