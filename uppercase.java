public class uppercase {
    public static String touppercase(String str){
        StringBuilder sb =new StringBuilder("");
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="hi i am tan";
        System.out.println("original string is "+str);
        System.out.println("\nstring after converting into upper case");
        System.out.print(touppercase(str)+"\n");
    }
}
