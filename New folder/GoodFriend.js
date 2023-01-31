const LinkedListNode = class {
    constructor(nodeData) {
        this.data = nodeData;
        this.next = null;
    }
};
// Complete the function below
var evenOddMix = function (head) {
    let arr=[];
    let temp=head;
    while(temp!=null){
        arr.push(temp.data);
        temp=temp.next;
    }
    let flag=true;
    for(let i=0;i<arr.length;i=i+2){
        if(arr[i]%2==1){
            flag=false;
        }
    }
    for(let i=1;i<arr.length;i=i+2){
        if(arr[i]%2==0){
            flag=false;
        }
    }
    return flag;
    //console.log(arr)
};