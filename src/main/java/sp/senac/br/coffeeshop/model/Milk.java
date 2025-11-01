package sp.senac.br.coffeeshop.model;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName(){
        return coffee == null ? "Leite" : coffee.getName() + ", com Leite";
    }

    @Override
    public String getDescription() {
        return coffee == null ? "Leite" : coffee.getDescription() + ", com Leite";
    }

    @Override
    public double getPrice() {
        return coffee == null ? 1.00 : coffee.getPrice() + 1.00;
    }

    @Override
    public String getImageUrl() {
        return coffee == null ? "milk" : coffee.getImageUrl() + "-milk";
    }
}
