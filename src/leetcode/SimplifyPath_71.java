package leetcode;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class SimplifyPath_71 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
    public static String simplifyPath(String path) {
        StringBuilder sb=new StringBuilder();
        Stack<String> sk=new Stack<>();
        String[] sp=path.split("/+");
        for(String ch: sp){
                if(!sk.isEmpty() && "..".equals(ch)){
                    sk.pop();
                } else if (!Arrays.asList(".","/","..").contains(ch)) {
                    sk.push(ch);
                }
        }
        for(String s:sk){
            if(Objects.equals(s, "")){
                continue;
            }
            sb.append("/").append(s);
        }

        return sb.isEmpty() ? "/" : sb.toString();
    }
}
