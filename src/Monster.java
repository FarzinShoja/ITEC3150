public class Monster {


    private String name;
    private int rank;
    private int age;

    public Monster(String name, int rank, int age) {
        this.name = name;
        this.rank = rank;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + this.name.hashCode();
        hash = 31 * hash + ((Integer) this.age).hashCode();
        hash = 31 * hash * ((Integer) this.rank).hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Monster)) {
            return false;
        }
        Monster m = (Monster) obj;
        return m.getAge() == this.age && m.getName().equals(this.name);
    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}

