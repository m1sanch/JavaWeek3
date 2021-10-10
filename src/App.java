
public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //Create two variables
    double costOfItem1 = 20.0;
    double costOfItem2 = 15.0;
    double amtMoneyWallet1 = 20.0;
    double amtMoneyWallet2 = 20.0;
    int numFriendsAt25 = 12;
    int numFriendsAt26 = 3;
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
    
    // calculating the number of friends made each year
    float avgNumOfFriendsAt26 = (float) numFriendsAt26 / age26;
    float avgNumOfFriendsAt25 = (float) numFriendsAt25 / age25;
    
    //full name
    String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
    String fullName2 = lastName2 + ", " + firstName2 + " " + middleInitial2;
    
    
    // Question 5 
    //print to the console the new values created
    
    //Amount of new money when you have no more money left in wallet after purchasing an item
    System.out.println("After I purchased a lottery ticket I now have " + newAmtMoneyWallet1 + " money left.");
    //Amount of money left after you purchase an item
    System.out.println("I now have " + newAmtMoneyWallet2 + " dollars for gas money!");
    //Average amount of friends at age 26
    System.out.println("Last year I made an average friend count of " + avgNumOfFriendsAt26 + ", when I was 26.");
    //Average amount of friends at age 25
    System.out.println("I made more friends on average when I was 25 because I made an average of " + avgNumOfFriendsAt25 + " friends that year!");
    //Full Name with first name first
    System.out.println("My name is " + fullName1);
    //Full Name with last name first;
    System.out.println("However, sometimes I go by " + fullName2);
    

  }

}
