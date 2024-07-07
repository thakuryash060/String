public class toggle
{
    static String tog(String str)
    {
        String b[]=str.split("\\s");
        String a="";
        for(String h:b){
            String first=h.substring(0,1);
            String af=h.substring(1);
            a+=first + af.toUpperCase()+" ";
        }
        return a.trim();
    }

    public static void main(String[] args) {
        System.out.println(tog("hello world"));
    }
}
