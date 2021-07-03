class Solution {
    
    
    public static int[][] visited = null;
    public static int COUNT = 0;

    
    public int numIslands(char[][] grid) {
        
        visited = new int[grid.length][grid[0].length];
        COUNT = 0;
        for(int i = 0 ; i < grid.length; i++){
              for(int j =0 ; j < grid[0].length; j++){
                   visited[i][j] = -1;
               }
         }

                for(int i = 0 ; i < grid.length; i++){
                    for (int j = 0; j < grid[0].length; j++) {

                        if(grid[i][j] == '1' && isValid(i, j , grid)){
                            COUNT++;
                        }
                        solve(grid, i, j);

                    }
                }
        return COUNT;
    }
    
    public void  solve(char[][] arr, int n , int m ){


               // System.out.println("" + n + " " + m + " " );
                if(!isValid(n, m , arr)){
                    return;
                }
                visited[n][m] = 0;
                if( arr[n][m] != '1') {
                    return;
                }

                solve(arr, n-1, m);
                solve(arr, n, m-1);
                solve(arr, n, m+1);
                solve(arr, n+1, m);

                return;
            }

    public boolean isValid(int n , int m ,char[][] arr){

        int i = arr.length -1 ;
        int j = arr[0].length -1 ;
        if( (n < 0 || n > i ) ){
            return false;
        } else if(m < 0 || m > j){
            return false;
        }else if(visited[n][m] == 0){
            return false;
        } else {
            return true;
        }
    }


}
