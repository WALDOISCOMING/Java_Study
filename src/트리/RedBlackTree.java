package Ʈ��;
/*
 * ������: 2017-07-20
 * ������: ����
 * ������: x
 * ������: x
 * ���� :�����Ʈ��
 * ���� :���� ���� Ʈ���� ������ ������ ���� 1-2-3-4-5..�� ���� ���������� ũ�ų� �۴ٸ� Ʈ���� ������
 * �������� ġ��ó��, ������ lgn�� �ƴ� n�� �������� ���̰� �����ȴ� �׷��� �̷��� ��쿡�� search�� �ع����ٸ�
 * lgn�� �ƴ� n�� �Ǿ� ������ ���ϴ� ��찡 �ƴϰ� �ȴ�. �̷��� ��츦 ȸ���ϱ� ���� ���� �� ������ �ϴ� �����,
 * �����Ʈ���̴�.
 * 
 * 
1. ���� ���� Ȥ�� �� ���� �ϳ��̴�.
2. ��Ʈ ���� ���̴�.
3. ��� ���� ���� ���̴�.
4. ���� ����� �ڽĳ�� ������ ������ ��� ���̴�. (��, ���� ���� ���޾� ��Ÿ�� �� ������, �� ��常�� ���� ����� �θ� ��尡 �� �� �ִ�)
5. � ���κ��� ���۵Ǿ� ���� ��忡 �����ϴ� ��� ��ο��� ���� ��带 �����ϸ� ��� ���� ������ �� ��尡 �ִ�.

���� ������ ����.
 */

public class RedBlackTree {
	public static RedBlackTree root;
	 private int value;
	    private RedBlackTree left;
	    private RedBlackTree right;
	    private RedBlackTree parent;
	    private int color;
	  static int BLACK=0;
	  static int RED=1;
	    public RedBlackTree grandParent() { // �Ҿƹ��� ���
	        if (parent != null) // �θ� �ִٸ� �Ҿƹ������ ��ȯ
	            return parent.getParent();
	        else {
	            return null; // �θ� ���ٸ� null ��ȯ
	        }
	    }
	  
	    public RedBlackTree sibling() { // ���� ���
	        if (getParent() != null) { // �θ� �ִٸ� �θ��� �����ƴ� �ڽĳ�� ��ȯ
	            if (this == getParent().getLeft())
	                return getParent().getRight();
	            else
	                return getParent().getLeft();
	        } else { // �θ� ���ٸ� null ��ȯ
	            return null;
	        }
	    }
	  
	    public RedBlackTree uncle() { // ���̳��
	        return parent.sibling(); // �θ��� �������
	    }
	  
	    public int getValue() {
	        return value;
	    }
	  
	    public void setValue(int value) {
	        this.value = value;
	    }
	  
	    public RedBlackTree getLeft() {
	        return left;
	    }
	  
	    public void setLeft(RedBlackTree left) {
	        this.left = left;
	    }
	  
	    public RedBlackTree getRight() {
	        return right;
	    }
	  
	    public void setRight(RedBlackTree right) {
	        this.right = right;
	    }
	  
	    public RedBlackTree getParent() {
	        return parent;
	    }
	  
	    public void setParent(RedBlackTree parent) {
	        this.parent = parent;
	    }
	  
	    public int getColor() {
	        return color;
	    }
	  
	    public void setColor(int color) {
	        this.color = color;
	    }

	    public void insertCase1(RedBlackTree node) {
	    	/*
	    	 * �θ� ������ �� ��尡 root�� �ȴ�. root�� �ƴѰ�쿡�� case2��
	    	 */
	        if (node.getParent() == null) // root �λ���
	            node.setColor(BLACK); // 2�� �Ӽ�
	        //5�� ��ȿ
	        else
	            insertCase2(node);
	    }
	    public void insertCase2(RedBlackTree node) {
	    	/*
	    	 * 
	    	 */
	        if (node.getParent().getColor() == BLACK) // �θ��� Color�� Black �� ��� 4�� �Ӽ� ����
	            return; // Ʈ���� ��ȿ��
	        //5�� ��ȿ
	        else
	            insertCase3(node); // �θ��� Color�� Red �� ���
	    }
	    public void insertCase3(RedBlackTree node) {
	        RedBlackTree uncle = node.uncle();
	        RedBlackTree grandParent;
	      
	        if ((uncle != null) && (uncle.getColor() == RED)) { // �θ����� Color�� Red �� ��� && ���̳���� Color�� Red �� ���
	            node.getParent().setColor(BLACK);
	            uncle.setColor(BLACK); // �θ���� ���̳��� Black
	            grandParent = node.grandParent();
	            grandParent.setColor(RED); // �Ҿƹ��� ���� Red
	              
	            insertCase1(grandParent);  // �Ҿƹ�����尡 Root �����  2�� �Ӽ��� ���� ���� �� �ִ�.
	        } else {
	            insertCase4(node); // �θ����� Color�� Red �� ��� && ���̳���� Color�� Black �� ���
	        }
	    }
	    public void insertCase4(RedBlackTree node) {
	        RedBlackTree grandParent = node.grandParent();
	      
	        if ((node == node.getParent().getRight()) // ������ �ڽ��̰�, �θ�� ���� �ڽ��� ��
	                && (node.getParent() == grandParent.getLeft())) {
	            rotateLeft(node.getParent()); // ����ȸ��
	            node = node.getLeft(); // ���� ����� �θ��忴�� �ڽĳ�忡 ���� ó���� �ϱ� ���ؼ� �θ���� �ּ� ����
	        } else if ((node == node.getParent().getLeft()) // ���� �ڽ��̰�, �θ�� ������ �ڽ��� ��
	                && (node.getParent() == grandParent.getRight())) {
	            rotateRight(node.getParent());
	            node = node.getRight(); //  ���� ����� �θ��忴�� �ڽĳ�忡 ���� ó���� �ϱ� ���ؼ� �θ���� �ּ� ����
	        }
	        insertCase5(node); // �θ��忡 ���ѿ��� ����� �θ��忴�� �ڽĳ�忡 ���� ó��, 4�� �Ӽ��� ���ѹٰ� �ִ�.
	    }
	    public void rotateLeft(RedBlackTree node) {//���� ȸ��
	        RedBlackTree child = node.getRight();
	        RedBlackTree parent = node.getParent();
	      
	        if (child.getLeft() != null)
	            child.getLeft().setParent(node);
	      
	        node.setRight(child.getLeft());
	        node.setParent(child);
	        child.setLeft(node);
	        child.setParent(parent);
	      
	        if (parent != null) {
	            if (parent.getLeft() == node)
	                parent.setLeft(child);
	            else
	                parent.setRight(child);
	        }
	    }
	      
	    public void rotateRight(RedBlackTree node) { // ������ ȸ��
	        RedBlackTree child = node.getLeft();
	        RedBlackTree parent = node.getParent();
	      
	        if (child.getRight() != null)
	            child.getRight().setParent(node);
	      
	        node.setLeft(child.getRight());
	        node.setParent(child);
	        child.setRight(node);
	        child.setParent(parent);
	      
	        if (parent != null) {
	            if (parent.getRight() == node)
	                parent.setRight(child);
	            else
	                parent.setLeft(child);
	        }
	    }

	    public void insertCase5(RedBlackTree node) { // �θ���� Color �� Red �̰�, ���̳���� Color�� Black �� ���
	        RedBlackTree grandParent = node.grandParent();
	        node.getParent().setColor(BLACK);
	        grandParent.setColor(RED);
	        if (node == node.getParent().getLeft()) {
	            rotateRight(grandParent);
	        } else {
	            rotateLeft(grandParent);
	        } //���ο� ��嵵 �θ��� �����ڽ�, �θ��嵵 �Ҿƹ�������� �����ڽ��̸� ������ ȸ���� �Ѵ�.
	    }
	    
	    
	    private RedBlackTree searchNode(int value) {// value �� ���� ��带 ã�´�
	        RedBlackTree node = root;
	        while (node != null) {
	            if (node.getValue() == value) {
	                return node;
	            } else if (node.getValue() < value) {
	                node = node.getLeft();
	            } else {
	                node = node.getRight();
	            }
	        }
	        return node;
	    }
	 
	    private RedBlackTree leftMaximumNode(RedBlackTree node) {//���ʳ�� �� ���������� ��� ã�Ƽ� ���� ū ��� , ������ȸ�� �ٷ��� ��
	        while (node.getRight() != null) {
	            node = node.getRight();
	        }
	        return node;
	    }
	 
	    private void replaceNode(RedBlackTree oldNode, RedBlackTree newNode) { // ��ü
	        if (oldNode.getParent() == null) { 
	            root = newNode;
	        } else {
	            if (oldNode == oldNode.getParent().getLeft())
	                oldNode.getParent().setLeft(newNode);
	            else
	                oldNode.getParent().setRight(newNode);
	        }
	        if (newNode != null) {
	            newNode.setParent(oldNode.getParent());
	        }
	    }
	 
	    public void delete(int value) { // ����
	        RedBlackTree node = searchNode(value);
	        if (node == null)
	            return; // ����
	        if (node.getLeft() != null && node.getRight() != null) {
	            RedBlackTree leftMaxNode = leftMaximumNode(node.getLeft());
	            node = leftMaxNode;
	        }
	 
	        RedBlackTree child = (node.getRight() == null) ? node.getLeft() : node.getRight();
	        if (node.getColor() == BLACK) { // ��尡 ���̶��
	            node.setColor(child.getColor());
	             deleteCase1(node);
	        }
	        replaceNode(node, child);
	    }


	    
	    
	    
	    
	    
	    public void deleteCase1(RedBlackTree node) {
	        if (node.getParent() != null)
	            deleteCase2(node);
	    }

	    public void deleteCase2(RedBlackTree node) {
	        RedBlackTree sibling = node.sibling();
	        if (sibling.getColor() ==RED) { // ������ color�� �������̸�
	            node.getParent().setColor(RED);
	            sibling.setColor(BLACK); // color�� �ٲ��ְ�
	            if(node == node.getParent().getLeft()){
	                rotateLeft(node.getParent()); // ���� �ڽ��̸� �������� �����ְ�
	            }else{
	                rotateRight(node.getParent());// ������ �ڽ��̸� �������� �����ְ�
	            }
	        }
	        deleteCase3(node);
	    }

	    public void deleteCase3(RedBlackTree node) {
	        RedBlackTree sibling = node.sibling();
	        if ((node.getParent().getColor() == BLACK)
	                && (sibling.getColor() == BLACK)
	                && (sibling.getLeft().getColor() == BLACK)
	                && (sibling.getRight().getColor() ==BLACK)) {
	            sibling.setColor(RED);
	            deleteCase1(node.getParent()); // �Ӽ� 5 ����, �ٽ� ���ư���
	        } else
	            deleteCase4(node);
	    }

	    public void deleteCase4(RedBlackTree node) {
	        RedBlackTree sibling = node.sibling();
	        if ((node.getParent().getColor() == RED)
	                && (sibling.getColor() == BLACK)
	                && (sibling.getLeft().getColor() == BLACK)
	                && (sibling.getRight().getColor() == BLACK)) {
	            sibling.setColor(RED);
	            node.getParent().setColor(BLACK);
	        } else
	            deleteCase5(node);
	    }
	    public void deleteCase5(RedBlackTree node) {
	        RedBlackTree sibling = node.sibling();
	        if (sibling.getColor() ==BLACK) {
	            if ((node == node.getParent().getLeft())
	                    && (sibling.getRight().getColor() == BLACK)
	                    && (sibling.getLeft().getColor() == RED)) {
	                sibling.setColor(RED);
	                sibling.getLeft().setColor(BLACK);
	                rotateRight(sibling);
	            } else if ((node == node.getParent().getRight())
	                    && (sibling.getLeft().getColor() == BLACK)
	                    && (sibling.getRight().getColor() == RED)) {
	                sibling.setColor(RED);
	                sibling.getRight().setColor(BLACK);
	                rotateLeft(sibling);
	            }
	        }
	        deleteCase6(node);
	    }

	    public void deleteCase6(RedBlackTree node) {
	        RedBlackTree sibling = node.sibling();
	        sibling.setColor(node.getParent().getColor());
	        node.getParent().setColor(BLACK);
	 
	        if(node == node.getParent().getLeft()){
	            sibling.getRight().setColor(BLACK);
	            rotateLeft(node.getParent());
	        }else{
	            sibling.getLeft().setColor(BLACK);
	            rotateRight(node.getParent());
	        }
	}




}
