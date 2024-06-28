package leetcode;

public class _1108_IP {
    public static void main(String[] args) {
        String s="1.1.1.1";
        System.out.println(defangIPaddr(s));
    }
    public static String defangIPaddr(String address) {

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
