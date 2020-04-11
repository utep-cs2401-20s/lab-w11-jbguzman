public class NewSortingTester {

    @Test //testing an array with all positive numbers
    public void newSorting1(){
        NewSorting ns = new newSorting();
        int[] A = new int[];
        A = {3, 1, 4, 2};
        int[] result = new int[];
        result = {1, 2 ,3, 4};
        ns.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with all negative numbers
    public void newSorting2(){
        NewSorting ns = new newSorting();
        int[] A = new int[];
        A = {-2, -3, -4, -1};
        int[] result = new int[];
        result = {-4, -3, -2, -1};
        ns.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with odd length since even length can be divided easily
    public void newSorting3(){
        NewSorting ns = new newSorting();
        int[] A = new int[];
        A = {9, 61, 14, 36, 50, 3, 29};
        int[] result = new int[];
        result = {3, 9, 14, 29, 36, 50, 61};
        ns.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with positive and negative numbers
    public void newSorting4(){
        NewSorting ns = new newSorting();
        int[] A = new int[];
        A = {-3, 7, 11, -39, 20};
        int[] result = new int[];
        result = {-39, -3, 7, 11, 20};
        ns.newSorting(A, 2);
        assertArrayEquals(result, A);
    }

    @Test //testing an array with assigned int values input into array
    public void newSorting5(){
        NewSorting ns = new newSorting();
        int[] A = new int[];
        int a = 3;
        int b = 10;
        int c = -9;
        int d = -5;
        int e = 23;
        A = {a, b, c, d, e};
        int[] result = new int[];
        result = {c, d, a, b, e};
        ns.newSorting(A, 2);
        assertArrayEquals(result, A);
    }
    @Test //testing an array with largest value at beginning array
    public void newSortingExtra(){
        NewSorting ns = new newSorting();
        int[] A = new int[];
        A = {100, 75, 50, 25};
        int[] result = new int[];
        result = {25, 50, 75, 100};
        ns.newSorting(A, 2);
        assertArrayEquals(result, A);
    }
}
