public class duplicateString {

    public static void duplicateString(String str, int indx, StringBuilder newStr, boolean map[]){

        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(indx);
        if(map[currChar-'a']==true)
        {
            duplicateString(str, indx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            duplicateString(str, indx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args)
    {
        String str= "parthlotte";
    duplicateString(str,0,new StringBuilder(""),new boolean[26]);

    }
}
