
import java.util.Date;

public class Main {

  public static void main(String[] args) {

    VehicleChassis myVc = new VehicleChassis();
    myVc.setChassisType("chazzz");
    System.out.println(myVc.toString());
    System.out.println(myVc.getChassisType());
    VehicleChassis myVc2 = new VehicleChassis("chas");
    System.out.println(myVc2.toString());

    ManufacturedEngine m1 = new ManufacturedEngine();
    ManufacturedEngine m2 = new ManufacturedEngine("Honda",new Date(),"H-Series","H23A1",4,"88 AKI","2ED: Two-Wheel Drive");

    System.out.println(m1.toString());
    System.out.println(m2.toString());

    InteriorFeature i1 = new InteriorFeature();
    InteriorFeature i2 = new InteriorFeature("Climate Control");

    System.out.println(i1.toString());
    System.out.println(i2.toString());

    ExteriorFeature e1 = new ExteriorFeature();
    ExteriorFeature e2 = new ExteriorFeature("Fog Lamps");

    System.out.println(e1.toString());
    System.out.println(e2.toString());
  }
}
