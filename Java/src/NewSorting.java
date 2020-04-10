public class NewSorting {
    public void newSorting(int[] A, int size){
        if(A.length <= size){ //base case
            quickSort(A); //method call to quicksort
        }
        else { //recursive
            int mid = A.length / 2; //find mid of A array
            int[] left = new int[mid]; //left half
            int[] right = new int[A.length - mid]; //right half

            for(int i = 0; i < left.length; i++){ //populate left array
                left[i] = A[i];
            }

            for(int j = 0; j < right.length; j++){ //populate right array
                right[j] = A[j];
            }

            newSorting(left, size); //recursive call
            newSorting(right, size); //recursive call
            mergeSortedHalves(A, left, right); //method call
        }
    }

    private void quickSort(int[] A){
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int left, int right) {
        if (left == right - 1) { //array with 2 values, no need to partition just compare
            if (A[right] < A[left]) { //swap if the right is less than left
                int temp = A[right]; //hold value of right temporarily
                //A[right] = A[left]; //right gets the smaller value of left
                A[left] = temp; //left become value of temp
            }
            return;
        }
        if (left < right) {
            int position = partition(A, left, right); //method call to partition
            quickSort(A,  left,  position - 1); //recursive call
            quickSort(A, position + 1, right); //recursive call
        }
    }

    private int partition(int[] A, int left, int right){
        int pivot = left; //pivot starts at beginning left position
        int less = left + 1; //pivot is assigned to first element so less starts at the next element
        int more = right; //more assigned to the right value

        while(less < more){
            if(more >= left && A[more] >= pivot){ //more must be greater than left and pivot to move to next index
                more--; //decrease right side
            }

            else if(less <= right && A[less] <= pivot){ //less must be less than the right and pivot to move to next index
                less++; //increase left side
            }

            else{ //swap
                int temp = A[less]; //if less is greater than more, enter value of less into temp value
                A[less] = A[more]; //less takes value of more
                A[more] = temp; //more takes value of less
            }
        }

        //int temp = pivot;
       // A[left] = A[more];
       // A[more] = temp;

        return more;
    }

    private void mergeSortedHalves(int[] A, int[] left, int[] right){
        int[] result = new int[A.length];
        int i = 0; //assigned to left
        int j = 0; //assigned to right
        int k = 0; //assigned to result

        while(i < left.length && j < right.length){
            if(left[i] > right[j]){ //if right is less than left add right first
                result[k] = right[j]; //adding element to array
                j++; //increment index
            }
            else {
                result[k] = left[i]; //if left is less than right add left first
                i++;//increment index
            }
            k++; //keep incrementing index as data is entered

            if(i == left.length){ //avoid going out of bounds but right length is larger
                if(j < right.length){ //avoid right going out of bounds
                    result[k] = right[i];
                   // i++; //increment index
                    break; //end loop
                }
                i++; //increment index
            }
            if(j == right.length){ //avoid going out of bounds but left length is longer
                if(i < left.length){ //avoid left going out of bounds
                    result[k] = left[i];
                    //j++; //increment index
                    break; //end loop
                }
                j++; //increment index
            }
        }
    }
}