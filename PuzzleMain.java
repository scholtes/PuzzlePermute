import java.util.*;
import java.io.File;

public class PuzzleMain {

    public static void main(String[] args) {
        boolean verbose = false;
        File imgs;
        
        // Print help if no args provided
        if(args.length == 0) {
            System.out.println("Usage:");
            System.out.println("java PuzzleMain IMGS [-v]");
            System.out.println("    IMGS:    directory to look for .png puzzle pieces");
            System.out.println("    -v:      verbose if flag is present");
        } else {
            //Check for valid directory here.  If not valid, then return
            imgs = new File(args[0]);
            if(!(imgs.exists() && imgs.isDirectory())) {
                System.out.println("The path provided is not a valid directory");
                return;
            } 
            //Check verbosity
            if(args.length == 2) {
                if(!args[1].equals("-v")) {
                    // Return if unrecognized flags
                    System.out.println("Unrecognized flag \"" + args[1] + "\"... run with no params for help");
                    return;
                } else {
                    verbose = true;
                    System.out.println("Running verbose...");
                }
            } else if(args.length > 2) {
                // Return if too many flags
                System.out.println("Too many flags detected... run with no params for help");
                return;
            }

        }

    }

}
