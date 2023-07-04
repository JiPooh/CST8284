/*
 * file name: Invoice.java
 * Original author is the professor who've designed this lab.
 * student name: JiHoo Park
 * student number: 041081334
 * Course: CST8284 314
 * assignment: lab06
 * due date: Mar. 31st, 2023
 * purpose: to test my knowledge on abstract classes, interface, inheritance and polymorphism
 * class list: Payme.java, Invoice.java, Programmer.java, HourlyProgrammer.java, 
 * SalariedProgrammer.java, CommissionProgrammer.java, BasePlusCommissionProgrammer.java, 
 * PaymeInterfaceTest.java, PaymeInterfaceTest2.java
 */


//LAB 6 - CST8284
//LAB 6: Invoice.java

//This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass

//The Invoice class implements Payme interface. NO MODIFICATION IS REQUIRED HERE!!!

/**
 * Invoice class, which uses interface Payme
 * @author JiHoo Park (Edited slightly)
 *
 */
public class Invoice implements Payme {
/**
 * ID number of the part being ordered
 */
private String partNumber; 
/**
 * name of the part being ordered
 */
private String partDescription;
/**
 * number of parts being ordered
 */
private int quantity;
/**
 * price of the parts being ordered per item
 */
private double pricePerItem;


/**
 * Four-argument constructor
 * @param part Part number (ID number of the part being ordered)
 * @param description Part description (number of parts being ordered)
 * @param count Quantity (number of parts being ordered)
 * @param price Price per item (price of the parts being ordered per item)
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}


/**
 * sets part number
 * @param part part number (ID number of the part being ordered)
 */
public void setPartNumber(String part) {
 partNumber = part; 
}


/**
 * get part number
 * @return partNumber ID number of the part being ordered
 */
public String getPartNumber() {
 return partNumber;
}


/**
 * set part description
 * @param description Part description (number of parts being ordered)
 */
public void setPartDescription(String description) {
 partDescription = description; 
}


/**
 * get part description
 * @return partDescription name of the part being ordered
 */
public String getPartDescription() {
 return partDescription;
}


/**
 * set quantity of part
 * @param count Quantity (number of parts being ordered)
 */
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}


/**
 * get quantity of part
 * @return getQuantity number of parts being ordered
 */
public int getQuantity() {
 return quantity;
}


/**
 * set price per item
 * @param price Price per item (price of the parts being ordered per item)
 */
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}


/**
 * get price per item
 * @return pricePerItem price of the parts being ordered per item
 */
public double getPricePerItem() {
 return pricePerItem;
}


/**
 * overriding the toString method from Payme interface make a 
 * String to represent Invoice object
 */
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %,d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem())
		 + String.format("%npayment due: $%,.2f%n", getPaymentAmount()); //this line was added
} 


/**
 * overriding the getPaymentAmount method from payme interface
 * to get the amount buyer needs to pay
 */
@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}
}


