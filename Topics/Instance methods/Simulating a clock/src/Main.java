
class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (this.minutes == 59) {

            if (this.hours < 12) {
                this.hours++;
                this.minutes = 0;
            } else if (this.hours == 12) {
                this.hours = 1;
                this.minutes = 0;
            }

        } else {
            this.minutes++;
        }
    }
}