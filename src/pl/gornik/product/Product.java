package pl.gornik.product;

public class Product {
    String name;
    private String category;
    private double price;
    private double sizePack;
    private String unit;

    public Product(String name, String category, double price, double sizePack, String unit) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sizePack = sizePack;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "pl.gornik.product.Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", sizePack=" + sizePack +
                ", unit='" + unit + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double calcUnitPrice() {
        double unitPrice;
        switch (unit) {

            case "kg", "l" -> {
                unitPrice = price / sizePack;
            }

            case "ml", "g" -> {
                unitPrice = price * 1000 / sizePack;
            }

            default -> {
                unitPrice = price / sizePack;
            }
        }
        return unitPrice;
    }

    public void displayEverything() {
        System.out.printf("Nazwa produktu: %s, cena jednostkowa: %5.2fzł/%s, kategoria: %s \n", name, calcUnitPrice(), unit, category);
    }
}
