package OrganizationManager.GUI;

import OrganizationManager.DTO.*;

public class Tester {
    public static void main(String[] args) {
        Colony obj1=new BeeColony(2000, "honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        System.out.println("");
        University obj2= new FPTUniversity(100000, "FPT", "Can Tho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        System.out.println("");

        BeeColony obj3= new BeeColony(30, "wasp", "land");
        System.out.println(obj3);
        obj3.createWorker();
        System.out.println("");
        FPTUniversity obj4= new FPTUniversity(10, "FPT", "Hanoi");
        System.out.println(obj4);
        obj4. createWorker ();
    }
}
