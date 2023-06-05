public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getTotalPaper(){
        return paper;
    }

    public void printCopies(int copies){
        if(paper >= copies) {
            paper -= copies;
            toner -= copies;
    }}

    public int getTotalToner(){
        return toner;
    }
}
