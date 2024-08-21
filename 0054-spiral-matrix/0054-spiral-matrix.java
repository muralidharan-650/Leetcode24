class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
        int rowst=0;
        int rowend=matrix.length-1;
        int colst=0;
        int colend=matrix[0].length-1;

        while(rowst<=rowend && colst<=colend){
            for(int i=colst;i<=colend;i++)
            {
                li.add(matrix[rowst][i]);
            }
            rowst++;
            for(int i=rowst;i<=rowend;i++)
            {
                li.add(matrix[i][colend]);
            }
            colend--;

            if(rowst>rowend || colst>colend){
                break;
            }

            for(int i=colend;i>=colst;i--)
            {
                li.add(matrix[rowend][i]);
            }
            rowend--;
            for(int i=rowend;i>=rowst;i--)
            {
                li.add(matrix[i][colst]);
            }
            colst++;

        }
        return li;
        
    }
}