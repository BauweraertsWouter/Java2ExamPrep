import quarto.QuartoBlock;
import quarto.QuartoFactory;

/**
 * Test uit met deze klasse.
 * Vergelijk met de gewenste afdruk onderaan.
 */
public class TestQuarto {
    public static void main(String[] args) {
        QuartoBlock b1 = QuartoFactory.createBlock(
                QuartoBlock.Length.SHORT,
                QuartoBlock.Color.DARK,
                QuartoBlock.Shape.CIRCULAR,
                QuartoBlock.Volume.HOLLOW);

        QuartoBlock b2 = QuartoFactory.createBlock(
                QuartoBlock.Length.SHORT,
                QuartoBlock.Color.LIGHT,
                QuartoBlock.Shape.CIRCULAR,
                QuartoBlock.Volume.SOLID);

        QuartoBlock b3 = QuartoFactory.createBlock(
                QuartoBlock.Length.SHORT,
                QuartoBlock.Color.DARK,
                QuartoBlock.Shape.CIRCULAR,
                QuartoBlock.Volume.HOLLOW);

        QuartoBlock b4 = QuartoFactory.createBlock(
                QuartoBlock.Length.TALL,
                QuartoBlock.Color.DARK,
                QuartoBlock.Shape.SQUARE,
                QuartoBlock.Volume.HOLLOW);

        QuartoBlock b5 = QuartoFactory.createBlock(
                QuartoBlock.Length.TALL,
                QuartoBlock.Color.DARK,
                QuartoBlock.Shape.CIRCULAR,
                QuartoBlock.Volume.HOLLOW);

        System.out.println("b1 == b3: " + (b1 == b3));
        System.out.println(QuartoFactory.getProductionOverview());
    }
}

/* GEWENSTE AFDRUK:

b1 == b3: true
4 Quarto blocks created:
1) a SHORT, LIGHT, CIRCULAR, SOLID Quarto block
2) a TALL, DARK, SQUARE, HOLLOW Quarto block
3) a TALL, DARK, CIRCULAR, HOLLOW Quarto block
4) a SHORT, DARK, CIRCULAR, HOLLOW Quarto block

*/
