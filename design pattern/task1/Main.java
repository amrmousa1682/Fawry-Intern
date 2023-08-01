public class Main {
  public static void main(String[] args) {
    AbstarctFactory factoryArt = new FactoryArt();
    AbstarctFactory factoryModern = new FactoryModern();
    AbstarctFactory factoryVictorian = new FactoryVictorian();
    Furniture chairArt = factoryArt.creaFurniture(Types.CHAIR);
    Furniture sofaArt = factoryArt.creaFurniture(Types.SOFA);
    Furniture coffeeTableArt = factoryArt.creaFurniture(Types.COFFEE_TABLE);
    Furniture chairModern = factoryModern.creaFurniture(Types.CHAIR);
    Furniture sofaModern = factoryModern.creaFurniture(Types.SOFA);
    Furniture coffeeTableModern = factoryModern.creaFurniture(Types.COFFEE_TABLE);
    Furniture chairVictorian = factoryVictorian.creaFurniture(Types.CHAIR);
    Furniture sofaVictorian = factoryVictorian.creaFurniture(Types.SOFA);
    Furniture coffeeTableVictorian = factoryVictorian.creaFurniture(Types.COFFEE_TABLE);
    chairArt.print();
    sofaArt.print();
    coffeeTableArt.print();
    chairModern.print();
    sofaModern.print();
    coffeeTableModern.print();
    chairVictorian.print();
    sofaVictorian.print();
    coffeeTableVictorian.print();
  }
}