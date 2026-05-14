package Java8Practice;

public class Order {
    int id;
    double amount;

    Order(int id,double amount){
        this.id = id;
        this.amount= amount;


    }
    @Override
    public String toString(){
        return "Order{id=" + id + ", amount=" + amount + "}";

    }
}
