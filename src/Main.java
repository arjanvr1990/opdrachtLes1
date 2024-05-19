// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        int positiveOrNegativeOrZero = 0;
        if (positiveOrNegativeOrZero > 0) {
            System.out.println("It's positive");
        } else if (positiveOrNegativeOrZero < 0) {
            System.out.println("It's negative");
        } else if (positiveOrNegativeOrZero == 0){
            System.out.println("It's a zero");
        }


String bartender = "wine";

        switch (bartender) {
            case "cola", "fanta", "water":
                System.out.println("one coin");
                break;
            case "wine", "beer", "alcohol free beer":
                System.out.println("two coins");
                break;
            case "rum", "wiskey", "vodka":
                System.out.println("three coins");
                break;

        }

        int input1 = 11;
        int input2 = 20;

        int result = input1 * input2;

        System.out.println("de som " + input1 + " * " + input2 + " = " + result);




    }}