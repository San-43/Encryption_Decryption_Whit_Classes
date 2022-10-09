
class Complex {

    double real;
    double image;

    // write methods here

    public void add(Complex other) {
        this.real += other.real;
        this.image += other.image;
    }

    public void subtract(Complex other) {
        this.real -= other.real;
        this.image -= other.image;
    }
}