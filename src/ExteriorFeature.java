public class ExteriorFeature implements Feature {
  private String exteriorFeature;

  public ExteriorFeature(){
    exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature){
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String getFeature() {
    return exteriorFeature;
  }

  @Override
  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  public String toString(){
    return "Exterior " + exteriorFeature;
  }
}
