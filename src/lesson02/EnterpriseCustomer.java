package lesson02;

import java.util.Objects;

public class EnterpriseCustomer extends Customer{
    String customerID;
    String customerName;
    String customerType;
    double amount;
    EnterpriseCustomer(String _customID,String _customName,String _customType,double _amount){
        super(_customID,_customName,_customType);
        this.customerID = _customID;
        this.customerName = _customName;
        this.customerType = _customType;
        this.amount = _amount;
    }

    @Override
    double get_final_amount(double interest, int year) {
        double simpleInterest = this.amount*interest*year;
        double amount = this.amount+simpleInterest;
        amount -= 500;
        if(Objects.equals(this.customerType, "SmallScale")){
            return amount-100;
        }
        else if(Objects.equals(this.customerType, "LargeScale")){
            return amount;
        }

        return amount;

    }
}
