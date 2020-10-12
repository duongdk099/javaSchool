import java.util.Scanner;
class first {
    public static void main(final String[] args) {
        System.out.println("Enter a number");
        final Scanner scNum = new Scanner(System.in); // Create a variable to scan num

        final int numUser= scNum.nextInt(); // Read the variable that we just called
        if(numUser > 0)
        {
            //System.out.println("Your number is more than the age of normal could wish");
            System.out.println(1);
        }
        else if (numUser <0) { //System.out.println("Great, it's laid on the range of the age of normal people"); 
        System.out.println(-1);    }
        else System.out.println(0);
        //System.out.println("You had enter :"+ numUser);

        scNum.close(); // always remember to close the scanner from library that we had called
    }
}
