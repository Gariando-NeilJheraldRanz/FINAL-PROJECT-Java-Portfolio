This Java program simulates a simple online ordering system using Object-Oriented Programming (OOP) concepts such as abstraction, inheritance, interfaces, and packages. The abstract Order class represents a generic order and contains common details such as the order ID, amount, and status. It also defines shared methods for processing an order and displaying an order summary.

The OnlineOrder class extends the Order class and implements the Payable interface, allowing online orders to be both processed and paid. The Payable interface ensures that any implementing class provides a payment method. The program also uses an OrderStatus enum to represent the different states of an order, including pending, paid, shipped, and cancelled.

In the main application, multiple online order objects are created and stored in a list. Each order is processed and paid, then displayed using an iterator. Orders that are cancelled are removed from the list, and the remaining active orders are displayed at the end.

This program helps students understand how abstract classes, interfaces, enums, and collections work together in a practical online shopping scenario.
