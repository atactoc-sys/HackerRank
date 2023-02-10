import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sollution
{
    static Scanner sc = new Scanner(System.in);
    static Properties prop = new Properties();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(sc.nextLine());
        List<String> events = new ArrayList<>();
        if (totalEvents-- != 0)
        {
            String event = sc.nextLine();
            events.add(event);
        }
        List<Student> students = prop.getStudents(events);
        if (students.isEmpty())
        {
            System.out.println("EMPTY");
        }
        else {
            for (Student st : students){
                System.out.println(st.getName());
            }
        }
    }
}
