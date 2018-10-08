import java.util.Date;

public class ManufacturedEngine implements Engine{
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine(){
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "85 AKI";
    driveTrain = "2WD: Two-Wheel Drive";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake, String engineModel, int engineCylinders, String engineType, String driveTrain){
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }


  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public String toString(){
    String message = "";

    message += "Engine Manufacturer : " + engineManufacturer + '\n';
    message += "Engine Manufactured : " + engineManufacturedDate + '\n';
    message += "Engine Make         : " + engineMake + '\n';
    message += "Engine Model        : " + engineModel + '\n';
    message += "Engine Type         : " + engineType + '\n';
    message += "Engine Cylinders    : " + engineCylinders + '\n';
    message += "Drive Train         : " + driveTrain + '\n';

    return message;
  }
}
