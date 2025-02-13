package employment;


public class Employment{
    public static void main(String[] args) {

        //create somr of the managers
        Manager M1 = new Manager("fi", "li", "ab@c.com",1, "Associate_Director");
        System.out.println("Manager 1 info:");
        M1.getinfo();
        System.out.println();

        Manager M2 = new Manager("f2", "l2", "12@3.com",2, "Prject Lead");
        System.out.println("Manager 2 info");
        M2.getinfo();
        System.out.println();
        

        SDE_intern sde = new SDE_intern("qwerty", "qwerty", "qwerty@a.com", 3);
        System.out.println("Intern1 info:");
        sde.getinfo();
        System.out.println();

        Cloud_intern cde = new Cloud_intern("asdf", "asdf", "asdf@b.com", 4);
        System.out.println("Intern2 info");
        cde.getinfo();

        //I want this part to be called automatically after creating the above classes
        GlobalData.getInstance().add_cde(cde);
        GlobalData.getInstance().add_sde(sde);

        M1.acceptProject(1001, "Backend Trainig");
        M2.acceptProject(2001, "Frontend Training");

        M1.cloud_availability();
        M2.sde_availability();

        sde.appointed_to(M2);
        cde.appointed_to(M1);
        
        sde.assign_work(M2, 201, "Create basic CRUD API");

        //here we will try to give feedback to the person by the manager who is not authorized
        sde.feedback(M1, "Bad work");

        sde.feedback(M2, "Great Work!");

    }

    
}