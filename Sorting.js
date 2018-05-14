/**
 * Basic soring algorithms implementation
 */
class Sorting {
    bubbleSort(A) {
        for (let j = A.length - 1; j >= 0; j--) {
            for (let i = 0; i < j; i++) {
                if (A[i] > A[i + 1]) {
                    let temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
            }
        }
        return A;
    }

    mergeSort(A) {
        
        if (A.length < 2) {
            return A;
        }
        let mid = Math.trunc(A.length / 2);
        let left = new Array(mid);
        let right = new Array(A.length - mid);
        for (let i = 0; i < mid; i++) {
            left[i] = A[i];
        }
        for (let i = mid; i < A.length; i++) {
            right[i - mid] = A[i];
        }

        this.mergeSort(left);
        this.mergeSort(right);
        return this.merge(left,right);
    }

    merge(left, right){
        for(let i=0;i<left.length;i++){
            for(let j=0;j<right.length;j++){
                if(left[i]>right[j]){
                    let tmp=left[i];
                    left[i]=right[j];
                    right[j]=tmp;
                }
            }            
        }
        console.log(left.concat(right));
        return left.concat(right);

    }

    quickSort(A) {

    }

    createRandomArray(size) {
        let array = new Array(size);
        while (size >= 0) {
            array.push(Math.trunc(Math.random() * 100));
            size--;
        }
        return array;
    }
}

let sorting = new Sorting();
/*console.time("bubble sort");
let bubbleResult = sorting.bubbleSort(sorting.createRandomArray(100000));
console.log(bubbleResult);
console.timeEnd("bubble sort");
*/

console.time("merge");
let mergeSort=sorting.mergeSort(sorting.createRandomArray(10));
console.log(mergeSort);
console.timeEnd("merge");


