package lesson1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author stacie
 */
public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void loadDataFromFiles() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("newstudents.txt");
        BufferedReader breader = new BufferedReader(reader);
        String line = breader.readLine();
        while (line != null) {

            String[] values = line.split(",");
            Student student = new Student();
            student.setId(Integer.parseInt(values[0]));
            student.setName(values[1]);
            student.setMajor(values[2]);
            student.setGpa(Double.parseDouble(values[3]));
            students.add(student);
            line = breader.readLine();
        }
        System.out.println(students.size());

        FileReader r2 = new FileReader("addresses.txt");
        BufferedReader br2 = new BufferedReader(r2);
        line = br2.readLine();
        while (line != null) {
            String[] values = line.split(",");
            Address address = new Address();
            address.setIndex(Integer.parseInt(values[0]));
            address.setCity(values[1]);
            address.setState(values[2]);
            address.setStudentId(Integer.parseInt(values[3]));
            for (Student student : students) {
                if (address.getStudentId() == student.getId()) {
                    student.addAddress(address);
                }
            }
            line = br2.readLine();
        }
    }

    public void javaStudents(){
        Student student = new Student();
        student.setName("Mimi");
        display(student);
    }
    public void display(Student s) {
        System.out.println(s.getName());
    }
    public void display(ArrayList<Student> students) {
        for (Student student : students) {
            String name = student.getName();
            String major = student.getMajor();
            double gpa = student.getGpa();
            System.out.println(name + "," + major + "," + gpa);
            ArrayList<Address> addresses = student.getAddresses();
            if (!addresses.isEmpty()) {
                for (Address address : addresses) {
                    String city = address.getCity();
                    String state = address.getState();
                    System.out.println(city + "," + state);
                }
            }
        }
    }
    public void search() {
        ArrayList<Student> hits = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String criterion = keyboard.nextLine();

        for (Student student : students) {
            String name = student.getName();
            String major = student.getMajor();
            if (name.contains(criterion) || major.contains(criterion))
            hits.add(student);
        }
        this.display(hits);
    }
    public static void main(String[] args) throws IOException {
        StudentManager manager = new StudentManager();
        manager.loadDataFromFiles();
        manager.display(manager.students);
        manager.search();
    }
}