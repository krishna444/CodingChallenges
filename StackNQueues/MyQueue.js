/**
 * Queue data structure
 */
class MyQueue {

    MyQueue(limit=200) {
        this.limit = limit;
        this.head = 0;
        this.tail = 0;
        this.A = new Array(limit);
    }

    enqueue(element) {
        this.A[this.tail++] = element;

    }

    dequeue() {
        return this.A[this.head++];        
    }

    peek() {
        return this.A[this.head];
    }
}

let queue=new MyQueue(100);
console.log(queue.A)