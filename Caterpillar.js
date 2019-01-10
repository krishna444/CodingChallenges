class Caterpillar {
    //checks if an array A has a subsequence equals s
    subsequenceSumCheck(A, s) {
        let front = 0;
        let total = 0;

        for (let back = 0; back < A.length; back++) {
            while (front < A.length && total + A[front] <= s) {
                total += A[front];
                front++;
            }
            if (total === s) {
                return true;
            }
            total -= A[back];
        }
        return false;
    }
}

let A = [6, 2, 7, 6];
let caterpillar=new Caterpillar();
let result = caterpillar.subsequenceSumCheck(A, 12);
console.log(result);
