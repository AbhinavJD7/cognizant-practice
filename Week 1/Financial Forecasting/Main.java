import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months of sales data: ");
        int months = sc.nextInt();

        double[] sales = new double[months];
        double sum = 0.0;
        for (int i = 0; i < months; i++) {
            System.out.print("Enter sales for month " + (i+1) + ": ");
            sales[i] = sc.nextDouble();
            sum += sales[i];
        }

        double average = sum / months;
        System.out.println("Average monthly sales: Rs. " + average);

        System.out.print("Enter number of months to forecast: ");
        int forecastMonths = sc.nextInt();

        System.out.println("\n--- Sales Forecast ---");
        for (int i = 1; i <= forecastMonths; i++) {
            System.out.println("Forecast for month " + (months + i) + ": Rs. " + average);
        }

        System.out.println("Total forecasted sales for next " + forecastMonths + " months: Rs. " + (average * forecastMonths));
    }
}
