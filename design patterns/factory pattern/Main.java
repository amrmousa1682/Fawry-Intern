public class Main {
  public static void main(String[] args) {
    AbstarctFactory factoryArt = new FactoryArt();
    AbstarctFactory factoryModern = new FactoryModern();
    AbstarctFactory factoryVictorian = new FactoryVictorian();
    Furniture chairArt = factoryArt.createFurniture(Types.CHAIR);
    Furniture sofaArt = factoryArt.createFurniture(Types.SOFA);
    Furniture coffeeTableArt = factoryArt.createFurniture(Types.COFFEE_TABLE);
    Furniture chairModern = factoryModern.createFurniture(Types.CHAIR);
    Furniture sofaModern = factoryModern.createFurniture(Types.SOFA);
    Furniture coffeeTableModern = factoryModern.createFurniture(Types.COFFEE_TABLE);
    Furniture chairVictorian = factoryVictorian.createFurniture(Types.CHAIR);
    Furniture sofaVictorian = factoryVictorian.createFurniture(Types.SOFA);
    Furniture coffeeTableVictorian = factoryVictorian.createFurniture(Types.COFFEE_TABLE);
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