public class NewSortingTester {

    @Test //testing an array with all positive numbers
    public void newSorting1(int[] A, int size){
        A = {2, 3, 4, 1};
        size = 1;
        int[] result = {1, 2, 3, 4};
        assertArrayEquals(result, A);
    }

    @Test //testing an array with all negative numbers
    public void newSorting2(int[] A, int size){
        A = {-2, -3, -4, -1};
        size = 1;
        int[] result = {-4, -3, -2, -1};
        assertArrayEquals(result, A);
    }

    @Test //testing an array with odd length since even length can be divided easily
    public void newSorting3(int[] A, int size){
        A = {9, 61, 14, 36, 50, 3, 29};
        size = 1;
        int[] result = {3, 9, 14, 29, 36, 50, 61};
        assertArrayEquals(result, A);
    }

    @Test //testing an array with positive and negative numbers
    public void newSorting4(int[] A, int size){
        A = {-3, 7, 11, -39, 20};
        size = 1;
        int[] result = {-39, -3, 7, 11, 20};
        assertArrayEquals(result, A);
    }

    @Test //testing an array with assigned int values input into array
    public void newSorting5(int[] A, int size){
        int a = 3;
        int b = 10;
        int c = -9;
        int d = -5;
        int e = 23;
        A = {a, b, c, d, e};
        size = 1;
        int[] result = {c, d, a, b, e};
        assertArrayEquals(result, A);
    }
    @Test //testing an array with largest value at beginning array
    public void newSortingExtra(int[] A, int size){
        A = {100, 75, 50, 25};
        size = 1;
        int[] result = {25, 50, 75, 100};
        assertArrayEquals(result, A);
    }
}
