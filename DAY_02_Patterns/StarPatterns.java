package DAY_02_Patterns;

import Utils.Input;
public class StarPatterns {
    private static Input input = new Input();

    // Helper Functions
    private static void multiplyAndPrint(int count, String string){
        for(int i=0;i<count;i++){
            System.out.print(string);
        }
    }

    private static void seperator(){
        System.out.println();
        multiplyAndPrint(20, "-");
        System.out.println();
        System.out.println();

    }

    public static void pyramid(int rows){
        for(int i=1;i<=rows;i++){
            multiplyAndPrint(rows-i," ");
            multiplyAndPrint(i, "* ");
            System.out.println();
        }
    }

    public static void downwardPyramid(int rows){
        for (int i = rows; i > 0 ; i--) {
            multiplyAndPrint(rows-i, " ");
            multiplyAndPrint(i,"* ");
            System.out.println();
        }
    }

    public static void rightTriangle(int rows){

        for(int i=1;i<=rows;i++){
            multiplyAndPrint(i, "* ");
            System.out.println();
        }
    }

    public static void leftTriangle(int rows){

        for(int i=1;i<=rows;i++){
            multiplyAndPrint(rows-i,"  ");
            multiplyAndPrint(i," *");
            System.out.println();
        }
    }

    public static void diamondShape(int rows){

        int mid = (rows*2)-1;
        for(int i=1;i<mid;i+=2){
            multiplyAndPrint(mid-i," ");
            multiplyAndPrint(i,"* ");
            System.out.println();
        }
        for(int i=mid;i>0;i-=2){
            multiplyAndPrint(mid-i," ");
            multiplyAndPrint(i,"* ");
            System.out.println();
        }
    }

    public static void downwardTriangleRight(int rows){

        for(int i=rows;i>0;i--){
            multiplyAndPrint(i,"* ");
            System.out.println();
        }
    }

    public static void downwardTriangleLeft(int rows){

        for(int i=rows;i>0;i--){
            multiplyAndPrint(rows-i, "  ");
            multiplyAndPrint(i," *");
            System.out.println();
        }
    }

    public static void pascalRight(int rows){
        rightTriangle(rows);
        downwardTriangleRight(rows-1);
    }

    public static void pascalLeft(int rows){
        leftTriangle(rows);
        for(int i=rows-1;i>0;i--){
            multiplyAndPrint(rows-i,"  ");
            multiplyAndPrint(i," *");
            System.out.println();
        }
    }

    public static void sandGlass(int rows){
        downwardPyramid(rows);
        pyramid(rows);
    }

    public static void starTriangle(int rows){
        for(int i=1;i<=rows;i++){
            multiplyAndPrint(rows-i," ");
            if(i == 1 || i == rows){
                multiplyAndPrint(i, "* ");
            }else{
                System.out.print("* ");
                multiplyAndPrint(i-2,"  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starDownTriangle(int rows){
        for (int i = rows; i > 0 ; i--) {
            multiplyAndPrint(rows-i," ");
            if(i == 1 || i == rows){
                multiplyAndPrint(i,"* ");
            }else{
                System.out.print("* ");
                multiplyAndPrint(i-2,"  ");
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void startDiamond(int row){
        for (int i = 1; i <= row; i++) {
            multiplyAndPrint(row-i," ");
            if(i == 1){
                multiplyAndPrint(i,"* ");
            }else{
                System.out.print("* ");
                multiplyAndPrint(i-2,"  ");
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = row-1; i > 0; i--) {
            multiplyAndPrint(row-i," ");
            if(i == 1){
                multiplyAndPrint(i,"* ");
            }else{
                System.out.print("* ");
                multiplyAndPrint(i-2,"  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int rows = 5;
//        pyramid(rows);
//        rightTriangle(rows);
//        leftTriangle(rows);
//        diamondShape(rows);
//        downwardTriangleRight(rows);
//        pascalRight(rows);
//        pascalLeft(rows);
//        sandGlass(rows);
//        starTriangle(rows);
//        starDownTriangle(rows);
        startDiamond(rows);
    }


}
