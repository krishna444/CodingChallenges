//Problem reference:https://app.codility.com/programmers/lessons/2-arrays/
class Arrays {
    //Cyclic Rotation
    cyclicRotation(A, K) {
        let rotated = new Array(A.length);
        for (let i = 0; i < A.length; i++) {
            rotated[(i + K) % A.length] = A[i];
        }
        return rotated;
    }

    //Odd occurances In Array
    oddOccurrencesInArray(A) {
        let xor=0;
        for(let val of A){
            xor=xor ^ val;            
        }
        return xor;
    }
}

let arrays=new Arrays();
//let rotatedArray=arrays.cyclicRotation([3,8,9,7,6,3],4);
//console.log(rotatedArray);

let odd=arrays.oddOccurrencesInArray([1,2,5,6,1,8,2,6,8,5,9,]);
console.log(odd);
