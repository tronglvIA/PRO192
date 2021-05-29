package workshop1;

import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list= new String[3];
// input the list of name.
        for(int i=0; i<3; i++){
            System.out.print("Enter the name "+ i+ "= ");
            list[i] = sc.nextLine();
        }
 //uppercase the first character of name.
//        for(String name: list){
//            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
//            System.out.println(name);
//        }
 //upper all the first character of the name.
        for(String name: list){
            //store each character of the name into array.
            char[] charArrayName = name.toCharArray();
            boolean foundSpace = true;
            // Processing
            for(int i=0 ; i< charArrayName.length; i++){
                if(Character.isLetter(charArrayName[i])) {
                    if(foundSpace){
                        charArrayName[i] = Character.toUpperCase(charArrayName[i]);
                        foundSpace =false;
                    }
                } else{
                    foundSpace = true;
                }
            }
            // convert the charArray of name to Sting
            name= String.valueOf(charArrayName);
            System.out.println("After Capital: "+ name);
        }


    }
}
