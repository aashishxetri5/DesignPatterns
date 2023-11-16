/**
 *
 */
package com.practice.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author asus
 */
public class App {
	public static void main(String[] args) {
//		Vehicle car = Vehicle.getVechicle();
//		Vehicle jeep = Vehicle.getVechicle();
//		Vehicle scooter = Vehicle.getVechicle();

		Person employee = Person.getPerson();
		Person student = Person.getPerson();

//		System.out.println("Address of car: " + car.hashCode());
//		System.out.println("Address of jeep: " + jeep.hashCode());
//		System.out.println("Address of scooter: " + scooter.hashCode());

		System.out.println("Address of employee: " + employee.hashCode());
		System.out.println("Address of student: " + student.hashCode());

//		Breaking Singleton using Reflection API
		Person teacher = Person.getPerson();
		System.out.println("Address of Teacher: " + teacher.hashCode());

		try {
			Constructor<Person> person = Person.class.getDeclaredConstructor();

			person.setAccessible(true);

			Person staff1 = person.newInstance();
			System.out.println("Address of staff: " + staff1.hashCode());

			Person staff2 = person.newInstance();
			System.out.println("Address of staff: " + staff2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

		Vehicle taxi = Vehicle.INSTANCE;
		System.out.println("Tractor Address: " + taxi.hashCode());

		Vehicle tractor = Vehicle.INSTANCE;
		System.out.println("Tractor Address: " + tractor.hashCode());

		try {
			Constructor<Vehicle> vehicle = Vehicle.class.getDeclaredConstructor();

			vehicle.setAccessible(true);

			Vehicle car = vehicle.newInstance();
			System.out.println("Address of jeep: " + car.hashCode());

			Vehicle jeep = vehicle.newInstance();
			System.out.println("Address of jeep: " + jeep.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

		Course c = Course.getCourse();
		System.out.println("Hashcode of c: " + c.hashCode());

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
			oos.writeObject(c);

			System.out.println("Serialization Done");

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
			Course c2 = (Course) ois.readObject();

			System.out.println("Hashcode of c2: " + c2.hashCode());

			oos.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}
}
