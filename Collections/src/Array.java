import java.util.*;

public class Array {
    public static void main(String[] args) {
        //1.
//        int[] myArray = new int[6];
//        boolean duplicateNum = true;
//        int i = 0;
//        while (i < myArray.length) {
//            int randomNum = (int) ((Math.random() * 49) + 1);
//            for (int j = 0; j < i; j++) {
//                if (myArray[j] == randomNum) {
//                    duplicateNum = false;
//                    System.out.print(" " + duplicateNum + " ");
//                    System.out.print(randomNum);
//                }
//            }
//                if (duplicateNum) {
//                    myArray[i] = randomNum;
//                    i++;
//
//                }
//                duplicateNum = true;
//            }
//            Arrays.sort(myArray);
//            System.out.println(Arrays.toString(myArray));
//        }
        //2.
        List<Integer> myArrayList = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            int randomNum = (int) (Math.random() * 49) + 1;
            if (!myArrayList.contains(randomNum)) {
                myArrayList.add(randomNum);
            }
        }
            Collections.sort(myArrayList);
            System.out.println(myArrayList);

            Set<Integer> set = new LinkedHashSet<>(myArrayList);
            System.out.println(set);
        }
    }


