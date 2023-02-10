import java.util.*;

import static java.util.Comparator.*;

public class Properties
{
    //Student stud = new Student();

    private PriorityQueue<Student> queue;// to compare sort student according to cgpa,name,id

    {
        queue = new PriorityQueue<>(comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName).thenComparing(Student::getId));
    }
    // sorting in reverse comparing all the student attributes

    public List<Student> getStudents(List<String> events)// orderdlist to store sorted student
    {
        // iterateing
        for ( String event : events ) {
            if (Objects.equals(event, "SERVED"))// condition to check that if student need to be removed or not from start
            {
                queue.poll();// to remove
            } else {
                String[] std = event.split(" ");
                queue.add(new Student(Integer.parseInt(std[3]), std[1], Double.parseDouble(std[2])));
                // to insert into 
            }
        }

        List<Student> students = new ArrayList<>();
        if (queue.isEmpty())// to check if queue is empty
        {
            return students;
           // if condition satisfies return students list
        }
        students.add(queue.poll());
        // add rempved students fom ehe queue into student list
        return students;
        //returns the students list
    }
}
