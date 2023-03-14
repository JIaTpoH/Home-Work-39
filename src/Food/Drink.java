package Food;



public class Drink extends Food {
  private boolean isCarbonated;
  private boolean isAlcoholic;

  public Drink(String name, int calories, boolean isCarbonated, boolean isAlcoholic) {
    super(name, calories);
    this.isCarbonated = isCarbonated;
    this.isAlcoholic = isAlcoholic;
  }

  public boolean isCarbonated() {
    return isCarbonated;
  }

  public boolean isAlcoholic() {
    return isAlcoholic;
  }

  public void setCarbonated(boolean isCarbonated) {
    this.isCarbonated = isCarbonated;
  }

  public void setAlcoholic(boolean isAlcoholic) {
    this.isAlcoholic = isAlcoholic;
  }
}
