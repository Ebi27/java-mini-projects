//Bill sharing

/**
 * Able to handle variety of payment scenarios:
 * calculate tax
 * Add tax and tip
 * Split payments evenly between a specific number of people
 */
 //class
public class BillToSplit {
    int numOfIndividuals;
    double tax;
    int billWithoutTax;
    int tip;

    //constructor
    public BillToSplit(){
        numOfIndividuals = 5;
        billWithoutTax = 750;
        tax = 10.0;
        tip = 30;
    }


    // Get tax
    public void findTax(){
        tax = (tax * billWithoutTax) / 100;
        System.out.println("Your Tax is " + tax);
    }

    //method to perform operation to sum all and return the total each person would pay.
    public void amountForEach(){
        double getAmountForEach = (billWithoutTax + tip + tax) / numOfIndividuals;
        System.out.println("Each person pays " + getAmountForEach);
    }

    //main method
    public static void main(String args[]){
        BillToSplit ourBillToSplit = new BillToSplit();

        ourBillToSplit.findTax();
        ourBillToSplit.amountForEach();
    }
    }
