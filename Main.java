class Main {
  public static void main(String[] args) {
    System.out.println("Proyecto Heroe");
    TestPersonaje tp = new TestPersonaje();
    tp.ejecutarTests();


    Receta receta = new Receta("Alcohol");
    receta.addIngrediente("a1");
    receta.addIngrediente("a2");
    receta.addIngrediente("a3");

    System.out.println(receta.toString());
    
  }
}