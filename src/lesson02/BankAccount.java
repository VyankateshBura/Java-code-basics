package lesson02;

public class BankAccount {

    public static void main(String args[]){

        RegularCustomer regularCustomer1 = new RegularCustomer("C12421","Mahesh","Domestic",1000);
        RegularCustomer regularCustomer2 = new RegularCustomer("C12422","Manish","Business",1000);

        EnterpriseCustomer enterpriseCustomer1 = new EnterpriseCustomer("E12421","Vyankatesh","SmallScale",1000);
        EnterpriseCustomer enterpriseCustomer2 = new EnterpriseCustomer("E12422","Omkar","BigScale",1000);

        regularCustomer1.showCustomerDetails();
        System.out.println("Final amount :"+regularCustomer1.get_final_amount(5,8));
        regularCustomer2.showCustomerDetails();
        System.out.println("Final amount :"+regularCustomer2.get_final_amount(5,8));
        enterpriseCustomer1.showCustomerDetails();
        System.out.println("Final amount :"+enterpriseCustomer1.get_final_amount(5,8));
        enterpriseCustomer2.showCustomerDetails();
        System.out.println("Final amount :"+enterpriseCustomer2.get_final_amount(5,8));

    }
}
