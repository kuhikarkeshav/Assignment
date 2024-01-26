public class SortArray {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int[] array = {0, 1, 2, 1, 2, 0, 2, 0, 1};

	        System.out.println("Original array:");
	        printArray(array);

	        sortArray(array);

	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	 
	 
    public static void sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

   
}
