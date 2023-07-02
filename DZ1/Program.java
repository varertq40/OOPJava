/* Нужно создать несколько классов животных:
1. Пес (Собака)
2. Кот (Кошка)
3. ... придумать еще парочку

Каждое животное имеет: (поля)
1. Имя (кличка)
2. Возраст
3. ... придумать еще какие-то параметры

Каждое животное может: (методы)
1. Подавать голос
2. Питаться (съедает какое-то количество еды, переданное в метод)
3. Двигаться
4. ... все, что сумеете придумать

Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.

Придумать свою структуру с наследованием по аналогии с животными и банковскими счетами. */

public class Program{
    public static void main(String[] args) {
         
        Person tom = new Person(); // создание объекта
        tom.displayInfo();
         
        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
    }
}
class Person{
     
    String name;    // имя
    int age;        // возраст
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

// public class Pets {
//     public static void main(String[] args) {

// 			Dog tom = new Dog();
// 			tom.displayInfo();

// 			tom.name = "Tom";
// 			tom.age = 3;
// 			tom.displayInfo();
//     }
// 		class Dog {

// 			String name;
// 			int age; 
// 			void displayInfo() {
// 				System.out.printf("Name: %s\tAge: %d\n", name, age);
// 			}

// 		}

		// class Horse {
		// 	String name;
		// 	int age;
		// 	void displeyInfo() {
		// 		System.out.printf("Name: %s\tAge: %d\n", name, age);
		// 	}
			
		// }

		// class Parrot {
		// 	String name;
		// 	int age;
		// 	void displayInfo() {
		// 		System.out.printf("Name: %s\tAge: %d\n", name, age);
		// 	}
		// }
