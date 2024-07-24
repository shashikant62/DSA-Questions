class Ac{
    public static int ans(String a){
        if(a.length()<4){
            return 0;
        }
        if(Character.isDigit(a.charAt(0))){
            return 0;
        }
        boolean digit=false;
        boolean upper=false;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(a.charAt(i)=='/' || a.charAt(i)==' '){
                return 0;
            }
            if(Character.isUpperCase(c)){
                upper=true;
            }
            if(Character.isDigit(c)){
                digit=true;
            }
        }
        // System.out.println(upperocout+" "+num);
        if(upper==true && digit==true){
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        System.out.print(ans("1A1_67"));
    }
}