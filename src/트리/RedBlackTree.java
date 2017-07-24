package 트리;
/*
 * 생성일: 2017-07-20
 * 생성자: 길경완
 * 수정일: x
 * 수정자: x
 * 제목 :레드블랙트리
 * 내용 :기초 이진 트리는 나쁘지 않으나 만약 1-2-3-4-5..와 같이 순서적으로 크거나 작다면 트리의 구조가
 * 한쪽으로 치우처진, 원래의 lgn이 아닌 n의 형식으로 높이가 형성된다 그러면 이러한 경우에서 search를 해버린다면
 * lgn이 아닌 n이 되어 원래의 원하는 경우가 아니게 된다. 이러한 경우를 회피하기 위해 삽입 후 정리를 하는 방법인,
 * 레드블랙트리이다.
 * 
 * 
1. 노드는 레드 혹은 블랙 중의 하나이다.
2. 루트 노드는 블랙이다.
3. 모든 리프 노드는 블랙이다.
4. 레드 노드의 자식노드 양쪽은 언제나 모두 블랙이다. (즉, 레드 노드는 연달아 나타날 수 없으며, 블랙 노드만이 레드 노드의 부모 노드가 될 수 있다)
5. 어떤 노드로부터 시작되어 리프 노드에 도달하는 모든 경로에는 리프 노드를 제외하면 모두 같은 개수의 블랙 노드가 있다.

내일 나머지 하자.
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
	    public RedBlackTree grandParent() { // 할아버지 노드
	        if (parent != null) // 부모가 있다면 할아버지노드 반환
	            return parent.getParent();
	        else {
	            return null; // 부모 없다면 null 반환
	        }
	    }
	  
	    public RedBlackTree sibling() { // 형제 노드
	        if (getParent() != null) { // 부모가 있다면 부모의 내가아닌 자식노드 반환
	            if (this == getParent().getLeft())
	                return getParent().getRight();
	            else
	                return getParent().getLeft();
	        } else { // 부모 없다면 null 반환
	            return null;
	        }
	    }
	  
	    public RedBlackTree uncle() { // 삼촌노드
	        return parent.sibling(); // 부모의 형제노드
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
	    	 * 부모가 없으면 현 노드가 root가 된다. root가 아닌경우에는 case2로
	    	 */
	        if (node.getParent() == null) // root 로삽입
	            node.setColor(BLACK); // 2번 속성
	        //5번 유효
	        else
	            insertCase2(node);
	    }
	    public void insertCase2(RedBlackTree node) {
	    	/*
	    	 * 
	    	 */
	        if (node.getParent().getColor() == BLACK) // 부모의 Color가 Black 인 경우 4번 속성 만족
	            return; // 트리가 유효함
	        //5번 유효
	        else
	            insertCase3(node); // 부모의 Color가 Red 인 경우
	    }
	    public void insertCase3(RedBlackTree node) {
	        RedBlackTree uncle = node.uncle();
	        RedBlackTree grandParent;
	      
	        if ((uncle != null) && (uncle.getColor() == RED)) { // 부모노드의 Color가 Red 인 경우 && 삼촌노드의 Color가 Red 인 경우
	            node.getParent().setColor(BLACK);
	            uncle.setColor(BLACK); // 부모노드와 삼촌노드는 Black
	            grandParent = node.grandParent();
	            grandParent.setColor(RED); // 할아버지 노드는 Red
	              
	            insertCase1(grandParent);  // 할아버지노드가 Root 노드라면  2번 속성을 만족 안할 수 있다.
	        } else {
	            insertCase4(node); // 부모노드의 Color가 Red 인 경우 && 삼촌노드의 Color가 Black 인 경우
	        }
	    }
	    public void insertCase4(RedBlackTree node) {
	        RedBlackTree grandParent = node.grandParent();
	      
	        if ((node == node.getParent().getRight()) // 오른쪽 자식이고, 부모는 왼쪽 자식일 때
	                && (node.getParent() == grandParent.getLeft())) {
	            rotateLeft(node.getParent()); // 왼쪽회전
	            node = node.getLeft(); // 원래 노드의 부모노드였던 자식노드에 대한 처리를 하기 위해서 부모노드로 주소 변경
	        } else if ((node == node.getParent().getLeft()) // 왼쪽 자식이고, 부모는 오른쪽 자식일 때
	                && (node.getParent() == grandParent.getRight())) {
	            rotateRight(node.getParent());
	            node = node.getRight(); //  원래 노드의 부모노드였던 자식노드에 대한 처리를 하기 위해서 부모노드로 주소 변경
	        }
	        insertCase5(node); // 부모노드에 대한원래 노드의 부모노드였던 자식노드에 대한 처리, 4번 속성을 위한바고 있다.
	    }
	    public void rotateLeft(RedBlackTree node) {//왼쪽 회전
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
	      
	    public void rotateRight(RedBlackTree node) { // 오른쪽 회전
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

	    public void insertCase5(RedBlackTree node) { // 부모노드는 Color 가 Red 이고, 삼촌노드의 Color가 Black 인 경우
	        RedBlackTree grandParent = node.grandParent();
	        node.getParent().setColor(BLACK);
	        grandParent.setColor(RED);
	        if (node == node.getParent().getLeft()) {
	            rotateRight(grandParent);
	        } else {
	            rotateLeft(grandParent);
	        } //새로운 노드도 부모의 왼쪽자식, 부모노드도 할아버지노드의 왼쪽자식이면 오른쪽 회전을 한다.
	    }
	    
	    
	    private RedBlackTree searchNode(int value) {// value 에 따른 노드를 찾는다
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
	 
	    private RedBlackTree leftMaximumNode(RedBlackTree node) {//왼쪽노드 중 오른쪽으로 계속 찾아서 가장 큰 노드 , 중위순회시 바로전 값
	        while (node.getRight() != null) {
	            node = node.getRight();
	        }
	        return node;
	    }
	 
	    private void replaceNode(RedBlackTree oldNode, RedBlackTree newNode) { // 교체
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
	 
	    public void delete(int value) { // 삭제
	        RedBlackTree node = searchNode(value);
	        if (node == null)
	            return; // 없음
	        if (node.getLeft() != null && node.getRight() != null) {
	            RedBlackTree leftMaxNode = leftMaximumNode(node.getLeft());
	            node = leftMaxNode;
	        }
	 
	        RedBlackTree child = (node.getRight() == null) ? node.getLeft() : node.getRight();
	        if (node.getColor() == BLACK) { // 노드가 블랙이라면
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
	        if (sibling.getColor() ==RED) { // 형제의 color가 빨간색이면
	            node.getParent().setColor(RED);
	            sibling.setColor(BLACK); // color를 바꿔주고
	            if(node == node.getParent().getLeft()){
	                rotateLeft(node.getParent()); // 왼쪽 자식이면 왼쪽으로 돌려주고
	            }else{
	                rotateRight(node.getParent());// 오른쪽 자식이면 왼쪽으로 돌려주고
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
	            deleteCase1(node.getParent()); // 속성 5 위반, 다시 돌아간다
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
