public class FactoryArt implements AbstarctFactory {

  @Override
  public Furniture createFurniture(Types type) {
    switch (type) {
      case CHAIR:
        return new ArtChair();
      case SOFA:
        return new ArtSofa();
      case COFFEE_TABLE:
        return new ArtCoffeeTable();
      default:
        return null;
    }
  }

}