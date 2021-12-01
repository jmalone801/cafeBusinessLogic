import java.util.ArrayList;

public class CafeUtil {

    // NUMBER 1
    public int getStreakGoal() {
        int number = 0;
        for(int i = 0; i <=10; i++) {
            number += i;
        }
        return number;
    }

    // NUMBER 2
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for(double price: prices) {
            sum += price;
        }
        return sum;
    }

    // NUMBER 3
    public void displayMenu(ArrayList<String> menuItems) {
        System.out.println(menuItems);
    }

    // NUMBER 4
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front you of.");
        customers.add(userName);
    }

}