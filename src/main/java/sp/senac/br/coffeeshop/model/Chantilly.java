package sp.senac.br.coffeeshop.model;

public class Chantilly extends CoffeeDecorator{

    public Chantilly(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName(){
        return coffee == null ? "Chantilly" : coffee.getName() + ", com Chantilly";
    }

    @Override
    public String getDescription() {
        return coffee == null ? "Chantilly" : coffee.getDescription() + ", com Chantilly";
    }

    @Override
    public double getPrice() {
        return coffee == null ? 2.99 : coffee.getPrice() + 2.99;
    }

    @Override
    public String getImageUrl() {
        return coffee == null ? "chantilly" : coffee.getImageUrl() + "-chantilly";
    }
}
