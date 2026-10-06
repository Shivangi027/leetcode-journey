class Solution {
    public boolean search(int[] nums, int target) {
     int n = nums.length ;
    int lo = 0 , hi = n-1 ;
    while(lo<=hi){
    int mid = lo + (hi-lo)/2 ;
    if(nums[mid]==target) return true ;
    else if(nums[lo]==nums[mid]&&nums[mid]==nums[hi]){
        lo++ ;
        hi-- ;
        continue;
    }
    else if(nums[mid]<=nums[hi]){            // i am in right sorted array
        if(target>=nums[mid]&&target<=nums[hi])  lo = mid+1 ;
        else hi = mid-1 ;
    }
    else{                                   // i am in left sorted array             
        if(target>=nums[lo]&&target<=nums[mid]) hi = mid-1 ;
        else lo = mid+1 ;
    }
    }
    return false ;    
    }
}