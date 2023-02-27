import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Produkt> list;
    int maxValue;

    VendingMachine() {
        list = new ArrayList<>();
        maxValue = 3;
    }

    public void putProdukt(String produkt, double coast, String type) {
        if (list.size() < maxValue) {
            Produkt pr = new Produkt(produkt, coast, maxValue, type);
            list.add(pr);
        } else {
            System.out.println("Автомат полон");
        }
    }

    public void getStatus() {
        if (list.isEmpty()) {
            System.out.println("Автомат пустой");
            return;
        }
        for (Produkt pr : list) {
            System.out.printf("Имя продукта - %s, Цена продукта - %.2f\n", pr.getName(), pr.getPrice());
        }
    }

    public void getProdukt(String nameProdukt) {
        if (list.isEmpty()) {
            System.out.println("Автомат пустой, купить нечего");
            return;
        }
        int check = checkProdukt(nameProdukt);
        if (check == -1) {
            System.out.println("Товар отсутствует");
        } else {
            System.out.println("Автомат выдает товар " + nameProdukt);
            list.remove(check);
        }
    }

    private int checkProdukt(String nameProdukt) {
        int i = 0;
        for (Produkt pr : list) {
            if (pr.getName().equals(nameProdukt)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public Produkt getProduktByName(String name) throws Exception {
        for (Produkt produkt : list) {
            if (produkt.getName().equals(name)) {
                return produkt;
            }
        }
        throw new Exception("Нет такого продукта");
    }

    public Produkt getProduktByCost(double price) throws Exception {
        for (Produkt produkt : list) {
            if (produkt.getPrice() == price) {
                return produkt;
            }
        }
        throw new Exception("Нет такого продукта");
    }
}