public class TestClass {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        int missing = findMissingNumber(nums);
        System.out.println("Missing number is: " + missing);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}

