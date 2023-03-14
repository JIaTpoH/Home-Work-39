package Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    List<Food> isCarbonated = new ArrayList<>();
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
