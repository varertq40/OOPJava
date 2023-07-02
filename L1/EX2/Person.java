package L1.EX2;

public class Person {
/*  
Модификатор доступа private: закрытый класс или член
класса. Доступен только из кода в том же классе.
*/
	private String fullName;
	private int age;
	private boolean retired;

	@Override
	public String toString() {
		return "Person{"
						+ "fullName'" + fullName + '\''
						+ ", age" + age
						+ ". retired=" + retired
						+ '}';
	}

/*  */
	// public static
}
