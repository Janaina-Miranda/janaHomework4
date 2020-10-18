/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janahomework4;

import java.util.*;

/**
 *
 * @author janam
 */
public class JanaHomework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //scanner to capture the input from the user
        Scanner myScanner = new Scanner(System.in);
        String userNumber;
        boolean valid = false;
        int number;
        
        //do this block of code as long as the conditionals are true
        do {
            System.out.println("Please, enter a valid Irish number");
            userNumber = myScanner.nextLine();
            
            //if checking the alternatives, the first one is to check if one of the three conditions are true, then the code will keep running 
            if (!isPostalCodeValid(userNumber)) {
                System.out.println("This is not a valid Iriah number, try again, please");
                continue;
            }
            
            if (!isPhoneValid(userNumber)) {
                System.out.println("This is not a valid Iriah number, try again, please"); //else is going to be executed if the if conditional is false
                continue;
            }

            //try statement test the block looking for errors
            try {
                userNumber = userNumber.replace(" ", ""); //replace is getting rid of the space and the - to check the code 
                userNumber = userNumber.replace("-", "");
                number = Integer.parseInt(userNumber); //here I am converting a String to a Integer to validate it
                System.out.println("Thanks, I will call you tomorrow");  
                valid = true;

            } catch (Exception e) {
                System.out.println("This is not a valid Iriah number, try again, please"); //try is running while is true, if is there any error, catch is executed 
            }
            

        } while (valid == false); //that is going to be executed when valid is equal to false
    }
    
    public static boolean isPostalCodeValid(String phone) {
        return phone.startsWith("085") || phone.startsWith("086") || phone.startsWith("087");
    }
    
    public static boolean isPhoneValid(String phone) {
        if (phone.length() < 10 || phone.length() > 11) {
            return false;
        }
        
        if (phone.length() == 11) {
            return phone.substring(3) == "-" || phone.substring(3) == " ";
        }
        
        return true && false;
    }
}
