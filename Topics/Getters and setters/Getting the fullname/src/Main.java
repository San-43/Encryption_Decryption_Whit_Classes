
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {

        if (firstName != null && !"".equals(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {


        if (lastName != null && !"".equals(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        boolean isLastName;
        boolean isFirstName;

        if (this.lastName != null) {
            isLastName = "".equals(this.lastName);
        } else {
            isLastName = true;
        }

        if (this.firstName != null) {
            isFirstName = "".equals(this.firstName);
        } else {
            isFirstName = true;
        }

        if (isFirstName  && isLastName) {
            return "Unknown";
        } else if (isFirstName) {
            return this.lastName;
        } else if (isLastName) {
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}