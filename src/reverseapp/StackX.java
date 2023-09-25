/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverseapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: ReverseApps.
 */
class StackX {

    private int maxSize;
    private Person[] stackArray;
    private int top;

    public StackX(int max) {
        maxSize = max;
        stackArray = new Person[maxSize];
        top = -1;
    }

    public void push(Person person) {
        stackArray[++top] = person;
    }

    public Person pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
