package snippets2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by root on 11/3/16.
 */
public class MatrixMultiplication {
    int mat1[][];
    int mat2[][];
    int mat3[][];

    MatrixMultiplication(int dimention){
        mat1=new int[dimention][dimention];
        mat2=new int[dimention][dimention];
        mat3=new int[dimention][dimention];
    }

    public void add(int dimention) throws  Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //reading matrix1
        System.out.println("Enter the Values for Matrix 1");
        for(int i=0;i<dimention;i++){
            for(int j=0;j<dimention;j++){
                System.out.println("Enter the Value for MATRIX1 ["+i+"]"+"["+j+"]");
                mat1[i][j]=Integer.parseInt(br.readLine());
            }
        }

        //reading matrix2
        System.out.println("Enter the Values for Matrix 2");
        for(int i=0;i<dimention;i++){
            for(int j=0;j<dimention;j++){
                System.out.println("Enter the Value for MATRIX2 ["+i+"]"+"["+j+"]");
                mat2[i][j]=Integer.parseInt(br.readLine());
            }
        }
        //adding matrix1& matrix2

        //display Matrix1 Contents
        System.out.println("Contents Of Matrix1:");
        for(int i=0;i<dimention;i++){
            for(int j=0;j<dimention;j++){
                System.out.print(" "+mat1[i][j]);
            }
            System.out.println("");
        }

        //display Matrix2 Contents
        System.out.println("Contents Of Matrix2:");
        for(int i=0;i<dimention;i++){
            for(int j=0;j<dimention;j++){
                System.out.print(" "+mat2[i][j]);
            }
            System.out.println("");
        }

        //Multiplying Matrix1& mMatrix2
        for(int i=0;i<dimention;i++){
            for(int j=0;j<dimention;j++){
                mat3[i][j]=0;
                for(int k=0;k<dimention;k++){
                    //TODO Logic has to be changed
                    mat3[i][j]+=mat1[i][j]*mat2[j][i];
                }
            }
        }

        //display Matrix3 Contents
        System.out.println("Contents Of Matrix3:");
        for(int i=0;i<dimention;i++){
            for(int j=0;j<dimention;j++){
                System.out.print(" "+mat3[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String args[])throws Exception{


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Dimension");
        int dimention=Integer.parseInt(br.readLine());
        AddingMatrices obj=new AddingMatrices(dimention);
        obj.add(dimention);
    }
}
