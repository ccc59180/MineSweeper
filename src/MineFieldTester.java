public class MineFieldTester {


    public static void main(String[] args) {

        MineField mine = new MineField(9,6,12);

        mine.populateMineField(5,6);
        for (int i = 0; i < mine.numRows(); i++) {
            for (int j = 0; j < mine.numCols(); j++) {
                System.out.print(mine.hasMine(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println(mine.numAdjacentMines(3,3));
    }
}
