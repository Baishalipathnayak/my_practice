package lab07272024;

public class lab38 {
    public static void main(String[] args) {
        int[][] darray= {
                {2,4,6},
                {3,5,7}
        };
        for(int i=0;i<darray.length;i++)
        {
            for(int j=0;j<darray[i].length;j++)
            {
                System.out.print(darray[i][j]);
                System.out.print("\t");
                //System.out.println();
            }
            System.out.println();
        }



    }
}
