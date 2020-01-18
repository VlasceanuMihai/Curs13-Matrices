package Ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    // Even Dimension - Arrays
    public static int[][] arraysVar(int matrixDimension, int mainDiagValue, int sndDiagValue, int leftValue,
                                    int upValue, int rightValue, int bottomValue){
        int[][] numbers = new int[matrixDimension][matrixDimension];

        // Main Diag
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i == j){
                    numbers[i][j] = mainDiagValue;
                }
            }
        }

        // Second Diag
        for (int i = 0; i <matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if ((i + j) == (matrixDimension - 1)){
                    numbers[i][j] = sndDiagValue;
                }
            }
        }

        // Left Side
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if ((i > j) && ((i + j) < (matrixDimension - 1))) {
                    numbers[i][j] = leftValue;
                }
            }
        }

        // Up Side
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if ((i < j) && ((i + j) < (matrixDimension - 1))){
                    numbers[i][j] = upValue;
                }
            }
        }

        // Right Side
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if ((i < j) && ((i + j) > (matrixDimension - 1))){
                    numbers[i][j] = rightValue;
                }
            }
        }

        // Bottom Side
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if ((i > j) && ((i + j) > (matrixDimension - 1))){
                    numbers[i][j] = bottomValue;
                }
            }
        }

        return numbers;
    }


    // Odd Dimension - Arrays
    public static int[][] arraysVar(int matrixDimension, int mainDiagValue, int sndDiagValue, int leftValue,
                                   int upValue, int rightValue, int bottomValue, int centerVal){
        int[][] numbers;

        numbers = arraysVar(matrixDimension, mainDiagValue, sndDiagValue, leftValue, upValue, rightValue, bottomValue);
        numbers[matrixDimension/2][matrixDimension/2] = centerVal;

        return numbers;
    }



    // Even Dimension - ArrayList
    public static ArrayList<ArrayList<Integer>> arrayListVar(int matrixDimension, int mainDiagValue, int sndDiagValue, int leftValue,
                                                             int upValue, int rightValue, int bottomValue){
        ArrayList<ArrayList<Integer>> num = new ArrayList<ArrayList<Integer>>(matrixDimension);

        for (int i = 0; i < matrixDimension; i++){
            ArrayList<Integer> newRow = new ArrayList<Integer>(matrixDimension);
            for (int j = 0; j < matrixDimension; j++){
                newRow.add(0);
            }
            num.add(newRow);
        }

        // Main Diag
        for (int i = 0; i < matrixDimension; i++){
            for (int j = 0; j < matrixDimension; j++){
                if (i == j){
                    num.get(i).set(j, mainDiagValue);
                }
            }
        }

        // Second Diag
        for (int i = 0; i < matrixDimension; i++){
            for (int j = 0; j < matrixDimension; j++){
                if ((i + j) == (matrixDimension - 1)){
                    num.get(i).set(j, sndDiagValue);
                }
            }
        }

        // Left Diag
        for (int i = 0; i < matrixDimension; i++){
            for (int j = 0; j < matrixDimension; j++){
                if ((i > j) && ((i + j) < (matrixDimension - 1))){
                    num.get(i).set(j, leftValue);
                }
            }
        }

        // Up Diag
        for (int i = 0; i < matrixDimension; i++){
            for (int j = 0; j < matrixDimension; j++){
                if ((i < j) && ((i + j) < (matrixDimension - 1))){
                    num.get(i).set(j, upValue);
                }
            }
        }

        // Right Diag
        for (int i = 0; i < matrixDimension; i++){
            for (int j = 0; j < matrixDimension; j++){
                if ((i < j) && ((i + j) > (matrixDimension - 1))){
                    num.get(i).set(j, rightValue);
                }
            }
        }

        // Bottom Diag
        for (int i = 0; i < matrixDimension; i++){
            for (int j = 0; j < matrixDimension; j++){
                if ((i > j) && ((i + j) > (matrixDimension - 1))){
                    num.get(i).set(j, bottomValue);
                }
            }
        }

        return num;
    }


    // Odd Dimension -> ArrayList
    public static ArrayList<ArrayList<Integer>> arrayListVar(int matrixDimension, int mainDiagValue, int sndDiagValue, int leftValue,
                                                             int upValue, int rightValue, int bottomValue, int centerVal){
        ArrayList<ArrayList<Integer>> num = arrayListVar(matrixDimension, mainDiagValue, sndDiagValue, leftValue,

        upValue, rightValue, bottomValue);
        num.get(matrixDimension/2).set(matrixDimension/2, centerVal);

        return num;
    }




    // Display -> Arrays
    public static void displayArray(int[][] numbers){
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }


    // Display -> ArrayList
    public static void displayArrayList(ArrayList<ArrayList<Integer>> num){
        for (int i = 0; i < num.size(); i++){
            for (int j = 0; j < num.get(i).size(); j++){
                System.out.print(num.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("matrixDimension = ");
        int matrixDimension = scanner.nextInt();

        System.out.print("mainDiagValue = ");
        int mainDiagValue = scanner.nextInt();

        System.out.print("sndDiagValue = ");
        int sndDiagValue = scanner.nextInt();

        System.out.print("centerValue = ");
        int centerValue = scanner.nextInt();

        System.out.print("leftValue = ");
        int leftValue = scanner.nextInt();

        System.out.print("upValue = ");
        int upValue = scanner.nextInt();

        System.out.print("rightValue = ");
        int rightValue = scanner.nextInt();

        System.out.print("bottomValue = ");
        int bottomValue = scanner.nextInt();

        //// Arrays
        System.out.println("--- Array ---");
        int[][] numbers;
        if (matrixDimension % 2 != 0){
            numbers = arraysVar(matrixDimension, mainDiagValue, sndDiagValue, leftValue, upValue, rightValue, bottomValue, centerValue);
            displayArray(numbers);
        }else {
            numbers = arraysVar(matrixDimension, mainDiagValue, sndDiagValue, leftValue, upValue, rightValue, bottomValue);
            displayArray(numbers);
        }
        System.out.println("\n");


        //// ArrayList
        System.out.println("--- ArrayList ---");
        ArrayList<ArrayList<Integer>> num;
        if (matrixDimension % 2 != 0){
            num = arrayListVar(matrixDimension, mainDiagValue, sndDiagValue, leftValue, upValue, rightValue, bottomValue, centerValue);
            displayArrayList(num);
        }else {
            num = arrayListVar(matrixDimension, mainDiagValue, sndDiagValue, leftValue, upValue, rightValue, bottomValue);
            displayArrayList(num);
        }

    }
}
