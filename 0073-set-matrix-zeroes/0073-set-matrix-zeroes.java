class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        boolean zerorow = false;
        boolean zerocolumn = false;
        // Method 3 :
        // check the 0th row and 0th col
        // For row
        for (int i = 0; i < m; i++) {
                if (arr[i][0] == 0) {
                    zerocolumn= true;
                    break ; }
                }
        // For column
        for (int j = 0; j < n ; j++) {
            if(arr[0][j] == 0 ) {
                zerorow = true ;
                break ;
            }
        }
        // traverse in the sub-matrix without the 0th column and 0th row
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        // traverse in the 0th row
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {                  // set jth column to 0
                for (int i = 1 ; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 1 ; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1 ; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (zerorow == true ) {
                for (int j = 0; j < n ; j++) {
                    arr[0][j] = 0;
                }
            }
        }
        for (int j = 0; j < n ; j++) {
            if (zerocolumn == true ) {
                for (int i = 0; i < m ; i++) {
                    arr[i][0] = 0;
                }
            }
        }
    }
    }