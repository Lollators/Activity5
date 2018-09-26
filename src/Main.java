import java.sql.SQLOutput;

public class Main {

  public static void main(String[] args) {

    //  Write a static main method that creates two objects,
    // one with the default constructor and the other with the
    //  constructor with parameters.  Give sample
    //  data for the parameters
    VehicleChassis myVc = new VehicleChassis();
    myVc.setChassisType("chazzz");
    System.out.println(myVc.toString());
    System.out.println(myVc.getChassisType());
    VehicleChassis myVc2 = new VehicleChassis("chas");
    System.out.println(myVc2.toString());
  }
}
