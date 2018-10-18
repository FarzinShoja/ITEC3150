import java.util.Scanner;
import java.util.TreeSet;

public class Hero implements Comparable<Hero> {
    private String name;
    private int age;
    private String home;


    public Hero(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        TreeSet<Hero> heros = new TreeSet<>();
//          ---- Create Loop for UserInput & Use the Word "quite" to Exit Out of The Loop
        while (true) {
            System.out.println("Please Enter The Name of The Hero:");
            String name = keyboard.nextLine();
            System.out.println("Please Enter The Age of The Hero:");
            String age = keyboard.nextLine();
            System.out.println("Please Enter The Home-Town of The Hero:");
            String home = keyboard.nextLine();

//           ------- User Input is being added to tree set -------
            Hero h1 = new Hero(name, Integer.parseInt(age), home);
            heros.add(h1);
            System.out.println("Currently, We Have:" + heros);

            System.out.println("Type quit to End || Enter to Continue");
            String input = keyboard.nextLine();
            if (input.startsWith("quit")) break;
        }
        keyboard.close();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Hero)) {
            return false;
        }
        Hero h = (Hero) obj;
        return h.getAge() == this.age && h.getName().equals(this.name) && h.getHome().equals(this.name);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + this.name.hashCode();
        hash = 31 * hash * this.home.hashCode();
        hash = 31 * hash + ((Integer) this.age).hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", home='" + home + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public int compareTo(Hero o) {
        return this.age - o.getAge();
    }
}
