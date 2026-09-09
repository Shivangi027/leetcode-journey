class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> sum = new HashMap<>() ;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int num = arr[i] ;
            int rem = target-arr[i] ;
            if(sum.containsKey(rem)){
                ans[0] = i ;
                ans[1] = sum.get(rem) ;
            }
            sum.put(arr[i],i) ;
        }
        return ans ;
        
    }
}