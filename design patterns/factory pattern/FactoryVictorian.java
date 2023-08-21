public class FactoryVictorian implements AbstarctFactory {

  @Override
  public Furniture createFurniture(Types type) {
    switch (type) {
      case CHAIR:
        return new VictorianChair();
      case SOFA:
        return new VictorianSofa();
      case COFFEE_TABLE:
        return new VictorianCoffeTable();
      default:
        return null;
    }
  }

}