package l01.etutorial5punkt0;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Person adressBook [] = new Person[30];
        int count = 0;

        try {
            String fileName = "src/l01/etutorial5punkt0/personen.txt";
            FileReader fileReader = new FileReader(fileName, StandardCharsets.UTF_8);

            File file = new File(fileName);
            long fileLength = file.length();

            char charArray [] = new char[(int)fileLength];
            fileReader.read(charArray);
            String string = new String(charArray);
            String splitString [] = string.split(";|\\.|\n");
            for (int i=0; i < splitString.length; i+=9) {
                GregorianCalendar tempBirthday = new GregorianCalendar(
                        Integer.parseInt(String.valueOf(splitString[i+8])),
                        Integer.parseInt(String.valueOf(splitString[i+7]))-1,
                        Integer.parseInt(String.valueOf(splitString[i+6]))
                        );
                Person tempPerson = new Person(
                        splitString[i+1],
                        splitString[i],
                        splitString[i+2],
                        Integer.parseInt(splitString[i+3]),
                        Integer.parseInt(splitString[i+4]),
                        splitString[i+5],
                        tempBirthday
                        );
                adressBook[count++] = tempPerson;
            }
        }
        catch (IOException e) {
            System.err.println("Error reading the file.");
            System.err.println(e.getMessage());
        }

        for (int person = 0; person < count; person++) {
            adressBook[person].print();
        }
    }
}
