class Matrix
{
    //precondition, must be a matrix
    private double[][] mat;

    public Matrix(double[][] m)
    {
        mat = m;
    }

    public double[][] getMat()
    {
        return mat;
    }

    public static Matrix multiplication(Matrix m1, Matrix m2)
    {
        double[][] mat1 = m1.getMat();
        double[][] mat2 = m2.getMat();
        //checks if multiplication can be preformed
        if(!(m1.getMat()[0].length == m2.getMat().length))//not the best protection, but should service enough w/ precondition
        {
            return null;
        }
        
        //if valid:
        double[][] m3 = new double[m1.getMat().length][m2.getMat()[0].length];

        for (int rowm1 = 0; rowm1 < mat1.length; rowm1++)
        {
            for (int columnm2 = 0; columnm2 < mat2[0].length; columnm2++)
            {
                for (int column1 = 0; column1 < mat1[0].length; column1++)//row2
                {
                    m3[rowm1][columnm2] += mat1[rowm1][column1] * mat2[column1][columnm2];
                }
            }
        }
        return new Matrix(m3);
    }

    public void printMatrix()
    {
        for (double[] rows: mat)
        {
            System.out.print("{");
            for (double column: rows)
            {
                System.out.print(column + ", ");
            }
            System.out.println("}");
        }
    }
}