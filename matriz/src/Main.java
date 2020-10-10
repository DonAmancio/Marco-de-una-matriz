public class Main {
    public static void main(String[] args) {
        int [][] marco = new int[5][15];
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i==0||i == marco.length ){
                    marco[i][j]=1;
                }else
                if (j == 0 || j == marco[i].length-1){
                    marco[i][j]=1;
                }else{
                    marco[i][j]=0;
                }
            }

        }
        for (int i = 0; i < 15; i++)

        {
            for (int j =0; j < 15; j++)

            {
                System.out.print(marco[i] [j]+"");
            }

            System.out.println( "-");



        }
    }
}
