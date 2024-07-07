import java.util.Arrays;
public class angram
{
    static boolean Angram(String str1,String str2){
        String s1 = str1.replace("\\s","");
        String s2 = str2.replace("\\s","");
    if(s1.length()!=s2.length()){
        return false;
    }
    else{
        char S1[]=s1.toLowerCase().toCharArray();
        char S2[]=s2.toLowerCase().toCharArray();
        Arrays.sort(S1);
        Arrays.sort(S2);
        if(Arrays.equals(S1,S2)){
        return true;
        }
        else{
            return false;
        }
    }


    }

    public static void main(String[] args) {
        System.out.println(Angram("Keep","Peek"));
    }

}
