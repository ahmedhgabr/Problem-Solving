public class Number_of_Islands {

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n]; 
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    visit(i, j, grid, visited);
                    count++;
                }
            }
        }
        
        return count;
    }

    private void visit(int i, int j, char[][] grid, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == '0' || visited[i][j] )
            return;

        visited[i][j] = true;
        visit(i + 1, j, grid, visited);
        visit(i - 1, j, grid, visited);
        visit(i, j + 1, grid, visited);
        visit(i, j - 1, grid, visited);
    }


   
}
