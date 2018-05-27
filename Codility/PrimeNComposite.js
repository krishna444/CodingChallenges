class PrimeNComposite {
    factors(N) {
        let count = 0;
        for (let i = 1; (i * i) <= N; i++) {

            if (N % i == 0) {
                if (i * i == N) count++;
                else count += 2;
            }
        }

        return count;
    }
}


let primeNComposite=new PrimeNComposite();
console.log(primeNComposite.factors(25));