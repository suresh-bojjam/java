package hackers;

import java.util.Scanner;

class BSTNode{
	public BSTNode getLeft() {
		return left;
	}
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	public BSTNode getRight() {
		return right;
	}
	public void setRight(BSTNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	BSTNode left,right;
	int data;
	BSTNode(int data){
		this.data=data;
		left=right=null;
	}
}

public class BST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		BSTNode root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}

		//levelOrder(root);
		//inorder(root);
		//System.out.println();
		//preorder(root);
		//System.out.println();
		//postorder(root);
		//printLevelAt(root,3);
		levelOrder(root);
	}
	
	private static int height(BSTNode node) {
		if(node==null)return 0;
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
	private static void levelOrder(BSTNode root) {
		int n=height(root);
		System.out.println("height: "+n);
		for(int i=1;n>=i;i++) {
			printLevelAt(root,i);
		}
	}
	
	private static void printLevelAt(BSTNode root,int level) {
		if(root!=null) {
			if(level==1) {
				System.out.println(root.data);
			}else if(level>1) {
				printLevelAt(root.left,level-1);
				printLevelAt(root.right,level-1);
			}
		}
	}
	
	private static void inorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
	
	private static void postorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            inorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }
	
	private static void preorder(BSTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            inorder(r.getLeft());
            inorder(r.getRight());
        }
    }
	/* Function to insert data recursively */
    private static BSTNode insert(BSTNode node, int data)
    {
        if (node == null)
            node = new BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
}