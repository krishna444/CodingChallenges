function fibonacciNaive(n) {
    if (n == 0 || n == 1)
        return n;
    return fibonacciNaive(n - 2) + fibonacciNaive(n - 1);
}

function fibonacciBetter(n) {
    let F = new Array(n+1);
    F[0] = 0;
    F[1] = 1;
    for (let i = 2; i <= n; i++) {
        F[i]=F[i-1]+F[i-2];
    }

    return F[n];
}
let n=45;
console.time('fibonacciN1aive');
let result = fibonacciNaive(n);
console.log(result);
console.timeEnd('fibonacciN1aive')


console.time("fibBetter");
result=fibonacciBetter(n);
console.log(result);
console.timeEnd("fibBetter");