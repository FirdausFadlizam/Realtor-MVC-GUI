import java.util.ArrayList;
import java.util.List;

public class HouseController {

    static int index = -1;
    private House house;
    private List<House> houseList;

    private DetailedView detailedView;

    public HouseController() {
        this.houseList = new ArrayList<House>();
        this.detailedView = new DetailedView();
    }

    public void createNewHouse(){
        house = new House();
    }
    public void setHousePrice(double price){
        house.setPrice(price);
    }

    public void setHouseAddress(String address){
        house.setAddress(address);
    }

    public void setHouseCity(String city){
        house.setCity(city);
    }

    public void setHouseZip(int zip){
        house.setZip(zip);
    }

    public void setHouseYearBuilt(int yearBuilt){
        house.setYearBuilt(yearBuilt);
    }

    public void setHouseProperty(String propertyType){
        house.setPropertyType(propertyType);
    }

    public void setHouseBedrooms(int numOfBedrooms){
        house.setNumOfBedrooms(numOfBedrooms);
    }

    public void addHouse(){
        house.setHouseIndex(++index);
        houseList.add(house);
    }

    public void checkDetailedView(int index){

        for(House i : houseList) {

            if (i.getIndex() == index) {
                detailedView.printHouseDetails(i.getPrice(), i.getAddress(), i.getZip(), i.getCity(), i.getYearBuilt(), i.getPropertyType(), i.getNumOfBedrooms());
            }
        }
    }

    public List<House> searchResult(){

        List<House> houseResult = new ArrayList<>();

        for(House i: houseList){
            double price = i.getPrice();
            String city = i.getCity();
            int zip = i.getZip();
            int yearBuilt = i.getYearBuilt();
            String propertyType = i.getPropertyType();
            int numOfBedrooms = i.getNumOfBedrooms();
            boolean houseMatch = true;

            if(!city.equals(house.getCity()) && house.getCity().isEmpty() == false)
                houseMatch = false;
            if(!propertyType.equals(house.getPropertyType()) && house.getPropertyType().isEmpty() == false)
                houseMatch = false;

            if(houseMatch == true)
            houseResult.add(i);
        }

        return houseResult;
    }

    public List<House> getHouseList(){
        return houseList;
    }

    public void updateHouseInfo(int index){
        for(House i : houseList) {

            if (i.getIndex() == index) {
              i.setPrice(house.getPrice());
              i.setAddress(house.getAddress());
              i.setCity(house.getCity());
              i.setZip(house.getZip());
              i.setPropertyType(house.getPropertyType());
              i.setYearBuilt(house.getYearBuilt());
              i.setNumOfBedrooms(house.getNumOfBedrooms());
            }


        }
    }
}
