package Ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Project TemaC13
 * @Author mihai
 * @Date 1/18/2020
 */

/*

    adunarea
    scaderea
    inmultirea a doua matrici
    inmultirea cu un scalar

*/

public class Ex2 {

    // Sum of 2 matrices
    public static ArrayList<ArrayList<Integer>> sum(int dimension, ArrayList<ArrayList<Integer>> firstMatrix,
                                                    ArrayList<ArrayList<Integer>> secondMatrix){
        ArrayList<ArrayList<Integer>> sumMatrix = createMatrix(dimension);
        int sum = 0;
        for (int i = 0; i < firstMatrix.size(); i++){
            for (int j = 0; j < firstMatrix.get(i).size(); j++){
                sum = firstMatrix.get(i).get(j) + secondMatrix.get(i).get(j);
                sumMatrix.get(i).set(j, sum);
            }
        }

        return sumMatrix;
    }


    // Difference of 2 matrices
    public static ArrayList<ArrayList<Integer>> diff(int dimension, ArrayList<ArrayList<Integer>> firstMatrix,
                                                           ArrayList<ArrayList<Integer>> secondMatrix){
        ArrayList<ArrayList<Integer>> diffMatrix = createMatrix(dimension);
        int diff = 0;

        for (int i = 0; i < firstMatrix.size(); i++){
            for (int j = 0; j < firstMatrix.get(i).size(); j++){
                diff = firstMatrix.get(i).get(j) - secondMatrix.get(i).get(j);
                diffMatrix.get(i).set(j, diff);
            }
        }

        return diffMatrix;
    }


    // Multiplication of matrices
    public static ArrayList<ArrayList<Integer>> multi(int dimension, ArrayList<ArrayList<Integer>> firstMatrix,
                                                      ArrayList<ArrayList<Integer>> secondMatrix){
        ArrayList<ArrayList<Integer>> multiMatrix = createMatrix(dimension);
        int multi = 0;

        for (int i = 0; i < firstMatrix.size(); i++){
            for (int j = 0; j < firstMatrix.get(i).size(); j++){
                multi = firstMatrix.get(i).get(j) * secondMatrix.get(i).get(j);
                multiMatrix.get(i).set(j, multi);
            }
        }

        return multiMatrix;
    }


    // Multiplication of matrices with scalar
    public static ArrayList<ArrayList<Integer>> multiScalar(int scalar, int dimension, ArrayList<ArrayList<Integer>> matrix){
        ArrayList<ArrayList<Integer>> multiWithScalarMatrix = createMatrix(dimension);
        int multi = 0;

        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix.get(i).size(); j++){
                multi = scalar * matrix.get(i).get(j);
                multiWithScalarMatrix.get(i).set(j, multi);
            }
        }

        return multiWithScalarMatrix;
    }


    // Create Matrix
    public static ArrayList<ArrayList<Integer>> createMatrix(int dimension){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(dimension);
        for (int i = 0; i < dimension; i++){
            ArrayList<Integer> newRow = new ArrayList<>(dimension);
            for (int j = 0; j < dimension; j++){
                newRow.add(0);
            }
            list.add(newRow);
        }

        return list;
    }


    // Display -> ArrayList
    public static void displayArrayList(ArrayList<ArrayList<Integer>> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int dimension = 4;
        int scalar = 2;

        ArrayList<ArrayList<Integer>> firstMatrix = createMatrix(dimension);
        ArrayList<ArrayList<Integer>> secondMatrix = createMatrix(dimension);

        ArrayList<ArrayList<Integer>> sum = createMatrix(dimension);
        ArrayList<ArrayList<Integer>> diff = createMatrix(dimension);
        ArrayList<ArrayList<Integer>> multi = createMatrix(dimension);
        ArrayList<ArrayList<Integer>> multiScalar = createMatrix(dimension);

        firstMatrix.get(0).set(0, 2);
        firstMatrix.get(1).set(3, 10);
        firstMatrix.get(3).set(0, 31);
        firstMatrix.get(2).set(2, 3);
        firstMatrix.get(3).set(1, 8);
        firstMatrix.get(2).set(1, 16);

        secondMatrix.get(1).set(0, 12);
        secondMatrix.get(3).set(2, 5);
        secondMatrix.get(0).set(3, 1);
        secondMatrix.get(1).set(1, 20);
        secondMatrix.get(2).set(2, 20);
        secondMatrix.get(2).set(3, 10);
        secondMatrix.get(3).set(0, 30);

        System.out.println("First matrix: ");
        displayArrayList(firstMatrix);
        System.out.println();

        System.out.println("Second matrix: ");
        displayArrayList(secondMatrix);
        System.out.println();

        sum = sum(dimension, firstMatrix, secondMatrix);
        diff = diff(dimension, firstMatrix, secondMatrix);
        multi = multi(dimension, firstMatrix, secondMatrix);
        multiScalar = multiScalar(scalar, dimension, firstMatrix);

        System.out.println("The gathering of 2 matrices: ");
        displayArrayList(sum);
        System.out.println();

        System.out.println("Decrease of 2 matrices: ");
        displayArrayList(diff);
        System.out.println();

        System.out.println("Multiplying 2 matrices: ");
        displayArrayList(multi);
        System.out.println();

        System.out.println("Multiplying an matrix by a scalar: ");
        displayArrayList(multiScalar);
        System.out.println();



    }
}
