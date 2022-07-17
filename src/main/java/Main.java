import coffee.Coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберете, пожалуйста, тип кофе:");
        System.out.println("1. Американо");
        System.out.println("2. Капучино");
        System.out.println("3. Эспрессо");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        Coffee coffee = new CoffeeFactory()
                .getCoffee(CoffeeType.valueOfPoint(type));

        System.out.println(coffee.getClass());
    }
}
