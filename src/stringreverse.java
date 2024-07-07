public class stringreverse
{
    static String reverse(String str){
        char ch[]=str.toCharArray();
        String r="";
        for(int i=ch.length-1;i>=0;i--){
            r+=ch[i];
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Yash Thakur"));
    }
}
