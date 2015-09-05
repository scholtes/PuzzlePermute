import java.io.File;

public class Puzzle {

    /**
    * Constructor.
    *
    * @param directory (required) directory containing puzzle piece blueprints.
    * @param verbosity (required) true to print steps while solving, false for silence.
    *
    */

    private File directory;
    private boolean verbosity;

    public Puzzle(File directory, boolean verbosity) {
        this.directory = directory;
        this.verbosity = verbosity;
        this.loadBlueprints();
    }

    //TODO: implement
    public String getExpandedSolution() { return "<expanded solution>"; }

    //TODO: implement
    public String getCompressedSolution() { return "<compressed solution>"; }

    //TOOD: implement
    private void loadBlueprints() {}
}