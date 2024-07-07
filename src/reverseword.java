public class reverseword
{
    static String re(String str)
    {

        String a[]=str.split("\\s");
        String b="";
        for(String c:a){
            StringBuilder e = new StringBuilder(c);
            e.reverse();
            b+=e.toString()+" ";
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(re("Hello World"));
    }
}
