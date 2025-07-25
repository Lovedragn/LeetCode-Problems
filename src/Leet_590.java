import java.util.*;

public class Leet_590 {
   public List<Integer> postorder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        dfs(list , root);
        return list;
    }
    public static void dfs(List<Integer> list  ,Node root){
        for(Node s:root.children){
            dfs(list , s);
        }

        list.add(root.val);
    }
    public static void main(String args[]){
        int root = 2; 
    }
}
