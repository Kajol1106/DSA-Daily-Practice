//Enter code here
function play(st){

    let queue =[];
    let obj ={}
    let ans="";
    for(let i=0; i<st.length; i++) {
        queue.push(st[i])
        if(obj[queue[queue.length-1]]==undefined){
            obj[queue[queue.length-1]]=1;
        } else {
            obj[queue[queue.length-1]]++;
        }
        while(queue.length!=0){
            if(obj[queue[0]]==1){
                break;
            } else {
                queue.shift();
            }
        }
        if(queue.length==0){
            ans+="#";
        } else {
            ans+=queue[0];
        }
    }
    console.log(ans)
}



 function runProgram(input){
     //Input Taking Here
     input=input.trim().split("\n");
     let tc =+input[0];
     let line =1;
     while(tc>0) {
         let st = input[line++];
         play(st)
         tc--;
     }
 }
if(process.env.USER===""){
     runProgram('');
 }else{
     process.stdin.resume();
     process.stdin.setEncoding("ascii");
     let read="";
     process.stdin.on("data",function(input){
         read+=input;
     });
     process.stdin.on("end",function(){
         read=read.replace(/\n$/,"");
         read=read.replace(/\n$/,'');
         runProgram(read);
     });
     process.on('SIGINT',function(){
         read=read.replace(/\n$/,"");
         runProgramm(read);
         process.et(0);
 });
 }
