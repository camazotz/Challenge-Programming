
public class IsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(isBST(root));
	}
	
	public static boolean isBST(Node root)
	{
		if (root == null)
			return true;
		
		Node left = root.left, right = root.right;
		
		if (left == null && right == null)
		{
			return true;
		}
		
		if (left != null)
		{
			if (root.data > left.data)
			{
				Node tmp = null;
				if (right != null)
				{
					if (root.data < right.data)
						tmp = root.right;
					else
						return false;
				}
				
				root = root.left;
				return isBST(root) && isBST(tmp);
			}
			
			return false;
		}
		
		else if (right != null)
		{
			if (root.data < right.data)
			{
				Node tmp = null;
				if (left != null)
				{
					if (root.data > left.data)
						tmp = root.left;
					else
						return false;
				}
				
				root = root.right;
				return isBST(root) && isBST(tmp);
			}
			
			return false;
		}
		
		else
		{
			return false;
		}
	}

}
