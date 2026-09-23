class Solution {
    public List<Integer> majorityElement(int[] nums) {
    int n = nums.length ;
    List<Integer> ans = new ArrayList<>() ;
    int elem1 = 0 , cnt1 = 0 , elem2 = 0 , cnt2 = 0 ;
    for(int i = 0 ; i < n ; i++){
        if(cnt1==0 && nums[i]!=elem2) {
            elem1 = nums[i] ;
            cnt1 = 1 ;
        }
        else if(cnt2==0 && nums[i]!= elem1) {
            elem2 = nums[i] ;
            cnt2 = 1 ;
        }
        else if(nums[i]==elem1) cnt1++ ; 
        else if(nums[i]==elem2) cnt2++ ;
        else{
            cnt1-- ;
            cnt2-- ;
        }
        }
        cnt1 = 0 ; cnt2 = 0 ;
        for(int i = 0 ; i < n ; i++){
        if(elem1==nums[i])   cnt1++ ;
        else if(elem2==nums[i]) cnt2++ ;
        }
        if(cnt2>n/3) ans.add(elem2) ;
        if(cnt1>n/3) ans.add(elem1) ;
    return ans ;    
    }
}