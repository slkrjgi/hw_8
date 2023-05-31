public class Main {

    public static void main(String[] args) {

    Printable[] literature = new Printable[] {
            new Book("Sherlock Holmes novels"),
            new Book("Alice in Wonderland"),
            new Book("Fahrenheit 451"),
            new Magazine("Times"),
            new Magazine("VOGUE"),
            new Magazine("The New Yorker")
        };

        for (int i = 0; i < literature.length; i++) {
            literature[i].print();
        }

        System.out.println("\nMagazines only:");
        Magazine.printMagazines(literature);
        System.out.println("\nBooks only:");
        Book.printBooks(literature);


    }

}