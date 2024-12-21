class Demo {
    public void findPeakElement(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length - 1; i++) { // Avoid out-of-bound access
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                index = i;
            }
        }
        System.out.println("Peak element: " + index); // Print the peak element
    }

    public static void main(String[] args) {
        Demo o = new Demo();
        o.findPeakElement(new int[]{1, 2, 3, 1}); // Correct array initialization
    }
}
