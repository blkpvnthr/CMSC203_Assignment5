/*
 * Class: CMSC203 
 * Instructor:Ashique Tanveer
 * Description: A utility class that manipulates a two-dimensional ragged array of doubles.
 * Due: 04/08/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: ___Asmaa Abdul-Amin_______
*/


package application;

public class HolidayBonus {
    private static final double HIGHEST_SALES_BONUS = 100.0; // Constant bonus amount for the store with the highest sales
    private static final double LOWEST_SALES_BONUS = 50.0;   // Constant bonus amount for the store with the lowest sales
    private static final double OTHER_STORES_BONUS = 75.0;   // Constant bonus amount for all other stores

    public static double[] calculateHolidayBonus(double[][] sales) {
        double[] bonuses = new double[sales.length];

        for (int i = 0; i < sales.length; i++) {
            double highestSales = TwoDimRaggedArrayUtility.getHighestInRow(sales, i);
            double lowestSales = TwoDimRaggedArrayUtility.getLowestInRow(sales, i);
            double totalSales = TwoDimRaggedArrayUtility.getRowTotal(sales, i);
            double bonus;

            if (totalSales == highestSales) {
                bonus = HIGHEST_SALES_BONUS;
            } else if (totalSales == lowestSales) {
                bonus = LOWEST_SALES_BONUS;
            } else {
                bonus = OTHER_STORES_BONUS;
            }

            bonuses[i] = bonus;
        }

        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] sales) {
        double totalBonus = 0.0;
        double[] bonuses = calculateHolidayBonus(sales);

        for (double bonus : bonuses) {
            totalBonus += bonus;
        }

        return totalBonus;
    }
}
