/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: ReverseApps.
 */
public class ReverseApp {

    public static void main(String[] args) {
        Person[] persons = {
            new Person("Hung", 10),
            new Person("Cong", 15),
            new Person("Le", 20),
            new Person("LOVE", 23),
            new Person("Tram", 25),
            new Person("My", 30),
            new Person("Duong", 35),
            new Person("Au", 40)
        };

        Reverser reverser = new Reverser(persons);
        Person[] reversedPersons = reverser.doRev();

        System.out.println("Reversed Persons:");
        for (Person person : reversedPersons) {
            System.out.println(person);
        }
    }
}
