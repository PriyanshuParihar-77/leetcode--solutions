class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        ListNode curr = head;
        
        int startRow = 0;
        int endRow = m - 1;
        int startCol = 0;
        int endCol = n - 1;
        
        while (startRow <= endRow && startCol <= endCol) {
            // Fill the top row
            for (int i = startCol; i <= endCol; i++) {
                arr[startRow][i] = (curr == null) ? -1 : curr.val;
                if (curr != null) curr = curr.next;
            }
            startRow++;
            
            // Fill the right column
            for (int i = startRow; i <= endRow; i++) {
                arr[i][endCol] = (curr == null) ? -1 : curr.val;
                if (curr != null) curr = curr.next;
            }
            endCol--;
            
            if (startRow <= endRow) { // Check to avoid redundant operations
                // Fill the bottom row
                for (int i = endCol; i >= startCol; i--) {
                    arr[endRow][i] = (curr == null) ? -1 : curr.val;
                    if (curr != null) curr = curr.next;
                }
                endRow--;
            }
            
            if (startCol <= endCol) { // Check to avoid redundant operations
                // Fill the left column
                for (int i = endRow; i >= startRow; i--) {
                    arr[i][startCol] = (curr == null) ? -1 : curr.val;
                    if (curr != null) curr = curr.next;
                }
                startCol++;
            }
        }
        
        return arr;
    }
}
