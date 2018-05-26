class CountingElements {
    frogRiverOne(X, A) {
        let reached = new Array(X + 1).fill(0);
        let time = -1;
        for (let val of A) {
            time++;
            reached[val] = 1;

            if (reached[X] === 1) {
                let flag = true;
                for (let i = 1; i <= X; i++) {
                    if (reached[i] === 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return time;
                }
            }
        }
        return -1;
    }

    missingInteger(A) {
        let B = new Array(A.length + 2).fill(0); 
        for (let val of A) {
            if(val <= 0 && val > A.length) {
                continue;
            }

            B[val] = 1;
        }


        for(let i=1;i<B.length;i++){
            if(B[i]===0)
                return i;
        }
    }

    permCheck(A){
        let B=new Array(A.length).fill(0);       
        for(let val of A){            
            if(val>A.length || B[val-1]>0)
                return 0;
            B[val-1]++;            
        }
        console.log(B);

        return 1;

    }
}

let counting = new CountingElements();
// let result = counting.frogRiverOne(3, [1, 3, 1, 3, 2, 1, 3]);
// console.log(result);

// missing=counting.missingInteger([1,2,4,5]);
// console.log(missing);

let perm=counting.permCheck([4,1,3]);
console.log(perm);