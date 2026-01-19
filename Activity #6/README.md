This Java program demonstrates important Object-Oriented Programming (OOP) concepts, including abstraction, inheritance, polymorphism, and the use of collections. The abstract Device class represents a general electronic device and defines common behaviors such as turning devices on or off and displaying their details. Specific device classes inherit from this abstract class and implement their own unique properties and behaviors.

The program includes several device types, such as AirConditioner, LampShade, Television, and MicrowaveOven. Each device class contains attributes specific to its function (for example, temperature, brightness, channel, or timer) and overrides the details() method to display customized information. The LampShade class also demonstrates the use of a copy constructor to create duplicate objects.

In the main program, all device objects are stored in a list and managed using the DeviceHelper class. This helper class provides functionality to turn all devices on or off simultaneously and to count how many devices are currently powered on.

Overall, this program helps students understand how abstract classes, method overriding, polymorphism, and collections work together in a simple smart-home device simulation.
