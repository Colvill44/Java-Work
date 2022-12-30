import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int per = 1;
        int choice = 0;
        float percentTotal = 0;
        float housing, utilities, transportation, food, entertainment, debt, other, savings, income;

        System.out.println("Welcome to the Monthly Budget Calculator!");
        System.out.println("Please enter your name: ");

        name = input.nextLine();
        User user = new User(name);
        user.setName(name);

        System.out.println("--------------------------------------------");
        System.out.println("Hello " + name + "!");
        System.out.println("If you would like to use our recommended budget, please enter 1. If you would like to enter your own budget, please enter 2.");

        while(choice != 1 && choice != 2) {
            choice = input.nextInt();
            if(choice != 1 && choice != 2) {
                System.out.println("Please enter a valid choice.");
            }
        }
        System.out.println("--------------------------------------------");

        if(choice == 1) {
            user.setHousing(30);
            user.setUtilities(5);
            user.setTransportation(10);
            user.setFood(20);
            user.setEntertainment(5);
            user.setDebt(10);
            user.setOther(10);
            user.setSavings(10);
        }
        else if(choice == 2) {
            System.out.println("You will be asked to enter your budget percentages for the following:");
            System.out.println("Housing, Utilities, Transportation, Food, Entertainment, Debt, Other, Savings");
            System.out.println("----------------------------------------");
            while(per == 1){
                System.out.println("Please enter your housing budget percentage: ");
                housing = input.nextFloat();
                user.setHousing(housing);

                System.out.println("Please enter your utilities budget percentage: ");
                utilities = input.nextFloat();
                user.setUtilities(utilities);

                System.out.println("Please enter your transportation budget percentage: ");
                transportation = input.nextFloat();
                user.setTransportation(transportation);

                System.out.println("Please enter your food budget percentage: ");
                food = input.nextFloat();
                user.setFood(food);

                System.out.println("Please enter your entertainment budget percentage: ");
                entertainment = input.nextFloat();
                user.setEntertainment(entertainment);

                System.out.println("Please enter your debt budget percentage: ");
                debt = input.nextFloat();
                user.setDebt(debt);

                System.out.println("Please enter your other budget percentage: ");
                other = input.nextFloat();
                user.setOther(other);

                System.out.println("Please enter your savings budget percentage: ");
                savings = input.nextFloat();
                user.setSavings(savings);

                percentTotal = housing + utilities + transportation + food + entertainment + debt + other + savings;
                if(percentTotal > 100 || percentTotal < 0) {
                    System.out.println("----------------------------------------------");
                    System.out.println("Your percentages are out of the bounds 0-100. Please try again.");
                    System.out.println("----------------------------------------------");
                }
                else{
                    per = 0;
                }
            }
            System.out.printf("Thanks for entering your budget percentages %s! \n", user.getName());
            System.out.println("----------------------------------------------");

        }
        else {
            System.out.println("Invalid input. Please try again.");
        }

        System.out.println("Please enter your monthly income: ");
        income = input.nextFloat();
        user.setIncome(income);
        System.out.println("----------------------------------------------");

        System.out.println("Your monthly budget is: ");
        showBudget(user);




    }
    static void showBudget(User user){
        float housing = user.getHousing();
        float utilities = user.getUtilities();
        float transportation = user.getTransportation();
        float food = user.getFood();
        float entertainment = user.getEntertainment();
        float debt = user.getDebt();
        float other = user.getOther();
        float savings = user.getSavings();
        float income = user.getIncome();

        float housingBudget = income * (housing/100);
        float utilitiesBudget = income * (utilities/100);
        float transportationBudget = income * (transportation/100);
        float foodBudget = income * (food/100);
        float entertainmentBudget = income * (entertainment/100);
        float debtBudget = income * (debt/100);
        float otherBudget = income * (other/100);
        float savingsBudget = income * (savings/100);

        System.out.printf("Current Monthly Income: $% .2f \n", income);
        System.out.println("-----------------------------------");
        System.out.printf("Housing: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getHousing(), housingBudget);
        System.out.println("-----------------------------------");
        System.out.printf("Utilities: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getUtilities(), utilitiesBudget);
        System.out.println("-----------------------------------");
        System.out.printf("Transportation: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getTransportation(), transportationBudget);
        System.out.println("-----------------------------------");
        System.out.printf("Food: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getFood(), foodBudget);
        System.out.println("-----------------------------------");
        System.out.printf("Entertainment: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getEntertainment(), entertainmentBudget);
        System.out.println("-----------------------------------");
        System.out.printf("Debt: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getDebt(), debtBudget);
        System.out.println("-----------------------------------");
        System.out.printf("Other: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getOther(), otherBudget);
        System.out.println("-----------------------------------");
        System.out.printf("Savings: \nPercentage - %.0f%% \nAmount - $% .2f \n", user.getSavings(), savingsBudget);
        System.out.println("-----------------------------------");
    }
}