import java.util.*;

public class PuzzleMain {

    public static void main(String[] args) {
        
        if(args.length == 0) {
            System.out.println("Usage:");
            System.out.println("java PuzzleMain IMGS [-v]");
            System.out.println("    IMGS:    directory to look for .png puzzle pieces");
            System.out.println("    -v:      verbose if flag is present");
        } else {
            //TODO: check for valid directory here
            if(args.length == 2) {
                //TOOD: check for valid flag
            } else if(args.length > 2) {
                //TODO: warn unrecongnized flags
            }
        }

    }

}
