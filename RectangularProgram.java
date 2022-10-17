import java.util.Scanner;
class RectangularProgram {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int panjang = s.nextInt(),
            lebar = s.nextInt();
        
        for(int i = 3;i < lebar+3;i++) {
            if(i==3||i==lebar+3-1)  {
                for(int j=0;j<panjang;j++) {
                    System.out.print("* ");
                }
            }
            else {
                for(int j=0; j<panjang;j++) {
                    if(j==0||j==panjang-1) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}