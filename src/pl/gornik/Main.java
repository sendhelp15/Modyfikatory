package pl.gornik;

import pl.gornik.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Olej Kujawski", "zdrowie i highiena", 6.99, 2, "l");
        Product product2 = new Product("Woda Vytatutas", "zdrowie i highiena", 1.99, 1.5, "l");
        Product product3 = new Product("Kotlet Schabowy", "żywność", 9.99, 1, "kg");
        Product product4 = new Product("Granat Zapalający", "niezdrowie", 166.99, 0.4, "kg");
        Product product5 = new Product("Papier Toaletowy", "zdrowie i highiena", 4.99, 2, "kg");
        Product product6 = new Product("Papier Toaletowy", "zdrowie i highiena", 10.59, 5, "kg");
        Product product7 = new Product("Papier Toaletowy", "zdrowie i highiena", 2.99, 0.5, "kg");
        Product product8 = new Product("Gazetka Lidla", "gazetka", 0.99, 200, "g");
        Product product9 = new Product("Ananas", "ananas", 7.99, 0.8, "kg");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);

        System.out.println("=======================================================================================");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("=======================================================================================");

        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase("zdrowie i highiena")) {
                System.out.println(product);
            }
        }
        System.out.println("=======================================================================================");

        System.out.println("Przedmioty zaczynające się od A do K: ");
        for (Product product : products) {
            if (product.getName().charAt(0) > 64 && product.getName().charAt(0) < 76) {
                System.out.println(product);
            }
        }

        System.out.println("=======================================================================================");
        System.out.println("Przedmioty zaczynające się od F do P: ");
        for (Product product : products) {
            if (product.getName().charAt(0) > 69 && product.getName().charAt(0) < 81) {
                System.out.println(product);
            }
        }

        System.out.println("=======================================================================================");
        System.out.println(product4.calcUnitPrice());

        System.out.println("=======================================================================================");
        for (Product product : products) {
            product.displayEverything();
        }

        System.out.println("=======================================================================================");
        System.out.println("Podaj literę, którą chcesz wyszukać");
        Scanner scan = new Scanner(System.in);
        String let = scan.nextLine();

        lookingForProductStartingWith(let, products);
        
        
    }
    
    public static void lookingForProductStartingWith(String let, List<Product> products){
        for (Product product : products) {
            if (product.getName().charAt(0) == let.charAt(0)) {
                System.out.println(product);
            }
        }
    }
}