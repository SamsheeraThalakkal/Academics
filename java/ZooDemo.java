class Zoo {
    String name;
    String[] encl;

    public Zoo(String name, String[] encl) {
        this.name = name;
        this.encl = encl;

    }

    public void display() {
        System.out.println("Zoo Name: " + name);
        for (String i : encl) {
            System.out.println("Enclosure: " + i);
        }
    }

    class Enclosure {
        String name;
        String[] animals;
        String type;

        public Enclosure(String name, String type, String[] animals) {
            this.name = name;
            this.type = type;
            this.animals = animals;

        }

        public void displayEnclosure() {
            System.out.println("Enclosure Name: " + name);
            System.out.println("Type: " + type);
            for (String x : animals) {
                System.out.println("Animals: " + x);
            }
        }
    }

    static class ZooInfo {
        String addr, phone;

        public ZooInfo(String a, String p) {
            addr = a;
            phone = p;
        }

        public void displayInfo() {
            System.out.println("Address: " + addr);
            System.out.println("phone Number: " + phone);
        }
    }
}

public class ZooDemo {
    public static void main(String[] args) {
        String enclosure[] = { "Area1", "Area2", "Area3" };
        String animals[] = { "Zebra", "Giraffe" };
        Zoo z = new Zoo("TVM Zoo", enclosure);
        Zoo.Enclosure en = z.new Enclosure("Grassland", "outdoor", animals);
        Zoo.ZooInfo info = new Zoo.ZooInfo("ABC", "7902678943");
        z.display();
        en.displayEnclosure();
        info.displayInfo();
    }
}
