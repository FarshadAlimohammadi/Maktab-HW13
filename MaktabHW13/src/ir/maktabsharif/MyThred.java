package ir.maktabsharif;

import java.util.Date;

public class MyThred extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted thread exception");
                return;
            }
        }
    }
}
