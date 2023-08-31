public class SandPile {

    public static void main(String args[]){
        int[][] result = sandpile(pile2, 2);
        printPile(result);
    }

    static int[][] pile = new int[][]{
            {1, 1, 1},
            {1, 3, 1},
            {1, 1, 1}
    };
    static int[][] pile2 = new int[][]{
            {0, 1, 0},
            {0, 2, 3},
            {1, 0, 1}
    };

    static void printPile(int [][] pile){
        for(int i=0;i<pile.length;i++){
            for(int j=0;j<pile[i].length;j++){
                System.out.print(pile[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] sandpile(int[][] pile, int n){
        for(int i=0;i<n;i++){
            pile[pile.length/2][pile.length/2]+=1;
            if(pile[pile.length/2][pile.length/2]==4){
                pile = spreadPile(pile, pile.length/2, pile.length/2);
            }
        }

        return  pile;
    }



    static int[][] spreadPile(int[][] pile, int i, int j){
        pile[i][j]=0;
        if(i<pile.length-1){
            pile[i+1][j]++;
            if(pile[i+1][j]==4){
                spreadPile(pile, i+1, j);
            }
        }
        if(i>0){
            pile[i-1][j]++;
            if(pile[i-1][j]==4){
                spreadPile(pile, i-1, j);
            }
        }
        if(j<pile.length-1){
            pile[i][j+1]++;
            if(pile[i][j+1]==4){
                spreadPile(pile, i, j+1);
            }
        }
        if(j>0){
            pile[i][j-1]++;
            if(pile[i][j-1]==4){
                spreadPile(pile, i, j-1);
            }
        }

        return pile;
    }
}