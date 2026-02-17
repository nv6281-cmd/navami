/**
 * OOPSBannerApp UC4 - OOPS Banner using String Array and Loop
 */
public class OOPSBannerAppUC4 {

    public static void main(String[] args) {
        // Store each line of the banner in an array
        String[] banner = {
            String.join("   ", " *** ", " *** ", "***** ", " ****"),
            String.join("  ", "** **", "** **", "** **", "** "),
            String.join("  ", "** **", "** **", "** **", "** "),
            String.join("  ", "** **", "** **", "******", " *** "),
            String.join("  ", "** **", "** **", "** ", "    **"),
            String.join("  ", "** **", "** **", "** ", "    **"),
            String.join("   ", " *** ", " *** ", "** ", "**** ")
        };

        // Print each line using a loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}