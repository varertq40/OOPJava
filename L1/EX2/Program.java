// Описание логики.
package L1.EX2;

public class Program {
	static double distance(int x1, int x2, int y1, int y2) {
// Четыре аргумента.
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
// Метод принимающий две точки. Следущий уровень абстракции. Есть 2 точки, а у точки есть х,у.
	static double distance(Point2D a, Point2D b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}
	
	public static void main(String[] args) {
// Создание экземпляра класса.
		Point2D a = new Point2D();
		a.x = 2;
		a.y = 0;
/*Для того чтобы узнать содержимое обьекта, в классе
object языка Java определен метод toString(), возвращающий 
символьную строку описывающую метод. При создании нового 
класса принято переопределение toString() таким образом, 
чтобы возвращаяющая строка содержала в себе имя класса, 
имена и значение всех переменных. Person.
*/		
	System.out.println(a.toString());
	}
}
