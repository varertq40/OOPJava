// стихийно-процедурный подход
package L1.EX1;

/*модификатор доступа public(публичный) общедоступный
класс или член класса. Поля и методы, выдны другим 
классам из текщего пакета и из внешних пакетов.
*/
public class PointMethod {
	static double distance(int x1, int x2, int y1, int y2) {
		// метод Math.sqrt возведение в квадрат
		// метод Math.pow возведение первого аргумента в степень второго
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static void main(String[] args) {
		int ax = 0;
		int ay = 0;
		int bx = 0;
		int by = 1;
		// кординаты, переменные
		System.out.println(distance(ax, ay, bx, by));
	}
}
// Для перехода в ООП нужно выделить сущность точка(EX2)