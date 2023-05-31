public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                printable[i].print();
            }
        }
    }
}
