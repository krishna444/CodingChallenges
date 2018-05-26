class PrefixSums {
    countDiv(A, B, K) {
        return (Math.floor(B / K) - Math.floor(A / K)) + (A % K === 0 ? 1 : 0);
    }
}

let prefixSums = new PrefixSums();
let result = prefixSums.countDiv(11, 14, 2);
console.log(result);
