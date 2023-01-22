package lesson_11.Computer;

import java.util.Arrays;

public class Computer {

    private double price;
    private GraphicCard graphicCard;
    private Chip chip;
    private Memory [] memory;
    private SolidDrive solidDrive;

    public Computer(double price, GraphicCard graphicCard, Chip chip, Memory[] memory, SolidDrive solidDrive) {
        this.price = price;
        this.graphicCard = graphicCard;
        this.chip = chip;
        this.memory = memory;
        this.solidDrive = solidDrive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public Memory[] getMemory() {
        return memory;
    }

    public void setMemory(Memory[] memory) {
        this.memory = memory;
    }

    public SolidDrive getSolidDrive() {
        return solidDrive;
    }

    public void setSolidDrive(SolidDrive solidDrive) {
        this.solidDrive = solidDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", graphicCard=" + graphicCard +
                ", chip=" + chip +
                ", memory=" + Arrays.toString(memory) +
                ", solidDrive=" + solidDrive +
                '}';
    }
}
