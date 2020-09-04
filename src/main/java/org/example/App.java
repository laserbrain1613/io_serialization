package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

    }
}


//1. Create a textfile (.txt) and fill it with some text content. Tip: you can find random text here.
//        a. In Java create a method that read in a String from file and return the String using
//        FileReader.
//        2. Create a textfile (.txt) and fill it with lines of names.
//        a. In Java create a method that read in the lines into a Collection of your choice using
//        BufferedReader. One line for each element in the Collection.
//        3. In Java create a Collection that contains at least five String objects.
//        a. Then create a method that write each String object from the collection into a textfile.
//        4. Create a method that can copy a file using both BufferedInputStream and
//        BufferedOutputStream.
//        5. In Java create a class called Car with properties like regnumber, brand and model etc... The
//        Car class must implement Serializable. To also fulfil the contract make a default constructor.
//        a. Create a List of Cars and add some objects into it.
//        b. Save the List of Cars to a file using ObjectOutputStream.
//        c. Read the List of Cars from file using ObjectInputStream.
//        6. Make a small program called car_register.
//        a. Create models Car and Owner.
//        b. Car should have fields: carId, regNumber, brand, model, regDate and owner. It
//        should also implement Serializable together with a default constructor.
//        c. Owner should have fields: ownerId, name, birthdate. Owner also need to implement
//        Serializable and have a default contructor.
//        d. Create two collections, one for Cars and the other for Owners.
//        e. Create functionality to serialize the collections to JSON files.
//        f. Create functionality to deserialize the JSON files to it’s resepective Collection.