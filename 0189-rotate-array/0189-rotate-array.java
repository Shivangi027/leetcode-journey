class Solution {
  public static void reverse(int[] nums , int i , int j){
        while(i<=j){
            swap(nums,i,j) ;
            i++ ;
            j-- ;
        }
    }  
    public static void swap(int[] nums ,int i , int j){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public void rotate(int[] nums, int k) {
    int n = nums.length ;
    k= k%n ;
    reverse(nums,0,n-k-1) ;
    reverse(nums,n-k,n-1) ;
    reverse(nums,0,n-1) ;    
    }
//     int n = nums.length ;
//     k = k%n;
//     int[] ans = new int[n];
//     int[] temp = new int[n-k];
//     int x = 0 ;
//     while(x<n-k){
//         temp[x] = nums[x];
//         x++;
//     }
//     int i = 0 ; 
//     while(i<k){
//         nums[i] = nums[n-k+i] ;
//         i++;
//     }
//     int j = 0 ;
//     while(i<n){
//         nums[i] = temp[i-k];
//         i++; 
//     }  
    }

