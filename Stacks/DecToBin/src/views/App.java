package views;

import controllers.ConvertController;

public class App {
    public static void main(String[] args) throws Exception {
        var num = Integer.parseInt(System.console().readLine("Enter a number between 0 and 1000 to convert to binary: "));

        if (num < 0 || num > 1000) {
            System.out.println("Invalid number!");
            return;
        }

        var controller = new ConvertController();

        System.out.println(controller.decToBin(num));
    }
}
