
/*
will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:

- Car loan amount
- Interest rate of the loan
- Length of the loan (in years)
- Down payment
- Calculate and add Discount

N.B This is to help me get more comfortable with working with classes and objects.
 */


public class CarLoan {
    static int loan;
    static int loanInterest;
    static int loanlength;
    static int downPayment;
    static boolean isDiscount;
    static int loanDiscount;

    public CarLoan(){
        loan = 10000;
        loanlength = 3;
        downPayment = 2000;
        loanInterest = 5;
        isDiscount = false;
        loanDiscount = 2;
    }
     //calculate discount
        public void getDiscount(){
            loanDiscount = (loanDiscount * loan) / 100;
            System.out.println("Congratulation! You have a discount of " + loanDiscount);
        }

    public static void main(String[] args) {
     CarLoan myLoan = new CarLoan();
        myLoan.getDiscount();

     //check if user is eligible to get a loan
        if(loan <= 0 || loanInterest <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        }else if(downPayment > loan){
            System.out.println("Error! You must take out a valid car loan.");
        }else if(isDiscount){
            int remainingBalance = (loan - downPayment) - loanDiscount;
            int months = loanlength * 12;
            int monthlyBalance = remainingBalance / months;
            double interest = (monthlyBalance * loanInterest) / 100;
            double  monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }else{
            int remainingBalance = (loan - downPayment);
            int months = loanlength * 12;
            int monthlyBalance = remainingBalance / months;
            double interest = (monthlyBalance * loanInterest) / 100;
            double  monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }

    }
}
