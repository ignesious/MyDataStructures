package tree;

//

// ctrl shift / is commenting block comment uncommenting \

// just ctrl / comment ctrl \ is uncomment.

class TreeNode {
    int val;
   TreeNode left;
   TreeNode right;
    TreeNode(int x) { val = x; left =null ; right =null; }
}
 

public class TreeOne {
 TreeNode root;
 TreeNode first;
 TreeNode second;
	
 
 public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i)
{
// Base case for recursion
if (i < arr.length) {
TreeNode temp = new TreeNode(arr[i]);
root = temp;

// insert left child
root.left = insertLevelOrder(arr, root.left,
      2 * i + 1);

// insert right child
root.right = insertLevelOrder(arr, root.right,
        2 * i + 2);
}
return root;
}
 

 
 
 public  void printBinaryTree(TreeNode root, int level){
	    if(root==null)
	         return;
	    printBinaryTree(root.right, level+1);
	    if(level!=0){
	        for(int i=0;i<level-1;i++)
	            System.out.print("|\t");
	            System.out.println("|-------"+root.val);
	    }
	    else
	        System.out.println(root.val);
	    printBinaryTree(root.left, level+1);
	}  
 
 
 public void inOrder(TreeNode root)
 {
	 if(root == null)
		 return;
	 
	 inOrder(root.left);
	 System.out.print(root.val);
	 inOrder(root.right);
 }
 
 public void preOrder(TreeNode root)
 {
	 if(root == null)
		 return;
	 System.out.print(root.val);
	 preOrder(root.left);
	 preOrder(root.right);
 }
 
 public void postOrder(TreeNode root)
 {
	 if(root == null)
		 return;
	
	 postOrder(root.left);
	 postOrder(root.right);
	 System.out.print(root.val);
 }
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeOne treeObj  = new TreeOne();
        int arr[] = {-1,0,0,1,1,3,5};
		
		/*		treeObj.root   = new TreeNode(5);	
	    treeObj.first  = new TreeNode(4);
	   treeObj.second  = new TreeNode(8);
	    treeObj.root.left = treeObj.first;
	    treeObj.root.right = treeObj.second;*/
	 treeObj.root = treeObj.insertLevelOrder(arr, treeObj.root, 0);
    //    treeObj.root = treeObj.createTree(arr, arr.length);
      treeObj.printBinaryTree(treeObj.root, 0);
       treeObj.inOrder(treeObj.root);
       System.out.println();
       treeObj.preOrder(treeObj.root);
       System.out.println();
       treeObj.postOrder(treeObj.root);	
	}

}
