import java.util.TreeSet;

public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        TreeSet<Student> studs = new TreeSet<>();

        Student lisa = new Student(2, "lisa p");
        Student bob = new Student(1, "bob lutz");


        studs.add(bob);
        studs.add(lisa);
        System.out.println(studs);
        System.out.println("zebra".compareTo("alpha"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.getId();
    }

}
