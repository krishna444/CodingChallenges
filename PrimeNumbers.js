class PrimeNumbers {
    sieve(n) {
        let sieve = new Array(n + 1);
        sieve.fill(true);
        sieve[0] = sieve[1] = false;
        for (let i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                let k = i + 1;
                while (k < sieve.length) {
                    if (k % i === 0) {
                        sieve[k] = false;
                    }
                    k++;
                }
            }
        }
        return sieve;
    }

    sieveBetter(n) {
        let sieve = new Array(n + 1);
        sieve.fill(true);
        sieve[0] = sieve[1] = false;

        for (let i = 2; i * i <= sieve.length; i++) {
            if (sieve[i]) {
                let k = i * i;
                while (k < sieve.length) {
                    if (k % i === 0)
                        sieve[k] = false;
                    k++;
                }
            }
        }
        return sieve;


    }

    checkPrime(n) {
        return this.sieveBetter(n)[n];
    }
}

let primeNumbers = new PrimeNumbers();
//let result = primeNumbers.sieve(10000);
//console.log(result);
console.log(primeNumbers.checkPrime(27909));