public class SpecialOffer {
    Product prod;
    String offerDesc;
    String timeFrame;
    double discount;

    SpecialOffer(Product prod, String offerDesc, String timeFrame, double discount) {
        this.prod = prod;
        this.offerDesc = offerDesc;
        this.timeFrame = timeFrame;
        this.discount = discount;
    }

    void ShowOfferInfo() {
        System.out.println("Product:\t" + prod.name +
                "\nSpecial Offer:\t" + offerDesc +
                "\nValid within:\t" + timeFrame +
                "\nNew price:\t" + (prod.price - (prod.price * discount)));
    }
}