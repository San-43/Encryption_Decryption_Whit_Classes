import java.util.*;

class Rating implements Comparable<Rating> {
    private int upVotes;
    private int downVotes;

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    @Override
    public int compareTo(Rating rating) {
        if ((upVotes - downVotes) == (rating.upVotes - rating.downVotes)) {
            return 0;
        } else if ((upVotes - downVotes) < (rating.upVotes - rating.downVotes)) {
            return -1;
        } else {
            return 1;
        }

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Rating> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            int[] votes = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Rating rating = createRating(votes[0], votes[1]);
            list.add(rating);
        }
        Collections.sort(list);
        Checker.check(list);
    }

    private static Rating createRating(int up, int down) {
        Rating rating = new Rating();
        rating.setUpVotes(up);
        rating.setDownVotes(down);
        return rating;
    }
}