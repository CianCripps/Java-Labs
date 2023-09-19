public class loans {
    public static void main(String[] args) {
        // income amount
        int Alice_Income = 1500;
        int Bob_Income = 700;
        int Clive_Income = 100;

        // loan amount
        double Alice_Loan = GetLoan(Alice_Income);
        double Bob_Loan = GetLoan(Bob_Income);
        double Clive_Loan = GetLoan(Clive_Income);

        // loan type
        String Alice_LoanType = GetLoanType(Alice_Income);
        String Bob_LoanType = GetLoanType(Bob_Income);
        String Clive_LoanType = GetLoanType(Clive_Income);

        
        System.out.println("Alice's loan category: " + Alice_LoanType);
        System.out.println("Alice's loan amount: " + Alice_Loan);

        System.out.println("Bob's loan category: " + Bob_LoanType);
        System.out.println("Bob's loan amount: " + Bob_Loan);

        System.out.println("Clive's loan category: " + Clive_LoanType);
        System.out.println("Clive's loan amount: " + Clive_Loan);
    }

    public static double GetLoan(int income) {
        double loanAmount;

        switch ((income)) {
            case 1:
                loanAmount = income * 12 * 3.5;
                break;
            case 2:
                loanAmount = income * 12 * 2.5;
                break;
            case 3:
                loanAmount = income * 12 * 2;
                break;
            default:
                loanAmount = 0;
                break;
        }

        return loanAmount;
    }

    public static String GetLoanType(int income) {
        String loanType;

        switch (income) {
            case 1:
                loanType = "loan category 1";
                break;
            case 2:
                loanType = "loan category 2";
                break;
            case 3:
                loanType = "loan category 3";
                break;
            default:
                loanType = "loan category 4";
                break;
        }

        return loanType;
    }

    public static int GetLoan(int income) {
        if (income > 1000) {
            return 1;
        } else if (income >= 500) {
            return 2;
        } else if (income >= 200) {
            return 3;
        } else {
            return 4;
        }
    }
}
