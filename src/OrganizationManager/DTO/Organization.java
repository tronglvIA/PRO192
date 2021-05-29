package OrganizationManager.DTO;

abstract public class Organization {
    protected int size;
//---------------Begin Constructor-------------//
    public Organization(){

    }

    public Organization(int size) {
        this.size = size;
    }
//------------------End Constructor-------------//

//-------------------Method--------------------//
    public abstract void communicateByTool();

    @Override
    public String toString() {
        return "The Organization{" +
                "size is" + size +
                '}';
    }
//---------------------End method------------------//

//-------------------Getters and setters----------------//
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
