/**
 * @program: SearchInsertionLocation
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-14 20:02
 **/


public class SearchInsertionLocation {
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,6};
        SearchInsertionLocation searchInsertionLocation = new SearchInsertionLocation();
        System.out.println(searchInsertionLocation.searchInsert2(nums, 4));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target<=nums[0]){
                return 0;
            } else if (nums[nums.length-2]<=target&&nums[i]<=target&target<=nums[i+1]) {
                if (nums[i]==target || nums[i+1]==target){
                    return nums[i]==target ? i:i+1;
                }
                else {
                    return nums[i]<target ?i:i+1;
                }
            }
            else {
                return nums[i]<=target ? nums.length:nums.length+1;
            }
        }
        return 0;
    }

    public int searchInsert2(int[] nums, int target) {
        int result=0;
        for (int i = 0; i < nums.length; i++){
            if (target<=nums[i]){
                result=i;
//                break;
            }
            else {
                result++;
            }
        }
        return result;
    }
}
