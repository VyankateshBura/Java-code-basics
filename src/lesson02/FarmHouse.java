package lesson02;

public class FarmHouse extends HouseArchitecture{
    @Override
    float getPrice() {
        return 10000000;
    }

    @Override
    String getLoanBank() {
        return "Andhra Bank,SBI";
    }
}
