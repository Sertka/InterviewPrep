public class MainL3 {
    public static void main(String[] args) {
        // Задание 1
//        PingPong t1 = new PingPong("Ping");
//        PingPong t2 = new PingPong("Pong");
//        t1.start();
//        t2.start();


        // Задание 2
        CounterLock cl = new CounterLock();

        Thread th1 = new Thread(() -> testCount(cl));
        Thread th2 = new Thread(() -> testCount(cl));
        th1.start();
        th2.start();
    }

    public static void testCount(CounterLock cl){
        for (int i = 0; i < 20000; i++) {
            System.out.println(cl.inc());
            //System.out.println(cl.incWOLock());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
