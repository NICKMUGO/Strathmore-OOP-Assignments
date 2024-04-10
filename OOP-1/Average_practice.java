public class Average_practice extends Exam_practice {
    public double average;

    public Average_practice(int mark1, int mark2) {
        super(mark1, mark2);
    }

    public double calculateAverage() {
        this.average = (mark1 + mark2) / 2.0;
        return average;
    }
}