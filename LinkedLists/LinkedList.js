let { Node } = require("./Node");
class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    addToHead(value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else {
            let node = new Node(value);
            node.next = this.head;
            this.head = node;
        }

        this.size++;
    }


    addToTail(value) {
        let node = this.head;
        while (node.next != null) {
            node = node.next;
        }

        let newNode = new Node(value);
        node.next = newNode;
        this.size++;
    }


}


let linkedList = new LinkedList();
linkedList.addToHead(12);
linkedList.addToTail(14);
for (let i = 0; i < 20; i++)
    linkedList.addToHead(i);
for (let i = 0; i < 20; i++) {
    linkedList.addToTail(i);
}
let startNode = linkedList.head;
while (startNode.next != null) {
    console.log(startNode.value);
    startNode = startNode.next;
}

console.log("size=" + linkedList.size);