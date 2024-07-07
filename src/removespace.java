public class removespace {
    static void spa(String str){
       String s = str.replaceAll("\\s","");
        System.out.print(s);
    }

    public static void main(String[] args) {
        spa("Y    a    fff  gg");
    }
}
