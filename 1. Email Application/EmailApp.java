package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Doe");
        System.out.println(em1.display());
        em1.setAlternateEmail("arfin97@gmail.com");
        System.out.println(em1.getAlternateEmail());
    }
}
