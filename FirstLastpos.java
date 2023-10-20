public class FirstLastpos{
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 5;
        int[] result = searchRange(nums, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("First occurrence of " + target + " is at index " + result[0]);
            System.out.println("Last occurrence of " + target + " is at index " + result[1]);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = search(nums, target, true);
        int lastOccurrence = search(nums, target, false);

        return new int[]{firstOccurrence, lastOccurrence};
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                result = mid;

                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return result;
    }
}