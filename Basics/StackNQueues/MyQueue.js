/**
 * Queue data structure
 */
class MyQueue {

    constructor(limit = 200) {
        this.limit = limit;
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.A = new Array(limit);
    }

    enqueue(element) {
        this.A[this.tail] = element;
        this.tail = (this.tail + 1) % this.limit;
        this.size++;
    }

    dequeue() {
        if (this.isEmpty()) {
            console.log("Empty!");
            return;
        }
        let value = this.A[this.head];
        this.head = (this.head + 1) % this.limit;
        this.size--;
        console.log("Dequeue:" + value);
        return value;
    }

    peek() {
        if (this.isEmpty()) {
            console.log("Empty!")
            return;
        }
        return this.A[this.head];
    }

    isEmpty() {
        return this.size == 0 ? true : false;
    }

    toString() {
        return this.A.toString();
    }
}

let queue = new MyQueue(100);
queue.enqueue(19);
queue.enqueue(39);
queue.enqueue(49);
console.log(queue.toString());