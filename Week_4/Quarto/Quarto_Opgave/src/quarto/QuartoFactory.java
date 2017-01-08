package quarto;

import quarto.QuartoBlock.Color;
import quarto.QuartoBlock.Length;
import quarto.QuartoBlock.Shape;
import quarto.QuartoBlock.Volume;

import java.util.HashSet;
import java.util.Set;

/**
 * Werk uit volgens de instructies.
 */

public final class QuartoFactory {

    private static Set<QuartoBlock> createdBlocks = new HashSet<>();
    private static int counter = 0;

    private QuartoFactory() {
        throw new UnsupportedOperationException("This class can't be instantiated");
    }

    public static QuartoBlock createBlock(Length length, Color color, Shape shape, Volume volume) {
        QuartoBlock newBlock = new QuartoBlock(length, color, shape, volume);
        for (QuartoBlock qb : createdBlocks) {
            if (qb.equals(newBlock)) {
                return qb;
            }
        }
        createdBlocks.add(newBlock);
        counter++;
        return newBlock;
    }

    public static int countBlocks() {
        return counter;
    }

    public static String getProductionOverview() {
        StringBuilder sb = new StringBuilder();
        int i = 1;

        sb.append(String.format("%s Quarto blocks created:\n", countBlocks()));

        for (QuartoBlock b : createdBlocks) {
            sb.append(String.format("%d) %s\n", i++, b.toString()));
        }

        return sb.toString();
    }
}

