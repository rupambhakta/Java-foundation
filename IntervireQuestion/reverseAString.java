public class reverseAString {
    public static void main(String[] args) {
        String str = "Nexucon";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Original String : " + str);
        System.out.println("Reverse String :" + sb);
    }
}
