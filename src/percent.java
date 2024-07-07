public class percent
{
    static void per(String str) {
        int length = str.length();
        int c = 0;
        int s = 0;
        int digit = 0;
        int other = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                c++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                s++;
            } else if (Character.isDigit(str.charAt(i))) {
                digit++;
            } else {
                other++;
            }
        }
        System.out.println("Percent of Capital "+(c*100)/length+"%");
        System.out.println("Percent of Small "+(s*100)/length+"%");
        System.out.println("Percent of other "+(other*100)/length+"%");
        System.out.println("Percent of Digit "+(digit*100)/length+"%");
    }
    public static void main(String[] args) {
        per("Yash12345%");

    }
}
