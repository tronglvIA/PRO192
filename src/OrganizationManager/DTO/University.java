package OrganizationManager.DTO;

public class University extends Organization{
    protected String name;
//---------------------Constructor-----------------------//
    public University(){

    }
    public University(int size, String name) {
        super(size);
        this.name = name;
    }
//-------------------------Method----------------------------//
    public void enroll(){
        System.out.println("The registration for enrollment is only valid " +
                "when the University has received all enrollment documents and enrollment fees");
    }
    public void educate(){
        System.out.println("provide education at university standard");
    }
    @Override
    public void communicateByTool(){
        System.out.println("in " +
                "the university, people communicate by voice”");
    }

    @Override
    public String toString() {
        return "University{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
