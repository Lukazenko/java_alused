public class part2_ex6 {
    public static void main(String[] args) {
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));


        PromissoryNote artoNote = new PromissoryNote();
        artoNote.setLoan("Arto", 51.5);
        artoNote.setLoan("Arto", 10.5);

        System.out.println(artoNote.howMuchIsTheDebt("Arto"));
    }
}
