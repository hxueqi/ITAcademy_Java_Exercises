package ejercicios.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Fase1_2_3 {
    public static void main(String[] args) {
        //Create the money notes
        int money[] ={5, 10, 20, 50, 100, 200, 500};

        //Int variable for total price of the food
        int totalPrice = 0;

        //Create the menu, including the dishes and price
        String dishes[]= new String [5];
        int price[] = new int [5];

        Scanner input = new Scanner(System.in);
        for(int i =0; i<5; i++){
            System.out.println("Input the name of dish " + (i+1));
            dishes[i] = input.nextLine();
            System.out.println("Input the price of dish " + (i+1));
            price[i] = input.nextInt();
            input.nextLine();
        }

        //Show customer the menu
        System.out.println("In the menu we have: ");
        for(int i =0; i<5; i++){
            System.out.println(dishes[i] + ": " + price[i] + "€");
        }

        //Ask the order and save the information, each time ask if want to continue ordering, use 1/0 system
        ArrayList<String> listOrder = new ArrayList<String>();
        int wantsOrderMore;
        do{
            System.out.println("What would you like to eat?");
            listOrder.add(input.nextLine());
            System.out.println("Anything else? 1 = Yes, 0 = No");
            wantsOrderMore = input.nextInt();
            input.nextLine();
        }
        while(wantsOrderMore==1);

        //Check the order if we can serve and calculate the total price,
        for(int i=0; i<listOrder.size(); i++) {
            if (arrayContains(dishes, listOrder.get(i))==true) {
                totalPrice += price[i];
            } else{
                System.out.println(listOrder.get(i) +", this dish does not exist in the menu");
            }
        }

        //Calculate the note
        for (int i=money.length-1; totalPrice>0 && i>=0; i--) {
            int cont = 0;
            while (money[i] <= totalPrice) {
                totalPrice -= money[i];
                cont++;
            }
            if (cont>0) {
                System.out.println("You should pay " + cont +" of "+ money[i]+ "€" + "\n");
            }
        }
    }

    private static boolean arrayContains (String[] arr, String elem) {
        for(int i=0; i< arr.length; i++){
            if(arr[i].equals(elem)) return true;
        }
        return false;
    }
}
