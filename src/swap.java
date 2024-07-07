public class swap {
    static void a(String f,String g)
    {
        System.out.println(f+" "+g);
        f=f+g;
        g=f.substring(0,f.length()-g.length());
        f=f.substring(g.length());
        System.out.println(f+" "+g);
    }

    public static void main(String[] args) {
        a("Hello","World");
    }
}
