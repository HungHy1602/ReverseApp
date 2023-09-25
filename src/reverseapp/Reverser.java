/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverseapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: ReverseApps.
 */
class Reverser {

    private Person[] input;
    private Person[] output;

    public Reverser(Person[] input) {
        this.input = input;
    }

    public Person[] doRev() {
        int stackSize = input.length;
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < input.length; j++) {
            theStack.push(input[j]);
        }

        output = new Person[stackSize];
        int index = 0;
        while (!theStack.isEmpty()) {
            output[index++] = theStack.pop();
        }
        return output;
    }
}
