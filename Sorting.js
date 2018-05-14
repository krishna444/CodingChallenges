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

        return this.merge(this.mergeSort(left), this.mergeSort(right));
    }
    merge(left, right) {
        let merged = new Array(left.length + right.length);
        let mergedIndex = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] > right[0]) {
                merged[mergedIndex++] = right[0];
                right.splice(0, 1);
            } else {
                merged[mergedIndex++] = left[0];
                left.splice(0, 1);
            }
        }

        while (left.length > 0) {
            merged[mergedIndex++] = left[0];
            left.splice(0, 1);
        }

        while (right.length > 0) {
            merged[mergedIndex++] = right[0];
            right.splice(0, 1);
        }
        
        console.log("."+mergedIndex);
        return merged;
    }

    quickSort(A) {

    }

    createRandomArray(size) {
        let array = new Array(size);
        while (size > 0) {
            array[size - 1] = Math.trunc(Math.random() * 1000);
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
let mergeSort = sorting.mergeSort(sorting.createRandomArray(1000000));
console.log(mergeSort);
console.timeEnd("merge");


