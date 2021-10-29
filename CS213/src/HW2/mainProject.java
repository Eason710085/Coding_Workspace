package HW2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class mainProject {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Person> people = new ArrayList<>();//The arrayList of the project

    public static void main(String[] args) throws IOException {
        showMenu(); //lunch the menu program
    }

    /**
     * Show the menu to user
     * @throws IOException
     */
    public static void showMenu() throws IOException {
        System.out.println("-----MENU-----\n1. Add a person\n2. Delete a person\n3. Modify a person\n4. Print one person");
        System.out.println("5. Print all people \n6. Write all elements to the text file\n7. BONUS OPTION\n8. Exit");
        System.out.println("Enter your choice(Enter the number): ");
        String choice = scan.nextLine();//let user enter choice
        switch (choice) {
            case "1":
                //add a person
                addPerson();//call addPerson(); method
                break;
            case "2":
                //delete a person
                deletePerson();//call deletePerson(); method
                showMenu();
                break;
            case "3":
                //modify a person
                modifyPerson();//call modifyPerson(); method
                break;
            case "4":
                //print one person
                printOnePerson();//call printOnePerson(); method
                showMenu();
                break;
            case "5":
                //print all people
                printAllPerson();//call printAllPerson(); method
                break;
            case "6":
                //write all elements to the file
                writeToFile();//call writeToFile(); method
                break;
            case "7":
                //bonusOption();
                bonusOption();//call bonusOption(); method
                break;
            default:
                System.exit(8);
        }
    }

    /**
     * add person to address book
     * @throws IOException
     */
    public static void addPerson() throws IOException {
        //let users enter the information of the person which want to add
        System.out.println("First Name: ");
        String firstName = scan.nextLine();
        System.out.println("Last Name: ");
        String lastName = scan.nextLine();
        System.out.println("Street Address: ");
        String address = scan.nextLine();
        System.out.println("State: ");
        String state = scan.nextLine();
        System.out.println("Zip: ");
        int zip = scan.nextInt();
        scan.nextLine();
        System.out.println("Telephone Number: ");
        String telephoneNumber = scan.nextLine();
        //append all these information to Person arrayList
        Person p = new Person(firstName, lastName, address, state, zip, telephoneNumber);
        people.add(p);
        System.out.println("One person Added!");
        showMenu();
    }

    /**
     * delete person from address book
     * @throws IOException
     */
    public static void deletePerson() throws IOException {
        System.out.println("Enter the person's first name to delete:");
        String deleteName = scan.next(); //let user enter the first name of the person
        for (Person value : people) {
            if (value.getFirstName().equals(deleteName))
                people.remove(value);
            System.out.println("You have deleted this person.");
            break;
        }
        showMenu();
    }

    /**
     * modify person from the address book
     * @throws IOException
     */
    public static void modifyPerson() throws IOException {
        System.out.println("Enter the telephone number of the person to modify: ");
        String number = scan.nextLine();//let user enters the telephone number
        for (Person p : people) {
            if (p.getTelephone().equals(number)) {
                System.out.println("Which field you want to modify? (Please Enter the number)");
                System.out.println("1.First Name\n2.LastName\n3.Stress Address\n4.State\n5.Zip\n6.Telephone Number");
                int field = scan.nextInt();
                scan.nextLine();
                switch (field) {
                    case 1:
                        //modify the first name
                        System.out.println("Enter new First Name:");
                        String newFirstName = scan.nextLine();
                        p.setFirstName(newFirstName);
                        System.out.println("First Name modifies successfully");
                        break;
                    case 2:
                        //modify the last name
                        System.out.println("Enter new Last Name:");
                        String newLastName = scan.nextLine();
                        p.setLastName(newLastName);
                        System.out.println("Last Name modifies successfully");
                        break;
                    case 3:
                        //modify the street address
                        System.out.println("Enter new Street Address:");
                        String newStressAdd = scan.nextLine();
                        p.setStreetName(newStressAdd);
                        System.out.println("Street Address modifies successfully");
                        break;
                    case 4:
                        //modify the state
                        System.out.println("Enter new State:");
                        String newState = scan.nextLine();
                        p.setState(newState);
                        System.out.println("State modifies successfully");
                        break;
                    case 5:
                        //modify zip
                        System.out.println("Enter new Zip:");
                        int newZip = scan.nextInt();
                        p.setZip(newZip);
                        break;
                    case 6:
                        //modify telephone number
                        System.out.println("Enter new Telephone number:");
                        String newPhoneNum = scan.nextLine();
                        String newNum = newPhoneNum.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
                        p.setTelephone(newNum);
                        System.out.println("Telephone number modifies successfully");
                        break;
                }
            }
        }
        showMenu();
    }

    /**
     * print one specify person
     * @throws IOException
     */
    public static void printOnePerson() throws IOException {
        System.out.println("Enter the telephone number of the person: ");
        String n = scan.nextLine();
        for (Person p : people) {
            if(p.getTelephone().equals(n))  //get the person from arrayList
                System.out.println("First_Name: " + p.getFirstName() + " Last_Name: " + p.getLastName());
            System.out.println("Stress Address: " + p.getStreetName());
            System.out.println("State: " + p.getState() + "  Zip: " + p.getZip());
            System.out.println("Telephone number: " + p.getTelephone());
        }
        showMenu();
    }

    /**
     * print all person
     * @throws IOException
     */
    public static void printAllPerson() throws IOException {
        for(Person p:people){
            //print all elements in the list
            System.out.println("First_Name Last_Name: "+p.getFirstName()+" "+p.getLastName());
            System.out.println("Street Address: "+p.getStreetName());
            System.out.println("State,Zip: "+p.getState()+" "+p.getZip());
            System.out.println("Telephone number: "+p.getTelephone());
            System.out.println("      ");
        }
        showMenu();
    }

    /**
     * write all person information to the address.txt file
     * @throws IOException
     */
    public static void writeToFile() throws IOException {
        try{
            File file = new File("address.txt");
            FileWriter writer = new FileWriter(file);// the file name is address.txt
            for(Person p: people) {
                String s ="First Name: "+p.getFirstName()+"\n"+"Last Name: "+p.getLastName()
                        +"\n"+"Street Address: "+p.getStreetName()+"\n"+"State: "+p.getState()+"  Zip: "+p.getZip()
                        +"\n"+"Telephone number: "+p.getTelephone()+"\n";
                writer.write(s + System.lineSeparator());
            }
            System.out.println("Successfully write to file.");
            writer.close();//close the file
        }
        catch(Exception e){
            //catch the exception which maybe happen
            System.out.println("Error happens when writing to file");
        }
        showMenu();
    }

    /**
     * bonus option
     * @throws IOException
     */
    public static void bonusOption() throws IOException {
        System.out.println("Which field you want to search for same items: ");
        System.out.println("1.First Name\n2.LastName\n3.Stress Address\n4.State\n5.Zip\n6.Telephone Number");
        int searchField = scan.nextInt();
        scan.nextLine();
        switch (searchField) {
            case 1:
                //print all same first name
                for (Person p : people)
                    if (people.equals(p) == false) {
                        System.out.println(p.getFirstName());
                    }

                break;
            case 2:
                //print all same last name
                for (Person p : people)
                    if (people.equals(p) == false) {
                        System.out.println(p.getLastName());
                    }
                break;
            case 3:
                //print all same street
                for (Person p: people)
                    if (people.equals(p)==false){
                        System.out.println(p.getStreetName());
                    }
                break;
            case 4:
                //print all same state
                for (Person p: people)
                    if (people.equals(p)==false){
                        System.out.println(p.getState());
                    }
                break;
            case 5:
                //print all same zip
                for (Person p:people)
                    if (people.equals(p)==false){
                        System.out.println(p.getZip());
                    }
                break;
            case 6:
                //print all same telephone number
                for (Person p:people)
                    if (people.equals(p)==false){
                        System.out.println(p.getTelephone());
                        break;
                    }

        }
        showMenu();
    }
}