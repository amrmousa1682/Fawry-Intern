public class FactoryModern implements AbstarctFactory {

  @Override
  public Furniture createFurniture(Types type) {
    switch (type) {
      case CHAIR:
        return new ModernChair();
      case SOFA:
        return new ModernSofa();
      case COFFEE_TABLE:
        return new ModernCoffeeTable();
      default:
        return null;
    }
  }

}
