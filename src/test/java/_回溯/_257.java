package _回溯;

import java.util.ArrayList;
import java.util.List;

public class _257 {
    //回溯
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
         traversal(root,"", res);
         return res;
    }
    void  traversal(TreeNode root, String path, List<String> res) {
        if(root != null) {
            StringBuffer pathSB = new StringBuffer();
            pathSB.append(root.val);
            if( root.left == null && root.right == null) {
                res.add(pathSB.toString());
            }
            else {
                pathSB.append("->");
                traversal(root.left, pathSB.toString(), res);
                traversal(root.right, pathSB.toString(),res);
            }
        }

    }

}
