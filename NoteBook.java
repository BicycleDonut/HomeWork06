import java.util.Objects;

public class NoteBook {

    private int ram;
    private int hdd;
    private String os;
    private String colour;

    public NoteBook(int ram, int hdd, String os, String colour) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Ноутбук <" +
                "Оперативка: " + ram +
                ", Жестяк: " + hdd +
                ", Операционка: '" + os + '\'' +
                ", Цвет: '" + colour + '\'' +
                '>';
    }

    @Override
    public boolean equals(Object o) {
        if (!( o instanceof NoteBook))
            return false;
        else
            return Objects.equals(((NoteBook) o).ram, ram) &&Objects.equals(((NoteBook) o).hdd, hdd) && Objects.equals(((NoteBook) o).os, os) && Objects.equals(((NoteBook) o).colour, colour);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

