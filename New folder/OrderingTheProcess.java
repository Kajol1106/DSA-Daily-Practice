//Enter code here
function masaischool(N,arr,arr1){
    let count =0;
    for (let i=0;i<N;i++){
        for (let j=0;j<N;j++){
            if (arr[i]!=arr1[i]){
                let Y =arr.splice(i,1)
                arr.push(Y)
                count++
            }
        }
       
    }
    console.log(count+N)
}


function runProgram(input) {
   input = input.trim().split("\n")
   let N =+input[0];
   let arr = input[1].trim().split(" ").map(Number);
   let arr1= input[2].trim().split(" ").map(Number);
   masaischool(N,arr,arr1)
}



if (process.env.USER === "") {
 runProgram(``);
} else {
 process.stdin.resume();
 process.stdin.setEncoding("ascii");
 let read = "";
 process.stdin.on("data", function (input) {
   read += input;
 });
 process.stdin.on("end", function () {
   read = read.replace(/\n$/, "");
   read = read.replace(/\n$/, "");
   runProgram(read);
 });
 process.on("SIGINT", function () {
   read = read.replace(/\n$/, "");
   runProgram(read);
   process.exit(0);
 });
}
