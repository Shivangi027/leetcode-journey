class Solution {
    public void swapIfGreater(int[] nums1,int indx1 , int[] nums2 , int indx2){
        if(nums1[indx1]>nums2[indx2]){
            int temp = nums1[indx1] ;
            nums1[indx1] = nums2[indx2] ;
            nums2[indx2] = temp ;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int len = n+m ;
    int gap = len/2 + len%2 ;
    while(gap>0){
    int left = 0 ;
    int right = left+gap ;
    while(right<len){
        //nums1 and nums2
        if(left < m && right >= m){
            swapIfGreater(nums1,left,nums2,right-m) ;
            left++ ;  right++ ;
      }
        //nums2 and nums2
        else if(right >= m && left >= m ){
            swapIfGreater(nums2,left-m,nums2,right-m) ;
            left++ ; right++ ;
        }
        //nums1 and nums1
        else if(left < m && right <  m){
            swapIfGreater(nums1,left,nums1,right) ;
            left++ ; right++ ;
        }
    }
    if(gap==1) break ;
    gap = gap/2 + gap%2 ;
    }
    for(int i = m ; i < n+m ; i++){
        nums1[i] = nums2[i-m] ;
    }
    }
}