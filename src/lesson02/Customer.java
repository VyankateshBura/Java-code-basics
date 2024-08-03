package lesson02;

public abstract class Customer {
    String customerID;
    String customerName;
    String customerType;

    Customer(String _customerID,String _customerName,String _customerType){
        this.customerID = _customerID;
        this.customerName = _customerName;
        this.customerType = _customerType;
    }
    void showCustomerDetails(){
        System.out.println("Customer ID: "+this.customerID);
        System.out.println("Customer Name: "+this.customerName);
        System.out.println("Customer Type: "+this.customerType);
    }

    abstract double get_final_amount(double interest,int year);
}
