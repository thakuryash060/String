public class rotation {
    static boolean rot(String s1,String s2){
        if(s1.length()!=s2.length()){
           return false;
        }
        String s3 = s1+s1;
        if(s3.contains(s2)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(rot("nitin","nniti"));
    }
}
