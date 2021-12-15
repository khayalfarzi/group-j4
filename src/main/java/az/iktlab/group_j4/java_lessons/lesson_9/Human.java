package az.iktlab.group_j4.java_lessons.lesson_9;

 class Human {

    public String name;
    public String surname;

    public Human() {
//        System.out.println(name);
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String surname) {
        Human h = new Human();
        Human h1 = new Human(name);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Human{");
        if (name != null)
            s.append("name='").append(name).append('\'');

        if (surname != null)
            s.append(", surname='").append(surname).append('\'');

        s.append("}");
        return s.toString();
    }
}
