/**
 * Queue data structure
 */
class MyQueue {

    constructor(limit = 200) {
        this.limit = limit;
        this.head = 0;
        this.tail = 0;
        this.A = new Array(limit);
    }

    enqueue(element) {
        this.A[this.tail++] = element;

    }

    dequeue() {
        let value = this.A[this.head++];
        console.log("Dequeue:" + value);
        return value;
    }

    peek() {
        return this.A[this.head];
    }
}

let queue = new MyQueue(100);
queue.enqueue(19);
queue.enqueue(39);
queue.enqueue(49);
console.log(queue.peek());
console.log(queue.tail)

queue.dequeue();
queue.dequeue();
console.log(queue.peek());