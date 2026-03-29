class TreeMap {

    class TreeNode{
        int key;
        int val;
        TreeNode left, right;

        TreeNode(int key, int val){
            this.key = key;
            this.val = val;
            right = left = null;
        }
    }

    TreeNode root;
    
    public TreeMap() {
        root = null;
    }

    public void insert(int key, int val) {
        root = insertHelper(root, key, val);
    }

    public TreeNode insertHelper(TreeNode root, int key, int val){
        if(root == null){
            return new TreeNode(key, val);
        }

        if(key < root.key){
            root.left = insertHelper(root.left, key, val);
        }
        else if(key > root.key){
            root.right = insertHelper(root.right, key, val);
        } 
        else{
            root.val = val;
        }

        return root;
    }

    public int get(int key) {
        return getHelper(root, key);
    }

    public int getHelper(TreeNode root, int target){
        if(root == null){
            return -1;
        }

        if(target < root.key){
            return getHelper(root.left, target);
        } else if(target > root.key){
            return getHelper(root.right, target);
        } else{
            return root.val;
        }

    }

    public int getMin() {
        int minValue = -1;
        minValue = getMinHelper(root, minValue);

        return minValue;
    }

    public int getMinHelper(TreeNode root, int minValue){
        if(root != null){
            getMinHelper(root.left, minValue);
            minValue = root.val;
            getMinHelper(root.right, minValue);
        }
        
        return minValue;
    }

    public int getMax() {
        List<Integer> listForMax = new ArrayList<>();
        getMaxHelper(root, listForMax);
        if(!listForMax.isEmpty()){
            return listForMax.get(listForMax.size() - 1);
        }
        return -1;
    }

    public void getMaxHelper(TreeNode root, List<Integer> listForMax){
        if(root != null){
            getMaxHelper(root.left, listForMax);
            listForMax.add(root.val);
            getMaxHelper(root.right, listForMax);
        }
    }

    public void remove(int key) {
       root = removeHelper(root, key);
    }

    public TreeNode removeHelper(TreeNode root, int key){
        if(root == null){
            return null;
        }

        if(key < root.key){
            root.left = removeHelper(root.left, key);
        } else if(key > root.key){
            root.right = removeHelper(root.right, key);
        } else{
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            } else{
                TreeNode minNode = minValueNode(root.right);
                root.key = minNode.key;
                root.right = removeHelper(root.right, minNode.key);
            }
        }
        return root;
    }

    public TreeNode minValueNode(TreeNode root){
        TreeNode curr = root;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public List<Integer> getInorderKeys() {
        List<Integer> list = new ArrayList<>();
        inOrderHelper(root, list);

        return list;
    }

    public void inOrderHelper(TreeNode root, List<Integer> list){
        if(root != null){
            inOrderHelper(root.left, list);
            list.add(root.key);
            inOrderHelper(root.right, list);
        }
    }
}
