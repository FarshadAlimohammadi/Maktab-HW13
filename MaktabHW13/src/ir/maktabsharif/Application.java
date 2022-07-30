package ir.maktabsharif;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        MyThred myThred = new MyThred();

        myThred.start();

        Thread.sleep(2000);

        myThred.interrupt();

    }
}
