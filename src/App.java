
public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //Create two variables
    double costOfItem1 = 20.0;
    double costOfItem2 = 15.0;
    double amtMoneyWallet1 = 20.0;
    double amtMoneyWallet2 = 20.0;
    int numNewFriendsAt25 = 8;
    int numNewFriendsAt26 = 3;
    int age25 = 25;
    int age26 = 26;
    String firstName1 = "Michael";
    String firstName2 = "Mike";
    String lastName1 = "Sanchez";
    String lastName2 = "sanchez";
    String middleInitial1 = "R";
    String middleInitial2 = "r";
    
    //Operations
    // calculate the amount of money in the wallet after buying an item
    double newAmtMoneyWallet1 = amtMoneyWallet1 - costOfItem1;
    double newAmtMoneyWallet2 = amtMoneyWallet2 - costOfItem2;
    
    // calulating the number of friends made each year
    int numOfFriendsAt27 = numNewFriendsAt26 + numNewFriendsAt25;
    
    //full name
    String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
    String fullName2 = lastName2 + ", " + firstName2 + " " + middleInitial2;
    
    
    // Question 5 
    //print to the console the new values created
    
    //Amount of new money when you have no more money left in wallet after purchasing an item
    System.out.println(newAmtMoneyWallet1);
    //Amount of money left after you purchase an item
    System.out.println(newAmtMoneyWallet2);
    //Amount of friends at age 27
    System.out.println(numOfFriendsAt27);
    //Full Name with first name first
    System.out.println(fullName1);
    //Full Name with last name first;
    System.out.println(fullName2);
    

  }

}
