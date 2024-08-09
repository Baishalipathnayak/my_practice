package lab07272024;

public class star_righttarry {
    public static void main(String[] args) {
        char[][] rtarray= new char[5][5];

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                rtarray[i][j]='*';
            }

        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(rtarray[i][j]=='*'?'*':' ');
            }
            System.out.println();
        }

    }
}
