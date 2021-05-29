package OrganizationManager.DTO;

public class BeeColony extends Colony implements Role {
    public String type;
//----------------------Constructor-----------------------//

    public BeeColony( ){

    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

//-----------------------getters and setters----------------------//

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//--------------------------method-------------------------------//


    @Override
    public String toString() {
        return "BeeColony{" +
                "type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", size=" + size +
                '}';
    }
    @Override
    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }
}
