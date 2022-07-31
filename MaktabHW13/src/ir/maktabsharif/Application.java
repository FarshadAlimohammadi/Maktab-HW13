package ir.maktabsharif;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        //part1();

        part2();


    }

    private static void part2() {
        final CheckingAccount ca = new CheckingAccount(100);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name =Thread.currentThread().getName();
                for (int i = 0; i < 10; i++)
                    System.out.println(name + " withdraws $10: " + ca.withdraw(10));
            }
        };
        Thread thdHusband = new Thread(r);
        thdHusband.setName("Husband");
        Thread thdWife = new Thread(r);
        thdWife.setName("Wife");
        thdHusband.start();
        thdWife.start();
    }

    private static void part1() throws InterruptedException {
        MyThred myThred = new MyThred();

        myThred.start();

        Thread.sleep(2000);

        myThred.interrupt();
    }


}
