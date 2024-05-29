package Maths;
public class NonRepeated {
    
    public static void main(String[] args) {
        String str= "AAabsbbdbbbbbbsbbszxyqwuio";
        String str2= str.toLowerCase();
        for(int i=0; i<str2.length(); i++){
            boolean b= true;
            for(int j=0; j<str2.length(); j++){
                if(i!= j && str2.charAt(i) == str2.charAt(j))
                    b=false;
    }
    if(b){
       System.out.print(" " + str2.charAt(i));
    //    break; to print first occurance
    }    
}
}
}
