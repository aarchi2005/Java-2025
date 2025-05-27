public class count {
    public static void main(String[] args) {
        String str ="aaaabbbbcc";
        StringBuilder newStr =new StringBuilder();
        int count =1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count ++;

            }
            else
            newStr.append(str.charAt(i-1)).append(count);//jave does not support multiple inheritance
            count=1;

        }
    }
}
