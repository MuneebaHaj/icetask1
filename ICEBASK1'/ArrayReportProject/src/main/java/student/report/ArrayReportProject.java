package student.report;

public class ArrayReportProject {

    public static void main(String[] args) {
        // 2D array for sales: rows = devices, columns = months
        int[][] sales = {
            {30, 15, 35}, // iPhone 7
            {20, 25, 30}, // Samsung S8
            {25, 11, 32}  // Huawei Mate 10
        };

        String[] devices = {"iPhone 7", "Samsung S8", "Huawei Mate 10"};
        String[] months = {"JAN", "FEB", "MAR"};

        int[] deviceTotals = new int[3];
        int[] monthlyTotals = new int[3];
        int grandTotal = 0;

        System.out.println("***************************************");
        System.out.println("   TOP CELL PHONE SALES REPORT - 2018");
        System.out.println("***************************************");
        System.out.printf("%-15s%-8s%-8s%-8s%-8s%n", "", months[0], months[1], months[2], "TOTAL");

        // Calculate totals per device and per month
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-15s", devices[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-8d", sales[i][j]);
                deviceTotals[i] += sales[i][j];
                monthlyTotals[j] += sales[i][j];
            }
            System.out.printf("%-8d%n", deviceTotals[i]);
            grandTotal += deviceTotals[i];
        }

        // Print monthly totals
        System.out.printf("%-15s", "MONTHLY TOTAL");
        for (int total : monthlyTotals) {
            System.out.printf("%-8d", total);
        }
        System.out.printf("%n***************************************%n");
    }
}