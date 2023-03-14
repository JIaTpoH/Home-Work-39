package Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

  public void open() throws IOException {
    if (isCarbonated) {
      System.out.println("Пшш!");
    } else {
      System.out.println("Скр.");
    }
    if (isAlcoholic) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Введите ваш возраст:");
      int age = Integer.parseInt(br.readLine());
      if (age >= 18) {
        System.out.println("Буль-буль-буль!");
      } else {
        System.out.println("Этот напиток только для совершеннолетних.");
      }
    }
  }
}
