class Iterations {
    factorial(number) {
        if (number < 0)
            return undefined;
        if (number <= 1)
            return 1;
        return number * factorial(number - 1);
    }

    getBinaryString(N) {
        return Number(N).toString(2);
    }

    getBinaryGap(N) {
        let binString = Number(N).toString(2);
        let i = binString.length - 1;
        while (binString.charAt(i) == '0') {
            i--;
        }

        let gap = 0;
        let count = 0;
        for (; i >= 0; i--) {
            if (binString.charAt(i) === '1') {                
                gap = Math.max(gap, count);
                count=0;
            } else {
                count++;
            }
        }
        return Math.max(gap, count);
    }

}


let itereations = new Iterations();
//console.log(itereations.factorial(0));
//console.log(itereations.getBinaryString(12));
//console.log(Math.max(12, 13));
console.log(itereations.getBinaryGap(1041));
console.log(itereations.getBinaryGap(2139127807));