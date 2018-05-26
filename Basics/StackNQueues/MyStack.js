class MyStack {
    constructor(space) {
        this.space = space;
        this.A = new Array(this.space);
        this.A.fill(0);
        this.size = 0;
    }
    /**
     * Pushes a value
     */
    push(value) {
        if (this.size >= this.space)
            console.error("FULL!");
        else {
            this.A[this.size++] = value;
        }
    }

    pop() {
        if (this.size < 0)
            console.log("ERROR");
        else {
            return this.A[--this.size];
        }
    }

    peek() {

        return this.A[this.size - 1];
    }
}

let size = 30;
let stack = new MyStack(size);
for (let i = 0; i < size; i++) {
    let pushValue = Math.trunc(Math.random() * size);
    console.log("pushing " + pushValue);
    stack.push(pushValue);
    console.log(stack.peek());
}

//console.log(stack.size);
//console.log(stack.pop());
//console.log(stack.pop());
// for(let i=0;i<size;i++){
//     console.log(stack.pop());
// }