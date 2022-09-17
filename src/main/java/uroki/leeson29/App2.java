package uroki.leeson29;

public class App2 {
    public static void main(String[] args) {
        {
            SimpleCollection<Person> persons = new SimpleCollection<>(0);
            Person person1 = new Person("Вася", 30);
            persons.pushBack(person1);
            persons.pushBack(new Person("Тимофей", 21));
            persons.pushBack(new Person("Лариса", 42));
            persons.pushBack(new Person("Фродо", 83));
            persons.pushBack(new Person("Гендальф", 1142));
            persons.pushBack(new Person("Пипин", 40));
            printCollection(persons);
            class PersonCmp implements SimpleCollection.Comparator<Person> {

                @Override
                public int convert(Person value) {
                    return -value.getAge();
                }
            }

            PersonCmp cmp = new PersonCmp();
            Person min = persons.findMin(cmp);

//            Person min = persons.get(0);
//            for (int i = 0; i < persons.getSize(); i++) {
//                Person one = persons.get(i);
//                if (one.getAge() < min.getAge()) {
//                    min = one;
//                }
//            }
            System.out.println(min.toString());
        }

        SimpleCollection<Integer> number = new SimpleCollection<>(0);

        number.pushBack(21);
        number.pushBack(43);
        number.pushBack(56);
        number.pushBack(16);
        number.pushBack(22);

        printCollection(number);

        Integer min = number.get(0);
        for (int i = 1; i < number.getSize(); i++) {
            Integer one = number.get(i);
            if (one < min) {
                min = one;
            }
        }
        System.out.println(min.toString());
    }

    static <T> void printCollection(SimpleCollection<T> list) {
        System.out.println("<begin>");
        // вывод обычных элементов
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("  " + i + ": " + list.get(i));
        }

        if (list.getCapacity() > 0) {
            // вывод того, что лежит в коллекции за пределами размера
            System.out.println("  <capacity>");
            for (int i = list.getSize(); i < list.getCapacity(); i++) {
                System.out.println("    " + i + ": " + list.get(i));
            }
            System.out.println("  </capacity>");
        }
        System.out.println("<end>\n");
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
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

        @Override
        public String toString() {
            return "name " + getName() + ", age " + getAge();
        }
    }
}
