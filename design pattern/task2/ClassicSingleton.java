
public class ClassicSingleton {
  private static ClassicSingleton obj;

  private ClassicSingleton() {
    try {
      Thread.sleep(1000);
      System.out.println("object created in classic singleton");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }

  public static ClassicSingleton getInstance() {
    if (obj == null) {
      obj = new ClassicSingleton();
    }
    return obj;
  }

}