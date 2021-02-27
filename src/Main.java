public class Main {
    public static void main(String[] args) {
      Calculator calc = Calculator.instance.get();
      int a = calc.plus.apply(1, 2); //3
      int b = calc.minus.apply(1,1); //0
      int c = calc.devide.apply(a, b);
      // Exception. На 0 делить нельзя. Решение проблемы:
      // Сделать обработку ошибки при ее возникновении с выводом сообщения, что на 0 делить нельзя
      calc.println.accept(c);
    }
}
