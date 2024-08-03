package lesson02;

public class Apartments extends HouseArchitecture{
    @Override
    float getPrice() {
        return 800000;
    }

    @Override
    String getLoanBank() {
        return "ICICI,SBI,Andhra Bank,Bank of Baroda, HDFC BANK";
    }
}
