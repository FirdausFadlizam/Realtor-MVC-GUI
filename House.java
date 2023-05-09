public class House {


    private int indexPos;
    private double price;
    private String address;
    private String city;
    private int zip;
    private int yearBuilt;
    private String propertyType;
    private int numOfBedrooms;

    public void setPrice(double price){
        this.price = price;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setZip(int zip){
        this.zip = zip;
    }

    public void setYearBuilt(int yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    public void setPropertyType(String propertyType){
        this.propertyType = propertyType;
    }

    public void setNumOfBedrooms(int numOfBedrooms){
        this.numOfBedrooms = numOfBedrooms;
    }

    public double getPrice(){
        return price;
    }

    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }

    public int getZip(){
        return zip;
    }

    public int getYearBuilt(){
        return yearBuilt;
    }

    public String getPropertyType(){
        return propertyType;
    }

    public int getNumOfBedrooms(){
        return numOfBedrooms;
    }

    public void setHouseIndex(int index){
        indexPos = index;
    }

    public int getIndex(){
        return indexPos;
    }
}
