public class VehicleFrame implements Chassis{

  private String vehicleFrameType;

  public VehicleFrame(){
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType){
    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public String toString(){
    String message = "";
    message += "Chassis              : " + Chassis.chassis + '\n';
    message += "Vehicle Frame        : " + vehicleFrameType + '\n';
    return message;
  }
}
