package recursion;

public class Stream {
    public static void main(String[] args) {
        String str="bacapplecdah";
//        String result="";
//        skipp(result,str);
        String s = skippAppNotApple(str);
        System.out.println(s);

    }

//    skip "a" from the string
    static void skipp(String res,String str){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            skipp(res,str.substring(1));
        }else{
            skipp(res+ch,str.substring(1));

        }

    }

//    doing same thing but returning string
    static String skippApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skippApple(str.substring(5));
        }else{
            return str.charAt(0)+skippApple(str.substring(1));
        }

    }

    static String skippAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skippAppNotApple(str.substring(3));
        }else {
            return  str.charAt(0)+skippAppNotApple(str.substring(1));
        }
    }
}
