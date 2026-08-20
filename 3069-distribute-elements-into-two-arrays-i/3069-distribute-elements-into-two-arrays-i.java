class Solution {
    public int[] resultArray(int[] nums) {
        // List<Integer> arr1 = new ArrayList<>();
        // List<Integer> arr2 = new ArrayList<>();
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n-1];
        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int a1pointer = 0;
        int a2pointer = 0;
    
        for(int i=2 ; i<nums.length ; i++){
            if(arr1[a1pointer]>arr2[a2pointer]){
                arr1[++a1pointer] = nums[i];
            }else{
                arr2[++a2pointer] = nums[i];
            }
        }

        for(int i=0 ; i<=a2pointer ; i++){
            arr1[++a1pointer] = arr2[i]; 
        }

        return arr1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna