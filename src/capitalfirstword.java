public class capitalfirstword
{
    static String ca(String str)
    {
        String a[] = str.split("\\s");
        String b="";
        for(String r:a){
            String first=r.substring(0,1);
            String afterfirst=r.substring(1);
            b+=first.toUpperCase()+afterfirst+" ";

        }

        b.trim();
        return b;
    }

    public static void main(String[] args) {
        System.out.println(ca("Hello world"));
    }
}
