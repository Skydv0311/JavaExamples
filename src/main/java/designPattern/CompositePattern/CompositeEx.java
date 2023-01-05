package designPattern.CompositePattern;

public class CompositeEx {
    public static void main(String[] args) {
        Component hd = new Leaf(4000, "Hard Drive");
        Component mouse = new Leaf(500, "Mouse");
        Component ram = new Leaf(2000, "Ram");
        Component monitor = new Leaf(6000, "Monitor");
        Component cpu = new Leaf(5000, "CPU");

        Composite ph = new Composite("Pheri");
        Composite mb = new Composite("mb");
        Composite cabinet = new Composite("cabinet");
        Composite computer = new Composite("Computer");

        mb.addComponent(ram);
        mb.addComponent(cpu);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        mb.showPrice();
    }
}
