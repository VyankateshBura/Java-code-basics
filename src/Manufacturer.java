import java.util.ArrayList;
import java.util.List;

public class Manufacturer implements Cloneable{
    private String manufacturerName;
    private String manufacturerCountry;
    private List<Product> products;

    @Override
    public String toString() {
        StringBuilder productsInfo = new StringBuilder();
        for(Product p:this.products){
            productsInfo.append(" ").append(p.getId()).append(" ").append(p.getName()).append(" ").append(p.getPrice()).append(" hashcode ").append(p.hashCode());
        };
        return "Manufacturer{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", products=" +productsInfo  +
                '}';
    }

    public Manufacturer(String manufacturerName, String manufacturerCountry, List<Product> products) {
        this.manufacturerName = manufacturerName;
        this.manufacturerCountry = manufacturerCountry;
        this.products = products;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Manufacturer clone() throws CloneNotSupportedException {
        //Deep copy
//        Manufacturer manufacturer = (Manufacturer) super.clone();
//        List<Product> products = manufacturer.getProducts();
//        List<Product> cloneProducts = new ArrayList<>();
//        for(Product p:products){
//            cloneProducts.add(p.clone());
//        };
//        manufacturer.setProducts(cloneProducts);

//        return manufacturer;

        //Shallow Copy
        return (Manufacturer) super.clone();
    }
}
