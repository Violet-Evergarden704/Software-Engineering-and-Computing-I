package oo.matrix;

/**
 * 矩阵类，实现矩阵的加法，矩阵乘法，点乘以及转置方法
 */
public class MyMatrix {
    private int[][] data;
    private int rows;
    private int columns;

    /**
     * 构造函数，参数为2维int数组
     * a[i][j]是矩阵中的第i+1行，第j+1列数据
     * @param a
     */
    public MyMatrix(int[][] a){
        this.data = a;
        this.rows = a.length;
        if (a != null) {
            this.columns = a[0].length;
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int[][] getData() {
        return data;
    }

    /**
     * 实现矩阵加法，返回一个新的矩阵
     * @param B
     * @return
     */
    public MyMatrix plus(MyMatrix B){
        int[][] dataOfB = B.getData();
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = data[i][j] + dataOfB[i][j];
            }
        }
        MyMatrix resultMatrix = new MyMatrix(result);
        return  resultMatrix;
    }
    /**
     * 打印出该矩阵的数据
     * 起始一个空行，结束一个空行
     * 矩阵中每一行数据呈一行，数据间以空格隔开
     * example：
     *
     * 1 2 3
     * 1 2 3
     * 1 2 3
     * 1 2 3
     *
     */
    public void print(){
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j]);
                if (j < columns - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] data = {
                {1 , 1 , 1},
                {1 , 1 , 1},
                {1 , 1 , 1}
        };
        MyMatrix matrix = new MyMatrix(data);
        MyMatrix result = matrix.plus(matrix);
        result.print();
    }
}