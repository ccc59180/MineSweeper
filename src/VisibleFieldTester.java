public class VisibleFieldTester {

    public static void main(String[] args) {

        //MineField mine1 = new MineField(6,6,6);
        //MineField mine2 = new MineField(6,6,6);

        //mine1.populateMineField(5,6);

        //VisibleField vis = new VisibleField(mine1);

        VisibleField vis = new VisibleField(new MineField(6, 6, 6));
        vis.getMineField().populateMineField(2, 3);

        //MineField mine = vis.getMineField();
/*
        for (int i = 0; i < mine.numRows(); i++) {
            for (int j = 0; j < mine.numCols(); j++) {
                System.out.print(mine.hasMine(i, j) + " ");
            }
            System.out.println();
        }
*/      System.out.println();
        for (int i = 0; i < vis.getMineField().numRows(); i++) {
            for (int j = 0; j < vis.getMineField().numCols(); j++) {
                System.out.print(vis.getMineField().hasMine(i, j) + " ");
            }
            System.out.println();
        }

    }


}
