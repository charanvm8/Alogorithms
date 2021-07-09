package dynamicProgramming;

public class GFG {

    Tree root;


    int count;



    // Function to perform the preorder traversal
    // for the given tree
    public void preOrder(Tree node, int max)
    {

        // Base case
        if (node == null) {
            return;
        }

        // If the current node value is greater
        // or equal to the max value,
        // then update count variable
        // and also update max variable
        if (node.x >= max) {
            count++;
            max = Math.max(node.x, max);
        }

        // Traverse to the left
        preOrder(node.l, max);

        // Traverse to the right
        preOrder(node.r, max);
    }

    public int solution(Tree T){
        preOrder(T,Integer.MIN_VALUE);
        return count;
    }



    // Driver code
    public static void main(String[] args)
    {
        GFG tree = new GFG();

		/*
				5
			/ \
			3	 10
			/ \ /
		20 21 1
*/

        tree.root = new Tree(5);
        tree.root.l = new Tree(3);
        tree.root.r = new Tree(10);

        tree.root.l.l = new Tree(20);
        tree.root.l.r = new Tree(21);

        tree.root.r.l = new Tree(1);


        System.out.println(tree.solution(tree.root));
    }
}

