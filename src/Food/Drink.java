package Food;

public class Drink extends Food {
  String isCarbonated;
  String isAlcoholic;

  public Drink(String name, int calories,String isCarbonated, String isAlcoholic) {
    super(name, calories);
    this.isCarbonated = isCarbonated;
    this.isAlcoholic = isAlcoholic;
  }

  public String isCarbonated() {
    return isCarbonated;
  }

  public String isAlcoholic() {
    return isAlcoholic;
  }

  public void setCarbonated(String isCarbonated) {
    this.isCarbonated = String.valueOf(isCarbonated);
  }

  public void setAlcoholic(String isAlcoholic) {
    this.isAlcoholic = String.valueOf(isAlcoholic);
  }
}
