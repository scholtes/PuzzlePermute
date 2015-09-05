import java.util.*;

public class PuzzleMain {

    public static void main(String[] args) {
        boolean verbose = false;
        
        if(args.length == 0) {
            System.out.println("Usage:");
            System.out.println("java PuzzleMain IMGS [-v]");
            System.out.println("    IMGS:    directory to look for .png puzzle pieces");
            System.out.println("    -v:      verbose if flag is present");
        } else {
            //TODO: check for valid directory here
            
            if(args.length == 2) {
                if(!args[1].equals("-v")) {
                    System.out.println("Unrecognized flag \"" + args[1] + "\"... run with no params for help");
                    return;
                } else {
                    verbose = true;
                    System.out.println("Running verbose...");
                }
            } else if(args.length > 2) {
                System.out.println("Too many flags detected... run with no params for help");
                return;
            }

        }

    }

}
