package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        String str="abc";
//        subset("",str);
        List<String> strings = subSetRe("", str);
        System.out.println(strings.toString());

    }

//    find all possible sub set of the string

    static void subset(String result,String str){
        if(str.isEmpty()){
            System.out.println(result);
            return;
        }

        char ch=str.charAt(0);
        subset(result,str.substring(1));
        subset(result+ch,str.substring(1));
    }

    static List<String> subSetRe(String result,String str){
        if(str.isEmpty()){
            ArrayList<String> res=new ArrayList<>();
            res.add(result);
            return  res;
        }

        char ch=str.charAt(0);
        List<String> strings = subSetRe(result, str.substring(1));
        List<String> strings1 = subSetRe(result + ch, str.substring(1));
        strings.addAll(strings1);
        return strings;
    }
}
