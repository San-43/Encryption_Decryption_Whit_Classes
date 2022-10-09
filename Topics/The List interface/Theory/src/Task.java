// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    Person person = new Person("Test Dummy", -4);
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    System.out.println(this);
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "name=" + name + ", age=" + age;
  }
}
