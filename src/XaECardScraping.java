import java.util.Random;

public class XaECardScraping {
    private Random rand = new Random();
    private String[] cardBrands = {"Visa", "Mastercard", "American Express", "Discover"};
    private String[] cardTypes = {"Debit", "Credit"};
    private int minCardNumber = 100000000;
    private int maxCardNumber = 999999999;

    public String scrapeCard() {
        String brand = cardBrands[rand.nextInt(cardBrands.length)];
        String type = cardTypes[rand.nextInt(cardTypes.length)];
        int cardNumber = rand.nextInt(maxCardNumber - minCardNumber + 1) + minCardNumber;
        return "Brand: " + brand + ", Type: " + type + ", Number: " + cardNumber;
    }
}
