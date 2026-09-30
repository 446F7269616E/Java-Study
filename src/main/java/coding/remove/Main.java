package coding.remove;


public class Main {
    public static void main(String[] args) {
        int[]nums ={3,2,2,3};
        int val = 3;
        int before = 0;
        int after = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[after] == val){
                after ++;
            }
            else{
                nums[before] = nums[after];
                after++;
                before++;
            }
        }
    }
}

// int before = 0;

// for (int after = 0; after < nums.length; after++) {
//     if (nums[after] != val) {
//         nums[before] = nums[after];
//         before++;
//     }
// }

// return before;