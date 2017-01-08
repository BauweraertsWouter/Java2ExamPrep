package quarto;

/**
 * Hier mag je niets wijzigen.
 */
public final class QuartoBlock {
    public enum Length {TALL, SHORT}
    public enum Color {DARK, LIGHT}
    public enum Shape {SQUARE, CIRCULAR}
    public enum Volume {HOLLOW, SOLID}

    private final Length length;
    private final Color color;
    private final Shape shape;
    private final Volume volume;

    QuartoBlock(Length length, Color color, Shape shape, Volume volume) {
        this.length = length;
        this.color = color;
        this.shape = shape;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        QuartoBlock that = (QuartoBlock) object;

        return color == that.color && length == that.length && shape == that.shape && volume == that.volume;

    }

    @Override
    public int hashCode() {
        int result = length != null ? length.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "a " + length + ", " + color + ", " + shape + ", " + volume + " Quarto block";
    }

}