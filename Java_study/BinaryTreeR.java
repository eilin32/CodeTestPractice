package Java_study;
/**
 * binary tree 순회 3가지 방법
 * Inorder
 * Preorder
 * Postorder
 */

 class Node{
	 int data;
	 Node left;
	 Node right;
 }
 class Tree{
	 public Node root;

	 public void setRoot(Node node){
		 this.root = node;
	 }
	 public Node getRoot(){
		 return root;
	 }
	 public Node makeNode(Node left, int data, Node right){
		 Node node = new Node();
		 node.data = data;
		 node.left = left;
		 node.right = right;
		 return node;
	 }

	 //inorder(왼쪽, 자신, 오른쪽) 순회
	 public void inorder(Node node){
		 if(node != null){
			 inorder(node.left);
			 System.out.print(node.data);
			 inorder(node.right);
		 }
	 }
	  //preorder(자신, 왼쪽, 오른쪽) 순회
	 public void preorder(Node node){
		if(node != null){
			System.out.print(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	 }
	  //postorder(왼쪽, 오른쪽, 자신) 순회
	 public void postorder(Node node){
		if(node != null){
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data);
		}
	 }

 }
public class BinaryTreeR {
	public static void main(String[] args) {
		Tree t = new Tree();
		Node n4 = t.makeNode(null, 4, null);
		Node n5 = t.makeNode(null, 5, null);
		Node n2 = t.makeNode(n4, 2, n5);
		Node n3 = t.makeNode(null, 3, null);
		Node n1 = t.makeNode(n2, 1, n3);

		t.setRoot(n1);
		t.inorder(t.getRoot()); // 42513
		System.out.println();
		t.preorder(t.getRoot()); // 12453
		System.out.println();
		t.postorder(t.getRoot()); // 45231
	}
}
