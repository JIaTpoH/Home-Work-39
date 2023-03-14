package Food;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    // Создаем экземпляр класса Food
    Food apple = new Food("Яблоко", 52);

    // Вызываем метод eat()
    apple.consume();

    // Создаем экземпляр класса Drink
    Drink beer = new Drink("Пиво", 150, true, true);

    // Вызываем метод open()
    beer.open();
  }
}

