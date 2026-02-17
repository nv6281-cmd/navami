/**
 * OOPSBannerApp UC3 - OOPS Banner Application
 * Using String.join() for memory efficiency.
 */
public class OOPSBannerAppUC3 {

    public static void main(String[] args) {
        // Each line joins the parts for letters O, O, P, and S
        
        // Row 1
        System.out.println(String.join("   ", " *** ", " *** ", "***** ", " ****"));
        
        // Row 2
        System.out.println(String.join("  ", "** **", "** **", "** **", "** "));
        
        // Row 3
        System.out.println(String.join("  ", "** **", "** **", "** **", "** "));
        
        // Row 4 (Middle of P and S)
        System.out.println(String.join("  ", "** **", "** **", "******", " *** "));
        
        // Row 5
        System.out.println(String.join("  ", "** **", "** **", "** ", "    **"));
        
        // Row 6
        System.out.println(String.join("  ", "** **", "** **", "** ", "    **"));
        
        // Row 7
        System.out.println(String.join("   ", " *** ", " *** ", "** ", "**** "));
    }
}