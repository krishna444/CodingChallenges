class Codility {
    factorial(N) {
        if (N <= 1) {
            return 1;
        }
        return N * this.factorial(N - 1);

    }

    filesSummary(S) {
        let files = S.split('\n');
        let musicCount = 0;
        let imagesCount = 0;
        let moviesCount = 0;
        let otherCount = 0;
        for (let file of files) {
            let fileInfos = file.split(' ');
            let extension = fileInfos[0].split('.').pop();
            let size = parseInt(fileInfos[1].slice(0, -1));

            if (extension === 'mp3' || extension === 'aac' || extension === 'flac') {
                musicCount += size;
            } else if (extension === 'jpg' || extension === 'bmp' || extension == 'gif') {
                imagesCount += size;
            } else if (extension === 'mp4' || extension === 'avi' || extension === 'mkv') {
                moviesCount += size;
            } else {
                otherCount += size;
            }
        }
        return "music " + musicCount + "b\nimages " + imagesCount + "b\nmovies " + moviesCount + "b\nother" + otherCount + "b";
    }

    similar(N) {
        if (N == 0)
            return 1;
        let counter = new Array(10);
        counter.fill(false);
        while (N != 0) {
            counter[N % 10] = true;
            N = Math.trunc(N / 10);
        }
        let distinctItems = 0;
        for (let i = 1; i < counter.length; i++) {
            if (counter[i] === true) {
                distinctItems++;
            }
        }
        return this.factorial(distinctItems);
    }
}


let codility = new Codility();
console.log(codility.similar(1213));
//let fileSummary = "my.song.mp3 11b\ngreatSong.flac 1000b \nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b";
//console.log(codility.filesSummary(fileSummary));