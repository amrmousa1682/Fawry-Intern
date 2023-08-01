public class BestSingleton {
  private static BestSingleton obj;

  private BestSingleton() {
    try {
      Thread.sleep(1000);
      System.out.println("object created in best singleton");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  public static BestSingleton getInstance() {
    if (obj == null) {
      synchronized (BestSingleton.class) {
        if (obj == null) {
          obj = new BestSingleton();
        }
      }
    }
    return obj;
  }
}
