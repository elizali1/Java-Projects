public class Algorithms {
    public static void main(String[] args) {
        int[] toSearch = new int[]{1, 3, 5, 7, 9};
        boolean algorithm = search(toSearch,3);
        System.out.println(algorithm);
    }

    public static boolean search(int[] toSearch, int target) {
        for (int i : toSearch) {
            if (i == target) {
                return true;
            }
        }
            return false;
        }

    //example 1,5,1,3,7,9,1
    public static int[] bubbleSort(int[] toSort){
        //we start with creating a temp where it stores the current value
        int temp;
        // first loop goes to the first number and after goes through the second loop
        for(int i  = 0; i < toSort.length-1; i++){
            System.out.println("hi to i: "+ toSort[i]);
            // second loop goes and sorts the number depending on the if statement
            for (int j = 0; j < toSort.length-1; j++){
                System.out.println("hi to j: "+ toSort[j]);
                // toSort is greater than the next index : true or false?
                // true
                if(toSort[j] > toSort[j+1]){
                    // temp takes the current value of j
                    temp = toSort[j];
                    //current and equal it to the next index
                    toSort[j] = toSort[j+1];
                    //
                    toSort[j+1] = temp;
                }
                System.out.println();
            }
        }
        return toSort;
    }

}