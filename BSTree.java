/**
 * NAME: WEBSTER KYLE B. GENISE
 * SECTION: IT3B
 * DATE: SEPT 27, 2017
 * CODE REFERENCE/SOURCE: http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/
 * CODE DESCRIPTION: 
 * THIS CODE WILL CREATE A BINARY SEARCH TREE THAT HAS MAIN FUNCTIONS
 * INSERT
 * SEARCH
 * DELETE
 * WHEN YOU INSERT IT AUTOMATICALLY ADDS LESSER NUMBER COMPARED TO ROOT TO ITS LEFT 
 * AND ADDS GREATER NUMBER COMPARED TO ROOT TO ITS RIGHT
 */
public class BSTree{
    public static TreeNode root;
    public BSTree(){ //implementing the bstree class will result to having the root be null to avoid errors.
        this.root = null;
    }
    public TreeNode getSuccessor(TreeNode parentNode){ //this func will get the successor
		TreeNode successsor =null;
		TreeNode successsorParent =null;
		TreeNode current = parentNode.right; 
		while(current!=null){ 
			successsorParent = successsor; 
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
		//successsorParent
		if(successsor!=parentNode.right){
			successsorParent.left = successsor.right;
			successsor.right = parentNode.right;
		}
		return successsor;
    }
    //INSERT
        public void insert(int num){
        TreeNode newLeaf = new TreeNode(num);
        if(root==null){ // so if the tree is still empty then let the inserted num be root
            root = newLeaf;
            return;
        }
        TreeNode curr = root;
        TreeNode parent = null;
        while(true){
            parent = curr; //let the inserted num(curr) be the parent
            if(num < curr.value){ //if the inserted num is lesser than the parent 
                curr = curr.left; // let the inserted num placed in the left
                if(curr==null){
                    parent.left = newLeaf;
                    return;
                }
            } else { 
                curr = curr.right; // let the inserted num placed in the right
                if(curr==null){
                    parent.right = newLeaf;
                    return;
                }
            }
        }
    }
    //SEARCH
    public void search(int num){
        TreeNode curr = root; //so let the root be the current node
        while(curr!=null){ // so while the current node is not equal to null
            if(curr.value==num){ // if inserted num is equal to the current value return true basically do nothing 
                System.out.println(num+ " is in the inventory.");
                break;
            }else if(num < curr.value){ // if the current is greater than the inserted num then let inserted num be the new current node
                curr = curr.left;
            }else if(num > curr.value) { // if the curr is less than the inserted num then let inserted num be the new current node
                curr = curr.right;
            }
        }
        if(curr==null){
            System.out.println("Book "+ num +" is not in the inventory.");
        }
    }
    //DELETE
    public boolean delete(int num){
		TreeNode parent = root; //so let the root be the parent and curr node
		TreeNode curr = root;
		boolean isLeftChild = false;
		while(curr.value!=num){ // so while the curr is no equal to inserted num run this
			parent = curr; // let curr be the parent for now
			if(num < curr.value){
				isLeftChild = true;
				curr = curr.left;
			}else{ 
				isLeftChild = false;
				curr = curr.right;
			}
			if(curr==null){ //if curr is null just let it be
				return false;
			}
		}
		//if i am here that means we have found the node
		//Case 1: if node to be deleted has no children
		if(curr.left==null && curr.right==null){ // if both null meaning no child
			if(curr==root){ //then let root be null
				root = null;
			}
			if(isLeftChild == true){
				parent.left = null;
			}else if (isLeftChild == false){
				parent.right = null;
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(curr.right==null){ 
			if(curr==root){
				root = curr.left;
			}else if(isLeftChild){
				parent.left = curr.left;
			}else{
				parent.right = curr.left;
			}
		}
		else if(curr.left==null){
			if(curr==root){
				root = curr.right;
			}else if(isLeftChild){
				parent.left = curr.right;
			}else{
				parent.right = curr.right;
			}
		}
		//Case 3: if both have child
		else if(curr.left!=null && curr.right!=null){
			//now we have found the minimum element in the right sub tree
			TreeNode successor = getSuccessor(curr);
			if(curr==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = curr.left;
		}		
		return true;		
	}
	public void display(TreeNode root){ //this method displays the tree
		if(root!=null){
			display(root.left);
			System.out.print(root.value+" ");
			display(root.right);
		}
	}
}
