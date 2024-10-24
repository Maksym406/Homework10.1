   package app;

    public class Main {
        public static void main(String[] args) {

            Person person1 = new Person("Олексій", 30, "Інженер");
            Person person2 = new Person("Анна", 25, "Дизайнер");
            Person person3 = new Person("Марія", 40, "Вчитель");

            person1.printInfo();
            person2.printInfo();
            person3.printInfo();

            person3.setProfession("Менеджер");
            System.out.println("Оновлена інформація про Марію:");
            person3.printInfo();
        }
    }

