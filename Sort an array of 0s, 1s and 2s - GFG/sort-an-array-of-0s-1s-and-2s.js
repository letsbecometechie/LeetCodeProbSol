//{ Driver Code Starts
//Initial Template for javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

/* Function to print an array */
function printArray(arr, size)
{
    let i;
    let s='';
    for (i=0; i < size; i++) {
        s += arr[i] + " ";
    }
    console.log(s);
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let input_ar0 = readLine().split(' ').map(x=>parseInt(x));
        let n = input_ar0[0];
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++)
            arr[i] = input_ar1[i];
        let obj = new Solution();
        obj.sort012(arr, n);
        printArray(arr, arr.length);
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} arr
 * @param {number} N
 * @returns {number[]}
*/

class Solution {
    
    sort012(a, N)
    {
        //your code here
        let temp=0,low=0,mid=0,high=N-1;
        while(mid<=high){
            switch(a[mid]){
                case 0:{
                    temp = a[low];
                    a[low]=a[mid];
                    a[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = a[mid];
                    a[mid]=a[high];
                    a[high]=temp;
                    high--;
                    break;
                }
            }
        }
        return a;
    }
}