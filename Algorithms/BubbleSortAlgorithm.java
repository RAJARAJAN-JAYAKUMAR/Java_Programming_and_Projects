package Algorithms;
// public class BubbleSortAlgorithm {
//     public static void main(String[] args) {
//         int nums[] = {6,5,4,2,1,9};
//         // int num2[] = {7,5,4,3,2,1};
//         for (int num : nums) { 
//             // This is enhanced forloop, which is similar with python 
//             // System.out.print(num); this print will print the value in inline only 
//             System.out.print(num+" ") //if you concatenate num with empty space it prints with space
//         }
//     }
// }

// public class BubbleSortAlgorithm {
//     public static void main(String[] args) {
//         int nums[] = {6,5,4,2,1,9};
//         System.out.print("Before Sorting:" + " ")
//         for (int num : nums) { 
//             System.out.println(num);
//         }
//         System.out.println()  - this line moves to the next line
//         System.out.println("After Sorting:")
//         for (int num : nums) { 
//             System.out.println(num);
//         }
//     }
//     }
// }


public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int nums[] = {6,5,4,2,1,9};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting:" + " ");
        for (int num : nums) { 
            System.out.print(num + " ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) { 
            System.out.print(num + " ");
        }
        }


        System.out.println();
        System.out.println("After Sorting:");
        for (int num : nums) { 
            System.out.print(num + " ");
        }
    }
    
}









