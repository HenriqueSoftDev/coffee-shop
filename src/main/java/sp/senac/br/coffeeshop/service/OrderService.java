package sp.senac.br.coffeeshop.service;

import org.springframework.stereotype.Service;
import sp.senac.br.coffeeshop.model.Chantilly;
import sp.senac.br.coffeeshop.model.Coffee;
import sp.senac.br.coffeeshop.model.Milk;
import sp.senac.br.coffeeshop.model.SimpleCoffee;

import java.util.HashSet;
import java.util.Set;

@Service
public class OrderService {
    private final Set<Coffee> orderItems = new HashSet<>();

    public void addProductToOrder(Coffee product) {
        orderItems.add(product);
    }

    public void removeProductFromOrder(Coffee product) {
        orderItems.remove(product);
    }

    public Coffee getOrder() {

        if (orderItems.isEmpty()){
            return getEmptyOrderPlaceholder();
        }

        Coffee cafeSimples = new SimpleCoffee();

        for (Coffee decorado : orderItems){
            if (decorado instanceof Milk){
                cafeSimples = new Milk(cafeSimples);
            }
            if (decorado instanceof Chantilly){
                cafeSimples = new Chantilly(cafeSimples);
            }
        }

        return cafeSimples;
    }

    private Coffee getEmptyOrderPlaceholder() {
        return new Coffee() {
            @Override
            public String getName() {
                return "nenhum produto adicionado";
            }

            @Override
            public String getImageUrl() {
                return "placeholder";
            }

            @Override
            public String getDescription() {
                return "adicione produtos ao pedido";
            }

            @Override
            public double getPrice() {
                return 0;
            }
        };
    }

}
