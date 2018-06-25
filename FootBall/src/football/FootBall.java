
package football;

import java.util.Scanner;


public class FootBall {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter name :");
        String name = sc.nextLine();
        System.out.println("enter age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter Country :");
        String Country = sc.nextLine();
        System.out.println("enter number of goal :");
        double goal = sc.nextDouble();
        System.out.println("enter number of assists :");
        double assist = sc.nextDouble();
         System.out.println("enter number of matches :");
        double match = sc.nextDouble();
        FootballerManagement  obj = new FootballerManagement  (name,age,Country,goal,assist,match);
        System.out.println("how many goals want to add");
        double goals = sc.nextDouble();
         System.out.println("how many assists want to add");
        double assists = sc.nextDouble();
         System.out.println("how many matches want to add");
        double matches = sc.nextDouble();
        double g = obj.increasegoal(goals);
        double a = obj.increasegoal(assists);
        double m = obj.increasegoal(matches);
        System.out.println(" total goal :"+ goals);
        System.out.println(" total assist :"+ assists);
        System.out.println(" total match :"+ matches);
    }
    
}
