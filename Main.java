 import java.util.Scanner;
/**
 * This program will create a multiplication table for whatever number user wants
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 
    //ask user for integer to create times table
    System.out.println("please enter an integer to create a multiplication table for"); 
    int integer = input.nextInt();  

    //use while loop for multiplication 
    for(int count = 1; count <= 12; count++){
      int answer = count * integer; 
      System.out.println(count + " x " + integer + " = " +answer); 
    } 

    
    
  }
}
