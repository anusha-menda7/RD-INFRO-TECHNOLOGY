public class Sudoku {
public boolean solve(int[][] b) {        
        for (int r=0;r<9;r++) {
        for (int c=0;c<9;c++) {
        if (b[r][c]==0) {
        for (int n=1;n<=9;n++) {
             if (isValid(b,r,c,n)) {
                  b[r][c]=n;
                   if(solve(b)) 
                    return true;
                    b[r][c]=0;
                        }
                    }
                    return false;
                }}}
        return true;
    }
    boolean isValid(int[][] b,int r,int c,int n){
        for (int i=0;i<9;i++) 
            if(b[r][i]==n) 
                return false;
        for (int i=0;i<9;i++) 
            if (b[i][c]==n) 
                return false;
        int rs=r-r%3;
        int cs=c-c%3;
        for (int i=0;i<3;i++) 
            for (int j=0;j<3;j++) 
                if (b[rs+i][cs+j]==n) 
                    return false;
        return true;
    }
    public void printBoard(int[][] b) {
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) 
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
 public static void main(String[] args) {        
        int[][] b={
            {0, 0, 3, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 7, 0, 5, 0, 0, 0},
            {1, 0, 0, 0, 6, 0, 0, 0, 8},
            {0, 6, 0, 0, 0, 0, 0, 4, 0},
            {0, 0, 8, 0, 0, 0, 7, 0, 0},
            {0, 5, 0, 0, 0, 0, 0, 1, 0},
            {7, 0, 0, 0, 9, 0, 0, 0, 2},
            {0, 0, 0, 4, 0, 1, 0, 0, 0},
            {0, 0, 6, 0, 0, 0, 5, 0, 0}
        };
        Sudoku solver=new Sudoku();
        System.out.println("Original Sudoku Board:");
        solver.printBoard(b);
        if (solver.solve(b)) {
            System.out.println("\nSolved Sudoku Board:");
            solver.printBoard(b);
        } 
       else 
            System.out.println("\nThis Sudoku puzzle cannot be solved.");
    }
}
