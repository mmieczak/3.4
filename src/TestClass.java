public class TestClass {
    public static void main(String[] args) {

        Category cat1 = new Category("Water", "All kind of waters: sparkling and still");
        Category cat2 = new Category("Bars", "All kind of sweet bars");

        Product prod1 = new Product("Jurajska", 1.99, "Jurajska water - sparkling", cat1);
        Product prod2 = new Product("Perlage", 5.99, "Crystal clear still water", cat1);
        Product prod3 = new Product("Snickers", 1.5, "Carmel bar", cat2);
        Product prod4 = new Product("Pinta", 3.3, "Best beer on the world", cat1);
        Product prod5 = new Product("Mars", 1.5, "Carmel bar", null);

        SpecialOffer specOffer = new SpecialOffer(prod4, "3 for 2", "20200401-20200501", 0.2);

        prod1.productInfo();
        System.out.println("Category:\t" + prod1.cat.name);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        prod4.productInfo();
        System.out.println("Category:\t" + prod4.cat.name);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        specOffer.ShowOfferInfo();
    }
}
