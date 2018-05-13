//See documentation TimeComplexity.md
//@Author:Krishna Paudel
class TimeComplexity {
    tapeEquilibrium(A) {
        let leftSum=0;      
        let rightSum = A.reduce((x, y) => x + y);
        let minDiff = Number.MAX_SAFE_INTEGER;
        console.log("Total Sum=" +rightSum);
        for (let i = 1; i < A.length; i++) {
            leftSum = leftSum + A[i - 1];
            rightSum = rightSum - A[i - 1];
            let diff = Math.abs(rightSum - leftSum);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

}

let timeComplexity = new TimeComplexity();
let result = timeComplexity.tapeEquilibrium([-1, 1]);
console.log(result);