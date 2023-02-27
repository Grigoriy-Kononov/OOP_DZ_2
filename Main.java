public class Main {
    public static void main(String[] args) throws Exception {

        VendingMachine vMachine = new VendingMachine();

        vMachine.putProdukt("Mars", 100.5, "Chokolate");
        vMachine.putProdukt("Cola", 89.5, "Gas water");
        vMachine.putProdukt("Аленка", 150.5, "Chokolate");

        vMachine.getStatus();

        vMachine.getProdukt("Cola");

        vMachine.getStatus();

        try {
            System.out.println(vMachine.getProduktByName("Mars"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(vMachine.getProduktByCost(150.5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
