public class runner 
{
    public static void main(String[] args)
    {
        double[][] mat1 = 
        {
            {1.0, 2.0, 3.0, 5.0},
            {4.0, 5.0, 6.0, 7.0},
            {7.0, 8.0, 9.0, 9.0}
        };

        double[][] mat2 = 
        {
            {1.0, 2.0, 3.0, 4.0, 5.0},
            {4.0, 5.0, 6.0, 7.0, 8.0},
            {7.0, 8.0, 9.0, 10.0, 11.0},
            {10.0, 11.0, 12.0, 13.0, 14.0}
        };
            
        Matrix m1 = new Matrix(mat1);
        Matrix m2 = new Matrix(mat2);

        Matrix m3 = Matrix.multiplication(m1, m2);

        m1.printMatrix();
        m2.printMatrix();
        m3.printMatrix();
    }    
}
