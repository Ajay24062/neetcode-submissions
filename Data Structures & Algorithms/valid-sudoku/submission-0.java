class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            HashSet<Character> hsr=new HashSet<>();
            HashSet<Character> hsc=new HashSet<>();
            HashSet<Character> hss=new HashSet<>();
            
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.'){

                
                if(!hsr.contains(board[i][j]))
                    hsr.add(board[i][j]);
                else
                return false;
                }
                if(board[j][i] != '.'){

                if(!hsc.contains(board[j][i]))
                    hsc.add(board[j][i]);
                else
                return false;
                }
            }
            


        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> hss = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] != '.') {
                            if (!hss.contains(board[i][j]))
                                hss.add(board[i][j]);
                            else
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
