package sp.senac.br.coffeeshop.model;

public class SimpleCoffee implements Coffee {

    @Override
    public double getPrice() {
        return 9.99;
    }

    @Override
    public String getName() {
        return "Café Simples";
    }

    @Override
    public String getImageUrl() {
        return "coffee";
    }

    @Override
    public String getDescription() {
        return "Delicioso café expresso";
    }
}