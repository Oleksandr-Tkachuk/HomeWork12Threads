package org.example;

public class Task1 {
    public static void main(String[] args) {

        Thread timeThread = new Thread(() -> {
            int seconds = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                    seconds++;
                    System.out.println("Пройшло " + seconds + " секунд");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread messageThread = new Thread(() -> {
            int counter = 0;
            while (true) {
                try {
                    Thread.sleep(5000);
                    counter++;
                    System.out.println("Минуло " + counter * 5 + " секунд");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        timeThread.start();
        messageThread.start();
    }
}