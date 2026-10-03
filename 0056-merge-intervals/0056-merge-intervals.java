class Solution {
    public int[][] merge(int[][] arr) {
    int n = arr.length ;
    Arrays.sort(arr,(a,b) -> a[0]-b[0]) ;
    List<List<Integer>> ans = new ArrayList<>() ;
    for(int[] nums : arr){
        if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<nums[0]){
        ans.add(Arrays.asList(nums[0],nums[1])) ;
        }
    else{
    int end = ans.size()-1 ;
    int maxEnd = Math.max(ans.get(end).get(1),nums[1]) ;
    ans.get(end).set(1,maxEnd) ;
    } 
    }
    int[][] list = new int [ans.size()][];
    for(int k = 0 ; k < ans.size() ; k++){
    List<Integer> x = ans.get(k) ;
    list[k] = new int[x.size()] ;
    for(int j = 0 ; j < x.size() ; j++){
        list[k][j] = x.get(j) ;
    }
    }
    return list ;
    }
}