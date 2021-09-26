public class PingPong extends Thread{

    private String message;
    private static String turn;

    public PingPong(String msg){
        this.message = msg;
    }
    @Override
    public void run() {
        while(true) {
            playTurn();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void playTurn(){
        synchronized(PingPong.class) {

            if (!message.equals(turn)) {
                turn = message;
                System.out.println(message);
            }
        }
    }
}
