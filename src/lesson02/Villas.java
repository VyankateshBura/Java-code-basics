package lesson02;

public class Villas extends HouseArchitecture{
    @Override
    float getPrice() {
        return 2000000;
    }

    @Override
    String getLoanBank() {
        return "ICICI,HDFC,Bank of Baroda";
    }
}
