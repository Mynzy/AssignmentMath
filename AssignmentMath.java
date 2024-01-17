package Math;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
public class AssignmentMath {
    private static PrintWriter output;

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        
        System.out.print("enter whether 1 degree or 2 degree: ");
        int choice  = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter the Constant(C): ");
            double c = input.nextDouble();
            System.out.print("Enter the initial A0: ");
            double a0 = input.nextDouble();
            System.out.print("Enter the maxloop: ");
            int maxloop = input.nextInt();
            int maxloop1= maxloop +1;

            double[] a = new double[maxloop1];
            a[0] = a0;
            
            for (int i = 1; i < maxloop1; i ++){
                a[i] = c*a[i-1];
            }
            TextFile(output,maxloop1,maxloop,a,c);
            Output(maxloop1,maxloop,a,c);
            
        } else if (choice == 2){
            System.out.print("Enter the Constant(C): ");
            double c = input.nextDouble();
            System.out.print("Enter the initial A0: ");
            double a0 = input.nextDouble();
            System.out.print("Enter the initial A1: ");
            double a1 = input.nextDouble();
            System.out.print("Enter the maxloop: ");
            int maxloop = input.nextInt();
            int maxloop1 = maxloop+1;
 
            double[] a = new double[maxloop1];
            a[0] = a0;
            a[1] = a1;
            for (int i = 2; i < maxloop1 ; i ++){
                a[i] = c*a[i-1] + c*a[i-2];
            } 
            TextFile(output,maxloop1,maxloop,a,c);
            Output(maxloop1,maxloop,a,c);
        }
 
    }
    public static void Output(int maxloop1,int maxloop,double [] a,double c){
        
         for (int i = 0; i < maxloop1; i++){
                System.out.println("n : "+i+" = " +a[i]);  
            } 
        
         System.out.println("____________________\nOutput : \n--------------------");
            if (a[0] < a[maxloop]){
                System.out.println("Incresing\t: Yes");
            }
            else {
                System.out.println("Incresing\t: No");
            }
            if (a[0] > a[maxloop]){
                System.out.println("Decresing\t: Yes");
            }
            else {
                System.out.println("Decresing\t: No");
            }
            if (a[0] == a[maxloop]){
                System.out.println("Constant\t: Yes");
            }
            else {
                System.out.println("Constant\t: No");
            }
            if (c<0){
                System.out.println("Up-down \t: Yes");
            }
            else {
                System.out.println("Up-down \t: No");
            }
            if (Math.abs(a[maxloop-1])>= 1000) {
            System.out.println("Diverging\t: Yes");
            } 
            else {
            System.out.println("Diverging\t: No");
            } 
            if  (Math.abs(a[maxloop-1])< 0.0001) {
            System.out.println("Converging\t: Yes");
            } 
            else {
            System.out.println("Converging\t: No");
            } 
            System.out.println("____________________");
            
    }
    
    public static void TextFile(PrintWriter output,int maxloop1,int maxloop,double [] a,double c){
        
         try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {

                for (int i = 0; i < maxloop1; i++) {
                    writer.println("n : " + i + " = " + a[i]);   
                }
                 writer.println("_____________________\nOutput :\n---------------------");
            if (a[0] < a[maxloop]){
                writer.println("Incresing\t: Yes");
            }
            else {
                writer.println("Incresing\t: No");
            }
            if (a[0] > a[maxloop]){
                writer.println("Decresing\t: Yes");
            }
            else {
                writer.println("Decresing\t: No");
            }
            if (a[0] == a[maxloop]){
                writer.println("Constant\t: Yes");
            }
            else {
                writer.println("Constant\t: No");
            }
            if (c<0){
                writer.println("Up-down \t: Yes");
            }
            else {
                writer.println("Up-down \t: No");
            }
            if (Math.abs(a[maxloop-1])>= 1000) {
                writer.println("Diverging\t: Yes");
            } 
            else {
                writer.println("Diverging\t: No");
            } 
            if  (Math.abs(a[maxloop-1])< 0.0001) {
                writer.println("Converging\t: Yes");
            } 
            else {
                writer.println("Converging\t: No");
            } 
                writer.println("_____________________");    
                
            } catch (Exception e) {
                 e.printStackTrace();}
    }
    
}