package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        1. Create a textfile (.txt) and fill it with some text content. Tip: you can find random text here.       DONE
//        2. Create a textfile (.txt) and fill it with lines of names.                                              DONE
//        5. In Java create a class called Car with properties like regnumber, brand and model etc...               DONE

public class App {

    public static void main(String[] args) {
        // 1. Testing stringReader
        System.out.println("--- Testing stringReader: ---");
        System.out.println(stringReader(new File("src/randomwords.txt")));

        System.out.println("---------------------------------------");

        // 2. Testing lineReader
        List<String> dragons = lineReader(new File("src/randomdragonnames.txt"));
        System.out.println("--- Testing lineReader: ---");
        dragons.forEach(System.out::println);

        System.out.println("---------------------------------------");

        // 3. In Java create a Collection that contains at least five String objects.
        List<String> fantasyCities = Arrays.asList("Baldur's Gate", "Athkatla", "Neverwinter", "Luskan", "Waterdeep");
        lineWriter(new File("src/main/java/org/example/destination/fantasyCities.txt"), fantasyCities);
        List<String> copy = lineReader(new File("src/main/java/org/example/destination/fantasyCities.txt"));
        System.out.println("--- Testing lineWriter: ---\nOriginal:");
        fantasyCities.forEach(System.out::println);
        System.out.println("\nCopy: ");
        copy.forEach(System.out::println);

        System.out.println("---------------------------------------");

        // 4. Testing streamCopy
        streamCopy(new File("src/main/java/org/example/source/pricken.png"),
                new File("src/main/java/org/example/destination/copy_pricken.png"));
        System.out.println("--- Testing streamCopy: ---");
        if (stringReader(new File("src/main/java/org/example/destination/copy_pricken.png"))
                .contains(stringReader(new File("src/main/java/org/example/source/pricken.png")))) {
            System.out.println("Oh meow god, you managed to copy my cat!");
        } else {
            System.out.println("My cat was too pretty to be copied.");
        }

        System.out.println("---------------------------------------");


    }

    // 1a. In Java create a method that read in a String from file and return the String using FileReader.
    public static String stringReader(File source) {
        StringBuilder readString = new StringBuilder();
        try (FileReader reader = new FileReader(source)) {
            int contents;
            while ((contents = reader.read()) != -1) { // I think the reader reads the binary value of a byte (00000000 - 11111111)
                readString.append((char) contents);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return readString.toString();
    }

    // 2a. In Java create a method that read in the lines into a Collection of your choice using BufferedReader.
    // One line for each element in the Collection.
    public static List<String> lineReader(File source) {
        List<String> returnString = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String readLine;
            while ((readLine = bufferedReader.readLine()) != null) {
                returnString.add(readLine);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return returnString;
    }

    // 3a. Then create a method that write each String object from the collection into a textfile.
    public static void lineWriter(File destination, List<String> data) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            for (String string : data) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // 4. Create a method that can copy a file using both BufferedInputStream and BufferedOutputStream.
    public static void streamCopy(File source, File destination) {
        try (
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) > 0) {
                output.write(buffer, 0, bytesRead);
                output.flush();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


}


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