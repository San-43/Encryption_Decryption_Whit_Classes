
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        int temp = p1.age;
        String temp2 = p1.name;

        p1.age = p2.age;
        p2.age = temp;

        p1.name = p2.name;
        p2.name = temp2;

    }
}