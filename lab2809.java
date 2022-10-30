import java.util.*;
public class lab2809{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of points in DFT :");
        int num = in.nextInt();
        // in.nextLine();
        System.out.println("Enter length of input array :");
        int len = in.nextInt();
        double xn[] = new double[len];
        for(int i = 0;i<len;i++){
            xn[i] = in.nextDouble();
        }
        double xr [] = new double[len];
        double xi [] = new double[len]; 
        for(int k = 0;k<num;k++){
            xi[k] = 0;
            xr[k] = 0;

            for(int n = 0;n<len;n++){
                xr[k] = xr[k]+xn[n] * Math.cos(2 * 3.141592 * k * n/num);

                xi[k] = xi[k]+xn[n] * Math.sin(2 * 3.141592 * k * n/num);
            }

        }
        System.out.println("The output is :");
        for(int i = 0;i < len;i++){
            System.out.println("("+xr[i]+") + j("+xi[i]+")");
        }
    }
}