//==========================PRACTICAL 2.1==========================
public class practical2 { // Bio-Data
    public static void main(String[] args) { // Main method
        // Personal information
        String name = "Jayesh Patel";
        int age = 19;
        String gender = "Male";
        String address = "Patan";
        String qualification = "B.tech in Computer Science and Engineering";
        String contactNumber = "9876543210";
        String email = "testing@gmail.com";
        String Date = "01/12/2005";
        String Nationality = "Indian";
        String Religion = "Hindu";
        String Fname = "Rambhai Patel";
        String Mname = "Kavitaben Patel";
        String Lang = "Gujarati, English, Hindi";
        String Hobbies = "Coding, Swimming, Reading, Cricket";
        
        // Educational details
        String College = "Ganpat University";
        String courses = "Big Data Analytics";

        // Print bio-data
        System.out.println("***** Bio-data *****");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Qualification: " + qualification);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email Id: " + email);
        System.out.println("Date Of Birth: " + Date);
        System.out.println("Nationality: " + Nationality);
        System.out.println("Religion: " + Religion);
        System.out.println("Father's Name: " + Fname);
        System.out.println("Mother's Name: " + Mname);
        System.out.println("Languages known: " + Lang);
        System.out.println("Hobbies: " + Hobbies);

        // Print educational background
        System.out.println("***** Educational Background *****");
        System.out.println("College: " + College);
        System.out.println("Courses: " + courses);
    }
}

//==========================PRACTICAL 2.2==========================
import java.util.Scanner; // Import Scanner class for user input

public class BioData1 { // Class definition
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Collect and print bio-data details
        System.out.println("***** Bio-data *****");
        System.out.println("Name: ");
        String name = sc.nextLine(); // Read name
        System.out.println("Age: ");
        int age = sc.nextInt(); // Read age
        sc.nextLine(); // Consume newline
        System.out.println("Gender: ");
        String gen = sc.nextLine(); // Read gender
        System.out.println("Address: ");
        String add = sc.nextLine(); // Read address
        System.out.println("Qualification: ");
        String qualification = sc.nextLine(); // Read qualification
        System.out.println("Mobile Number: ");
        long mobile = sc.nextLong(); // Read mobile number
        sc.nextLine(); // Consume newline
        System.out.println("Email Id: ");
        String email = sc.nextLine(); // Read email
        System.out.println("Date Of Birth: ");
        String date = sc.nextLine(); // Read date of birth
        System.out.println("Nationality: ");
        String nationality = sc.nextLine(); // Read nationality
        System.out.println("Religion: ");
        String religion = sc.nextLine(); // Read religion
        System.out.println("Father's Name: ");
        String fname = sc.nextLine(); // Read father's name
        System.out.println("Mother's Name: ");
        String mname = sc.nextLine(); // Read mother's name
        System.out.println("Languages known: ");
        String lang = sc.nextLine(); // Read languages
        System.out.println("Hobbies: ");
        String hobbies = sc.nextLine(); // Read hobbies

        // Collect and print educational background
        System.out.println("***** Educational Background *****");
        System.out.println("Elementary: ");
        String ele = sc.nextLine(); // Read elementary education
        System.out.println("High School: ");
        String hSchool = sc.nextLine(); // Read high school education
        System.out.println("College: ");
        String college = sc.nextLine(); // Read college education
        System.out.println("Courses: ");
        String courses = sc.nextLine(); // Read courses

        sc.close(); // Close Scanner object
    }
}
