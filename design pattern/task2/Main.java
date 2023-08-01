
public class Main extends Thread {

  public static void main(String[] args) {
    runnable r=new runnable();
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);
    t1.start();
    t2.start();
  }
}

class runnable implements Runnable {

  @Override
  public void run() {
    ClassicSingleton x = ClassicSingleton.getInstance();
    BestSingleton y = BestSingleton.getInstance();
  }

}