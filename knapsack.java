import java.util.Arrays;
public class knapsack{

    static class Item {
        double profit, weight;

        Item(double profit, double weight) {
            this.profit = profit;
            this.weight = weight;
        }
    }

    public static double getMaxProfit(Item[] items, int m) {
        // Sort items by profit-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.profit / b.weight, a.profit / a.weight));

        double totalProfit = 0.0; // Initialize total profit
        for (Item item : items) {
            if (m >= item.weight) {
                totalProfit += item.profit; // Take full item
                m -= item.weight;          // Reduce capacity
            } else {
                totalProfit += (item.profit / item.weight) * m; // Take fraction
                break; // Knapsack is full
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int n = 3;  // Number of objects
        int m = 20; // Maximum capacity of knapsack

        // Profits and weights of items
        Item[] items = {
            new Item(25, 18), // Profit: 25, Weight: 18
            new Item(24, 15), // Profit: 24, Weight: 15
            new Item(15, 10)  // Profit: 15, Weight: 10
        };

        double maxProfit = getMaxProfit(items, m);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}

