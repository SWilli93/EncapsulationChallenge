public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;

        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }

        this.tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {

        int jobPAges = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPAges;
        return jobPAges;
    }
}
