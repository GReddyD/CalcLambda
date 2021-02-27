import java.util.function.*;

public class Calculator {
	//Возращаем экземпляр калькултора
	static Supplier<Calculator> instance = Calculator::new;

	//Простые мат операции +, -, *, /
	BinaryOperator<Integer> plus = (x, y) -> x + y;
	BinaryOperator<Integer> minus = (x, y) -> x - y;
	BinaryOperator<Integer> multiply = (x, y) -> x * y;
	BinaryOperator<Integer> devide = (x, y) -> {
		int devResult = 0;
		try {
			devResult = x / y;
		} catch (ArithmeticException e) {
			System.err.println("На 0 делить нельзя");
		}
		return devResult;
	};

	//Возведение в квадрат
	UnaryOperator<Integer> pow = x -> x * x;
	//Возращаем обсолютную величену
	UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

	//Проверка на положительное число
	Predicate<Integer> isPositive = x -> x > 0;

	//Печать для пользователя
	Consumer<Integer> println = System.out::println;
}
