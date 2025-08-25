package day10;

public class ArrayofObjectsDemo {

	public static void main(String[] args) {

		Student[] arr;
		arr = new Student[5];
		arr[0] = new Student(1, "Puvirajan");
		arr[1] = new Student(2, "suresh");
		arr[2] = new Student(3, "dhoni");
		arr[3] = new Student(4, "Ashwin");
		arr[4] = new Student(5, "Pathirana");
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());

	}

}