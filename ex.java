public class ex {
    public static boolean palindrome  (int n){
        
        String ch=String.valueOf(n);
        String ch1="";
        for (int i=0;i<ch.length();i++){
            ch1=ch.charAt(i)+ch1;

        }
        if (ch1==ch){
            boolean t=true;
            return t;
        }
        else{
            boolean t=false;
            return t;
        }
    }
     
    }

