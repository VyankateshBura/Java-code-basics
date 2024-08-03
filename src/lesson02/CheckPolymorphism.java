package lesson02;

public class CheckPolymorphism {
    public static void main(String args[]){
        HouseArchitecture ha;

        ha = new Villas();
        System.out.println("The average price of Villas is : "+ha.getPrice());
        System.out.println("Banks who can provide loan are: "+ha.getLoanBank());

        ha = new FarmHouse();
        System.out.println("The average price of FarmHouse is : "+ha.getPrice());
        System.out.println("Banks who can provide loan are: "+ha.getLoanBank());

        ha = new Apartments();
        System.out.println("The average price of Apartments is : "+ha.getPrice());
        System.out.println("Banks who can provide loan are: "+ha.getLoanBank());
    }
}
