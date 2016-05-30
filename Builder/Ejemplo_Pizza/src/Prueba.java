
public class Prueba {

	public static void main(String[] args) {
		
		 Cocina cocina = new Cocina();
	     PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
	     PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
	 
	     cocina.setPizzaBuilder( hawai_pizzabuilder );
	     cocina.construirPizza();
	 
	     Pizza pizza = cocina.getPizza();
	}

}
