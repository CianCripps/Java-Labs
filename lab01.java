
// Name: Cian Cripps
public class lab01 {
    // Q1 Temp conversion
    static void tempConversion() {
        float Cork_City_Temp = 10.2f;
        float sum1 =  Cork_City_Temp/5;
        float sum2 = sum1 * 9;
        float conversion = sum2 + 32; 
        System.out.printf("Centigrade: " + Cork_City_Temp + " Fahrenheit: " + conversion);
        }

    // Q2 Area and circumference of a circle
    static void Area_and_circumference() {
        // Area
        float Pi = 3.14f;
        float radius = 111.55f;
        float Area = Pi * ( radius * radius );
        System.out.printf("Area: " + Area);
        // Circumference
        float circumference = 2 * ( Pi * radius );
        System.out.printf("Circumference: " + circumference);
        }

    // Q3 Planets and Weight
    static void Planets_and_weight() {
        double Alice = 50d;
        double Mercury = (Alice * 0.4);
        double Venus = (Alice * 0.9);
        double Jupiter = (Alice * 2.5);
        double Saturn = (Alice * 1.1);
        System.out.printf("Earth weight: " + Alice);
        System.out.printf("Mercury weight: " + Mercury);
        System.out.printf("Venus weight: " + Venus);
        System.out.printf("Jupiter weight: " + Jupiter);
        System.out.printf("Saturn weight: " + Saturn);
        }
    // Q4 Grades
    static void Grades() {
        // Alice 
        float Alice_exam1 = 90;
        float Alice_exam2 = 60;
        float Alice_exam3 = 80;
        float Alice_total = Alice_exam1 + Alice_exam2 + Alice_exam3;
        float Alice_result = Alice_total / 300 * 100;
        if (Alice_result > 80) {
            System.out.println("A");
        }
        else if (Alice_result > 60) {
            System.out.println("B");
        }
        else if (Alice_result > 40) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
        // Bob
        float Bob_exam1 = 50;
        float Bob_exam2 = 0;
        float Bob_exam3 = 30;
        float Bob_total = Bob_exam1 + Bob_exam2 + Bob_exam3;
        float Bob_result = Bob_total / 300 * 100;
        if (Bob_result > 80) {
            System.out.println("A");
        }
        else if (Bob_result > 60) {
            System.out.println("B");
        }
        else if (Bob_result > 40) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
        // Clive
        float Clive_exam1 = 60;
        float Clive_exam2 = 70;
        float Clive_exam3 = 75;
        float Clive_total = Clive_exam1 + Clive_exam2 + Clive_exam3;
        float Clive_result = Clive_total / 300 * 100;
        if (Clive_result > 80) {
            System.out.println("A");
        }
        else if (Clive_result > 60) {
            System.out.println("B");
        }
        else if (Clive_result > 40) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
    // Q5 Loans
        static void loans() {
            // Alice
            int aliceIncome = 1500;
            int aliceLoanAmount = 0;
            String aliceLoanCategory = "";
    
            // Bob
            int bobIncome = 700;
            int bobLoanAmount = 0;
            String bobLoanCategory = "";
    
            // Clive
            int cliveIncome = 100;
            int cliveLoanAmount = 0;
            String cliveLoanCategory = "";
    
            // Alice's loan category and amount
            switch(aliceIncome / 1000) {
                case 1:
                    aliceLoanCategory = "Category 1";
                    aliceLoanAmount = (int)(3.5 * aliceIncome);
                    break;
                case 0:
                    aliceLoanCategory = "Category 4";
                    break;
                default:
                    aliceLoanCategory = "Category 2";
                    aliceLoanAmount = (int)(2.5 * aliceIncome);
                    break;
            }
    
            // calculate Bob's loan category and amount
            switch(bobIncome / 1000) {
                case 1:
                    bobLoanCategory = "Category 1";
                    bobLoanAmount = (int)(3.5 * bobIncome);
                    break;
                case 0:
                    if (bobIncome >= 200) {
                        bobLoanCategory = "Category 3";
                        bobLoanAmount = (int)(2 * bobIncome);
                    } else {
                        bobLoanCategory = "Category 4";
                    }
                    break;
                default:
                    bobLoanCategory = "Category 2";
                    bobLoanAmount = (int)(2.5 * bobIncome);
                    break;
            }
    
            // calculate Clive's loan category and amount
            switch(cliveIncome / 1000) {
                case 1:
                    cliveLoanCategory = "Category 1";
                    cliveLoanAmount = (int)(3.5 * cliveIncome);
                    break;
                case 0:
                    if (cliveIncome >= 200) {
                        cliveLoanCategory = "Category 3";
                        cliveLoanAmount = (int)(2 * cliveIncome);
                    } else {
                        cliveLoanCategory = "Category 4";
                    }
                    break;
                default:
                    cliveLoanCategory = "Category 3";
                    cliveLoanAmount = (int)(2 * cliveIncome);
                    break;
            }
    
            // output the loan categories and amounts
            System.out.println("Alice's loan category is " + aliceLoanCategory);
            if (!aliceLoanCategory.equals("Category 4")) {
                System.out.println("Alice's loan amount is " + aliceLoanAmount + " euros");
            }
            System.out.println("Bob's loan category is " + bobLoanCategory);
            if (!bobLoanCategory.equals("Category 4")) {
                System.out.println("Bob's loan amount is " + bobLoanAmount + " euros");
            }
            System.out.println("Clive's loan category is " + cliveLoanCategory);
            if (!cliveLoanCategory.equals("Category 4")) {
                System.out.println("Clive's loan amount is " + cliveLoanAmount + " euros");
            }
        }
        // Q6 Bloods
        static void bloods() {
            // create a list of donors with their age and weight
            String[] donors = {"Alice", "Bob", "Jemmy", "Clive"};
            int[] ages = {19, 20, 17, 80};
            double[] weights = {50, 36, 45, 100};
                
            // check each donor's eligibility to donate blood
            for (int i = 0; i < donors.length; i++) {
                if (ages[i] >= 18 && ages[i] <= 60 && weights[i] > 40) {
                    System.out.println(donors[i] + " can donate blood.");
                } else {
                    System.out.println(donors[i] + " cannot donate blood because:");
                    if (ages[i] < 18) {
                        System.out.println("- they are under 18 years old.");
                    } else if (ages[i] > 60) {
                        System.out.println("- they are over 60 years old.");
                    }
                    if (weights[i] <= 40) {
                        System.out.println("- their body weight is less than or equal to 40 kg.");
                    }
                }
            }
        }
        public static void main(String[] args) {

            // tempConversion();
            // Area_and_circumference();
            // Planets_and_weight();
            // loans();
            // Grades();
            // bloods();
        }
    }
    

        

    

