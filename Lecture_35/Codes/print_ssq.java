public class print_ssq {
    static void PrintSSQ(String s, String currentANS) { // abc

        if (s.length() == 0) {
            System.out.println(currentANS);
            return;
        }

        char curr = s.charAt(0);// c
        String remString = s.substring(1);// bc

        // Curr cherecter-->choose to be a part of current ans
        PrintSSQ(remString, currentANS + curr);// bc,a

        // curr cherecter-->does not choose to be a part current ans
        PrintSSQ(remString, currentANS);// bc," "
    }

    public static void main(String[] args) {
        PrintSSQ("abc", "");
    }
}
