package gb.javacore.lesson4;

import gb.javacore.lesson4.Model.*;
import gb.javacore.lesson4.Service.ShopService;
import gb.javacore.lesson4.View.View;


public class Controller {

    private ListCustomers listCustomers = new ListCustomers(
            new Customer("Ivan", "Semenov", 25, "+79104326677"),
            new Customer("Petr", "Kozlov", 25, "+79102323675")
    );

    private ListProducts listProducts = new ListProducts(
            new Product("Milk", 100),
            new Product("Bread", 70.5f),
            new Product("Meat", 1008.7f),
            new Product("Chocolate", 225.6f),
            new Product("Tea", 300)
    );
    private ShopService shopService = new ShopService(listCustomers, listProducts);

    private void orders(){
        Order[] orders = shopService.userOrders();
        View.printOrders(orders);
        View.printCountOrders(orders);
    }

    public static void buttonClick(){
        Controller conrtol = new Controller();
        conrtol.orders();
    }
}
