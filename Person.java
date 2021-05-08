
public class Person {
    String id,gender;
    double tChol, hdl;

    public Person(String id, String gender, double tChol, double hdl){
        this.id = id;
        this.gender = gender;
        this.tChol = tChol;
        this.hdl = hdl;
    }

    public double getCholesterolRatio(){
        return tChol/hdl;
    }

    public boolean hasGoodTotalCholesterol(){
        if(tChol<200)
            return true;
        return false;
    }

    public boolean hasGoodHDL() {
        if (gender.equalsIgnoreCase("male")) {
            if(hdl >= 40)
                return true;
            return false;
        }
        if (gender.equalsIgnoreCase("female"))
            if(hdl >= 45)
                return true;
        return false;
    }

    public boolean hasGoodCholesterolRatio(){
        if((tChol/hdl)<=4.5)
            return true;
        return  false;
    }

    public void printReport(){
        System.out.println(id+"'s Report:");


        if(hasGoodTotalCholesterol())
            System.out.println("Total Cholesterol : " + tChol + " (good)");
        else
            System.out.println("Total Cholesterol : " + tChol + " (bad)");


        if(hasGoodHDL())
            System.out.println("HDL : " + hdl + " (good) ");
        else
            System.out.println("HDL : " + hdl + " (bad) ");


        if(hasGoodCholesterolRatio())
            System.out.println("TC/HDL Ratio : " + (tChol/hdl) + " (good) ");
        else
            System.out.println("TC/HDL Ratio : " + (tChol/hdl) + " (bad) ");

    }

    public static void main(String[] args) {

        Person person1 = new Person("0022212345","male",156,30);
        Person person2 = new Person("0022212345","female",156,30);
        person1.printReport();
        System.out.println("__________________________________");
        person2.printReport();

        System.out.println(person1.hasGoodTotalCholesterol());

    }

}


