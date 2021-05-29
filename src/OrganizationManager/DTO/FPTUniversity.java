package OrganizationManager.DTO;

public class FPTUniversity extends University implements Role{
    public String address;
//------------------Constructor----------------------//
    public FPTUniversity() {
    }

    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }
//-------------------getters and setters-------------------------//

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//---------------------method---------------------//


    @Override
    public String toString() {
        return "FPTUniversity{" +
                "address='" + address + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void createWorker(){
        System.out.println("providing human resources");
    }
}
