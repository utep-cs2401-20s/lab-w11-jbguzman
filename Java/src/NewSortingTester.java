//All tests passed. Extra test cases
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewSortingTester {

    @Test//testing an array with all positive numbers
    public void newSorting1(){
        NewSorting newSorting = new NewSorting();

        int[] A = {12, 5, 54, 20};
        int[] result = {5, 12, 20, 54};

        System.out.print("Unsorted: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Sorted: ");
        for(int i  = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        newSorting.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with all negative numbers
    public void newSorting2(){
        NewSorting newSorting = new NewSorting();

        int[] A = {-2, -3, -4, -1};
        int[] result = {-4, -3, -2, -1};

        System.out.print("Unsorted: ");
        for(int i  = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Sorted: ");
        for(int i  = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        newSorting.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with odd length since even length can be divided easily
    public void newSorting3(){
        NewSorting newSorting = new NewSorting();

        int[] A = {9, 61, 14, 36, 50, 3, 29};
        int[] result = {3, 9, 14, 29, 36, 50, 61};

        System.out.print("Unsorted: ");
        for(int i  = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Sorted: ");
        for(int i  = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        newSorting.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with positive and negative numbers
    public void newSorting4(){
        NewSorting newSorting = new NewSorting();

        int[] A = {-3, 7, 11, -39, 20};
        int[] result = {-39, -3, 7, 11, 20};

        System.out.print("Unsorted: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Sorted: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        newSorting.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with assigned int values input into array
    public void newSorting5(){
        NewSorting newSorting = new NewSorting();

        int a = 3;
        int b = 10;
        int c = -9;
        int d = -5;
        int e = 23;
        int[] A = {a, b, c, d, e};
        int[] result = {c, d, a, b, e};

        System.out.print("Unsorted: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Sorted: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        newSorting.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with largest value at beginning array
    public void newSortingExtra1(){
        NewSorting newSorting = new NewSorting();

        int[] A = {100, 75, 50, 25};
        int[] result = {25, 50, 75, 100};

        System.out.print("Unsorted: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Sorted: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        newSorting.newSorting(A, 1);
        assertArrayEquals(result, A);
    }


    @Test //testing an array with one value
    public void newSortingExtra2(){
        NewSorting newSorting = new NewSorting();

        int[] A = {100};
        int[] result = {100};

        System.out.print("Unsorted: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Sorted: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        newSorting.newSorting(A, 1);
        assertArrayEquals(result, A);
    }
}
