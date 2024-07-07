public class palindrome
{
    static boolean pal(String str){
        char ch[]=str.toCharArray();
        String b = "";
        for(int i=ch.length-1;i>=0;i--){
            b+=ch[i];
        }
        b.toString();
        if(str.equalsIgnoreCase(b)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(pal("jigin"));
    }
}
