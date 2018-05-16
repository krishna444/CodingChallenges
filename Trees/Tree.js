let {Node} = require("./Node");
class Tree {
    constructor() {
        this.root = null;
    }

    /**
     * Add a new node
     */
    add(value) {
        if (this.root === null) {
            this.root = new Node(value);
            return;
        }
        this.addRecursive(this.root, value);
    }

    addRecursive(node, value) {
        if (value <= node.value) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                this.addRecursive(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                this.addRecursive(node.right, value);
            }
        }
    }

    /**
     * Tree traversal     
     * 
     */

    preOrder() {
        this.preOrderRecursive(this.root);
    }

    preOrderRecursive(node) {
        if (node == null) {
            //console.log("DONE");
            return;
        }
        console.log(node.value);
        this.preOrderRecursive(node.left);
        this.preOrderRecursive(node.right);
    }

    inOrder() {
        this.inOrderRecursive(this.root);
    }

    inOrderRecursive(node) {
        if (node == null) {
            //console.log("DONE");
            return;
        }
        this.inOrderRecursive(node.left);
        console.log(node.value);
        this.inOrderRecursive(node.right);
    }



    postOrder() {
        this.postOrderRecursive(this.root);
    }

    postOrderRecursive(node) {
        if (node == null) {
            //    console.log("DONE");
            return;
        }
        this.postOrderRecursive(node.left);
        this.postOrderRecursive(node.right);
        console.log(node.value);
    }

    /**
     * Finds the maximum value of the tree
     */
    findMaximum() {
        return this.findMaximumRecursive(this.root);
    }

    findMaximumRecursive(node) {
        
        if (node == null) {
            return Number.MIN_SAFE_INTEGER;
        }
        let value = node.value;
        let leftMax = this.findMaximumRecursive(node.left);
        let rightMax = this.findMaximumRecursive(node.right);

        if (leftMax > value) {
            value = leftMax;
        }
        if (rightMax > value) {
            value = rightMax;
        }
        return value;
    }

}
console.log(Node);
let tree = new Tree();
tree.add(27);
tree.add(14);
tree.add(18);
tree.add(10);
tree.add(11);
tree.add(19);
//tree.preOrder();
//tree.inOrder();
//tree.postOrder();
//console.log(tree);
let maximum = tree.findMaximum();
console.log(maximum);