import java.util.*;

class Address implements Comparable<Address> {

    private final String city;
    private final String street;
    private final String house;


    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public Address(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "%s, %s, %s".formatted(house, street, city);
    }

    @Override
    public int compareTo(Address otherAddress) {
        return Comparator.comparing(Address::getHouse)
                .thenComparing(Address::getStreet)
                .thenComparing(Address::getCity)
                .compare(this, otherAddress);
    }
}

// do not change the code below
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Address> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] arguments = sc.nextLine().split(",");
            list.add(new Address(arguments[0], arguments[1], arguments[2]));
        }
        Collections.sort(list);
        Checker.check(list);
    }
}