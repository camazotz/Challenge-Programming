
public class LCA {

	public static void main(String[] args) {
		
		Node root = new Node();
		root.createNodes();
		root.left.createNodes();
		root.right.createNodes();
		root.left.left.createNodes();
		root.left.right.createNodes();
		root.data = 13;
		
		root.left.data = 3;
		root.right.data = 14;
		root.left.left.data = 1;
		root.left.right.data = 4;
		root.right.right.data = 18;
		root.left.left.right.data = 2;
		root.left.right.right.data = 12;
		
		Node tmp = lca(root, root.left.left, root.left.right);
		System.out.println(tmp.data);
	}
	
	public static Node lca(Node root, Node n1, Node n2)
	{
		if (root == null) return null;
		
		Node tmp = root;
		while(true)
		{
			if (n1.data < tmp.data)
			{
				if (n2.data > tmp.data)
				{
					return tmp;
				}
				
				tmp = tmp.left;
			}
			
			else
			{
				tmp = tmp.right;
			}
		}
	}

}
