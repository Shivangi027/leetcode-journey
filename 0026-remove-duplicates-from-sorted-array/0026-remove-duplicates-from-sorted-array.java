class Solution {
    public int removeDuplicates(int[] nums) {
    int n = nums.length ;
    int i = 0 , j = i+1 ;
    int cnt = 0 ;
    while(j<n){
    if(nums[i]!=nums[j]){
        int temp = nums[i+1];
        nums[i+1] = nums[j] ;
        nums[j] = temp ;
        i++; j++;
        cnt++;
    } 
    else j++;
    }
    return cnt+1;    
    }
}
// class Solution {
//     public int removeDuplicates(int[] nums) {
//     int n = nums.length ;
//     HashSet<Integer> set = new HashSet<>();
//     for(int x:nums){
//         set.add(x);
//     }  
//     int i = 0 ;
//     for(int item :set){
//         nums[i] = item ;
//         i++;
//     }
//     Arrays.sort(nums,0,set.size()) ;
//     return set.size();  
//     }
// }