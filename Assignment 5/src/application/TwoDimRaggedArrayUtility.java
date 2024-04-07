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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int rows = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            rows++;
        }
        scanner.close();

        double[][] array = new double[rows][];
        scanner = new Scanner(file);
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().trim().split("\\s+");
            array[i] = new double[line.length];
            for (int j = 0; j < line.length; j++) {
                array[i][j] = Double.parseDouble(line[j]);
            }
        }
        scanner.close();
        return array;
    }

    public static void writeToFile(double[][] array, File file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        for (double[] row : array) {
            for (double value : row) {
                writer.print(value + " ");
            }
            writer.println();
        }
        writer.close();
    }

    public static double getTotal(double[][] array) {
        double total = 0.0;
        for (double[] row : array) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] array) {
        double total = getTotal(array);
        int numElements = 0;
        for (double[] row : array) {
            numElements += row.length;
        }
        return total / numElements;
    }

    public static double getRowTotal(double[][] array, int rowIndex) {
        double total = 0.0;
        if (rowIndex >= 0 && rowIndex < array.length) {
            for (double value : array[rowIndex]) {
                total += value;
            }
        }
        return total;
    }

    public static double getColumnTotal(double[][] array, int colIndex) {
        double total = 0.0;
        for (double[] row : array) {
            if (colIndex >= 0 && colIndex < row.length) {
                total += row[colIndex];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] array, int rowIndex) {
        double highest = Double.MIN_VALUE;
        if (rowIndex >= 0 && rowIndex < array.length) {
            for (double value : array[rowIndex]) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] array, int rowIndex) {
        double highest = Double.MIN_VALUE;
        int index = -1;
        if (rowIndex >= 0 && rowIndex < array.length) {
            for (int i = 0; i < array[rowIndex].length; i++) {
                if (array[rowIndex][i] > highest) {
                    highest = array[rowIndex][i];
                    index = i;
                }
            }
        }
        return index;
    }

    public static double getLowestInRow(double[][] array, int rowIndex) {
        double lowest = Double.MAX_VALUE;
        if (rowIndex >= 0 && rowIndex < array.length) {
            for (double value : array[rowIndex]) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] array, int rowIndex) {
        double lowest = Double.MAX_VALUE;
        int index = -1;
        if (rowIndex >= 0 && rowIndex < array.length) {
            for (int i = 0; i < array[rowIndex].length; i++) {
                if (array[rowIndex][i] < lowest) {
                    lowest = array[rowIndex][i];
                    index = i;
                }
            }
        }
        return index;
    }

    public static double getHighestInColumn(double[][] array, int colIndex) {
        double highest = Double.MIN_VALUE;
        for (double[] row : array) {
            if (colIndex >= 0 && colIndex < row.length && row[colIndex] > highest) {
                highest = row[colIndex];
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] array, int colIndex) {
        double highest = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (colIndex >= 0 && colIndex < array[i].length && array[i][colIndex] > highest) {
                highest = array[i][colIndex];
                index = i;
            }
        }
        return index;
    }

    public static double getLowestInColumn(double[][] array, int colIndex) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : array) {
            if (colIndex >= 0 && colIndex < row.length && row[colIndex] < lowest) {
                lowest = row[colIndex];
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] array, int colIndex) {
        double lowest = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (colIndex >= 0 && colIndex < array[i].length && array[i][colIndex] < lowest) {
                lowest = array[i][colIndex];
                index = i;
            }
        }
        return index;
    }

    public static double getHighestInArray(double[][] array) {
        double highest = Double.MIN_VALUE;
        for (double[] row : array) {
            for (double value : row) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] array) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : array) {
            for (double value : row) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }
}
