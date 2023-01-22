package lesson_11.Computer;

public class MyComputers {
    public static void main(String[] args) {

        Computer [] computers = new Computer[5];

        computers[0] = new Computer(
                12000,
                new GraphicCard(5, "HP"),
                new Chip("Intel", 7, 2),
                new Memory[]
                        {
                                new Memory(400, "Intel"),
                                new Memory(300, "AMD")
                        },
                new SolidDrive("Nvidia", 23)
        );

        computers[1] = new Computer(
                8000,
                new GraphicCard(5, "Apple"),
                new Chip("Apple", 7, 2),
                new Memory[]
                        {
                                new Memory(400, "Apple")
                        },
                new SolidDrive("Apple", 23)
        );
        computers[2] = new Computer(
                12000,
                new GraphicCard(5, "Samsung"),
                new Chip("Intel", 7, 2),
                new Memory[]
                        {
                                new Memory(400, "Intel"),
                                new Memory(300, "AMD")
                        },
                new SolidDrive("Nvidia", 23)
        );
        computers[3] = new Computer(
                12000,
                new GraphicCard(5, "AMD"),
                new Chip("AMD", 7, 2),
                new Memory[]
                        {
                                new Memory(400, "AMD"),
                                new Memory(300, "AMD")
                        },
                new SolidDrive("Nvidia", 23)
        );
        computers[4] = new Computer(
                12000,
                new GraphicCard(5, "Dell"),
                new Chip("AMD", 7, 2),
                new Memory[]
                        {
                                new Memory(300, "AMD")
                        },
                new SolidDrive("Nvidia", 23)
        );

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }

        System.out.println("computers[2].toString() = " + computers[2].toString());
    }
}
