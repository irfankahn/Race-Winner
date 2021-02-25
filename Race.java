/* Created By Irfanullah Khan
   CSCI 111
   Programming Assignment 08
 */

import java.util.Scanner;

public class Race {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Declaring Strings as names from user
        String name_1;
        String name_2;
        String name_3;
        String name_4;

        // Asking  user for the name of runner 1
        System.out.print("Please enter the name of runner # 1: ");
        name_1 = scan.nextLine();
        // Asking user for the time taken by runner 1
        System.out.print("Please enter " + name_1 + "'s time (in minutes):  ");
        int finish_time1 = Integer.parseInt(scan.nextLine());
        while (finish_time1 <= 0) {
            System.out.println("Invalid Time Entry. Try again.");
            System.out.print("Please enter " + name_1 + "'s time (in minutes):  ");
            finish_time1 = Integer.parseInt(scan.nextLine());
        }


        // Asking user For the name of Runner 2
        System.out.print("Please enter the name of runner # 2: ");
        name_2 = scan.nextLine();
        // Asking user to input the time taken by Runner 2
        System.out.print("Please enter " + name_2 + "'s time (in minutes): ");
        int finish_time2 = Integer.parseInt(scan.nextLine());
        while (finish_time2 <= 0) {
            System.out.println("Invalid Time Entry. Try again.");
            System.out.print("Please enter " + name_2 + "'s time (in minutes):  ");
            finish_time2 = Integer.parseInt(scan.nextLine());
        }


        // Asking user for the name of Runner 3
        System.out.print("Please enter the name of runner # 3: ");
        name_3 = scan.nextLine();
        // Asking User for the time taken by Runner 3
        System.out.print("Please enter " + name_3 + "'s time (in minutes): ");
        int finish_time3 = Integer.parseInt(scan.nextLine());
        while (finish_time3 <= 0) {
            System.out.println("Invalid Time Entry. Try again.");
            System.out.print("Please enter " + name_3 + "'s time (in minutes):  ");
            finish_time3 = Integer.parseInt(scan.nextLine());
        }


        // Asking user for the name of Runner 4
        System.out.print("Please enter the name of runner # 4: ");
        name_4 = scan.nextLine();
        // Asking User for the time taken by Runner 4
        System.out.print("Please enter " + name_4 + "'s time (in minutes): ");
        int finish_time4 = Integer.parseInt(scan.nextLine());
        while (finish_time4 <= 0) {
            System.out.println("Invalid Time Entry. Try again.");
            System.out.print("Please enter " + name_4 + "'s time (in minutes):  ");
            finish_time4 = Integer.parseInt(scan.nextLine());
        }
// Printing Out The Gold Medal Winner
        if (finish_time1 < finish_time2 && finish_time1 < finish_time3) {
            System.out.println("Gold Medal Winner: " + name_1);
        } else if (finish_time2 < finish_time1 && finish_time2 < finish_time3) {
            System.out.println("Gold Medal Winner: " + name_2);
        } else if (finish_time3 < finish_time1 && finish_time3 < finish_time2) {
            System.out.println("Gold Medal Winner: " + name_3);


// Printing Out the Silver Medal Winner
        } if (finish_time1 > finish_time2 && finish_time1 < finish_time3) {
            System.out.println("Silver Medal Winner: " + name_1);
        } else if (finish_time1 > finish_time3 && finish_time1 < finish_time2) {
            System.out.println("Silver Medal Winner: " + name_1);
        } else if (finish_time2 > finish_time1 && finish_time2 < finish_time3) {
            System.out.println("Silver Medal Winner: " + name_2);
        } else if (finish_time2 > finish_time3 && finish_time1 < finish_time1) {
            System.out.println("Silver Medal Winner: " + name_2);
        } else if (finish_time3 > finish_time1 && finish_time3 < finish_time2) {
            System.out.println("Silver Medal Winner: " + name_3);
        } else if (finish_time3 > finish_time2 && finish_time3 < finish_time1) {
            System.out.println("Silver Medal Winner: " + name_3);

// Printing Out the Bronze Medal winner
    }if (finish_time1 > finish_time2 && finish_time1 > finish_time3) {
        System.out.println("Bronze Medal Winner: " + name_1);
    } else if (finish_time2 > finish_time1 && finish_time2 > finish_time3) {
        System.out.println("Bronze Medal Winner: " + name_2);
    } else if (finish_time3 > finish_time1 && finish_time3 > finish_time2) {
        System.out.println("Bronze Medal Winner: " + name_3);
        } else {
            System.out.print("");
        }
    }
}