import java.util.Scanner;
class Cpu {
    int price;

    public Cpu(Scanner sc) {
        System.out.println("Enter price");
        price = sc.nextInt();
    }

    class Processor {
        int cores;
        String manufacture;

        public Processor(Scanner sc) {

            System.out.println("Enter no of cores");
            cores = sc.nextInt();
            System.out.println("Enter the manufacturer");
            manufacture = sc.next();

        }

        public void ShowProcessor() {
            System.out.println("->cores=" + cores + "\n->manufacture=" + manufacture + "\n->price=" + price);
        }
    }

    static class Ram {
        int memory;
        String man;

        public Ram(Scanner sc) {

            System.out.println("Enter the amount of memory");
            memory = sc.nextInt();
            System.out.println("Enter the Ram manufacturer");
            man = sc.next();

        }

        public void ShowRam() {
            System.out.println("->memory= " + memory + "\n->Ram manufacturer=" + man);
        }
    }
}

public class CpuDemo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
         Cpu c = new Cpu(sc);
        Cpu.Processor p = c.new Processor(sc);
        Cpu.Ram r = new Cpu.Ram(sc);
        System.out.println("\nDetails\n**********\n");
        p.ShowProcessor();
        r.ShowRam();
        }
        catch (Exception e){
            System.out.println("Error");
        }  
        
    }
}