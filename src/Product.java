public class Product {
    String name;
    double price;
    String desc;
    Category cat;

    Product(String name, double price, String desc, Category cat) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.cat = cat;
    }

    void productInfo() {
        System.out.println("Name:\t" + name + "\nDescription:\t" + desc + "\nPrice:\t" + price);

    }
}