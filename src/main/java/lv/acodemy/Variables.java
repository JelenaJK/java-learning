package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

   //This is my comment

        /*
        This is first line of my comment
        This is second line of my comment
        This is third line of my comment
         */
// int (integer) - whole number / natural number
        int age = 30;
        int currentYear = 2024;
        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        // double (fractional numbers)
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;
        float shortDistance = 10.3000000f;
        char grade = 'A';
        char myInitial = 'J';
        char currencySymbol = '$';



        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);
        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        // boolean (logical type, can keep only two values: true of false)
        // How to name? has or is
        // Example: isSummer / if(isSummer) {} / isLoggedIn
         boolean hasAccess = true;
         System.out.println(hasAccess);

         boolean isSummer = false;
         System.out.println(isSummer);

         //long
        long phoneNumber = 786543245;
        
        //float
        float interestRate = 4.5f;
        
        //Arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a+b; //add
        System.out.print(sum);
        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.print(difference);

        int m = 7;
         int n = 3;
         int result = m * n;
         System.out.println(result);

         int num1 = 10;
         int num2 = 3;
         int division = num1/num2;
         System.out.println(division);

         double num3 = 10.0;
         double num4 = 3.0;
         double divResult = num3 / num4;
         System.out.println(divResult);

         int f = 12;
         int g = 5;
         int reminder = f % g;
        System.out.println(reminder);

        int number = 9;
        boolean isEven = (number % 2 == 0);  // comparison operator
        System.out.println(isEven);

        // Increment ++
        // ++preIncrement
        // Decrement--
        // ++decrement

        int counter = 10;
        counter++;
        int postIncrement = counter++;

    }
}
