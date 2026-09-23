class Solution {
    static int  count ;
    public void mergeSort(int[] arr){
        int n = arr.length ;
        if(n==1)
        return ;
        // Create two arrays 
        int[] a = new int[n/2] ;
        int[] b = new int[n-n/2] ;
        // copy-pasting
        for(int i = 0 ; i < n/2 ; i++)
        a[i] = arr[i] ;
        for(int i = 0 ; i < n-n/2 ; i++)
        b[i] = arr[n/2+i] ;
        // magic
        mergeSort(a) ;
        mergeSort(b) ;
        // Inversion
        inversion(a,b) ; 
        // merge these 'a' and 'b'
        merge(a,b,arr) ;
        a = null ;
        b= null ;
        }
        public void merge(int[] a , int[] b , int[] c){
            int i = 0 ; int j = 0 ; int k = 0 ; 
            while(i<a.length && j<b.length){
                if(a[i]<=b[j]){
                    c[k] = a[i] ;
                    i++ ;
                    k++ ;
                }
                else{
                    c[k] = b[j] ;
                    j++ ;
                    k++ ;
                }
            }
            if(i==a.length){
                while(j< b.length && k<c.length){
                    c[k] = b[j] ;
                    j++ ;
                    k++ ;
                }
            }
            if(j==b.length){
                while(i<a.length && k<c.length){
                    c[k] = a[i] ;
                    i++ ;
                    k++ ;
                }
            }
        }
        public void inversion(int[] a , int[] b){
            int i = 0 ; int j = 0 ;
            while(i<a.length && j<b.length){
                if((long)a[i] > (long)2*b[j]){
                    count += a.length-i ;
                    j++ ;
                }
                else
                i++ ;
            }
        }
    public int reversePairs(int[] arr) {
    int n = arr.length ;
    count = 0 ;
    mergeSort(arr) ;
    return count ;
    }
}