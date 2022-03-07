document.write("Randomly generated numbers array with length of 100: <br>")

var makeARandomNumber = function(){
    return Math.floor(Math.random() * 101);
}
var randoms = Array(100).fill(0).map(makeARandomNumber);
document.write(randoms,"<br>");


//for larget nimber in the array
var largest = randoms[0];
for (var i = 0; i < randoms.length; i++) {
    if (largest < randoms[i] ) {
        largest = randoms[i];
    }
}
document.write("<br>larget number in the array is: ",largest,"<br>");

//for smallest number in the array
var smallest = randoms[0];
for (var i = 0; i < randoms.length; i++) {
    if (smallest >randoms[i] ) {
        smallest = randoms[i];
    }
}
document.write("larget number in the array is: ",smallest,"<br>");

//odd even count in array
function CountingEvenOdd(randoms)
{
    let even_count = 0;
    let odd_count = 0;
 
    // loop to read all the values in the array
    for (let i = 0; i < randoms.length; i++) {
         
        // checking if a number is completely
        // divisible by 2
        if (randoms[i] & 1 == 1)
            odd_count++;
        else
            even_count++;
    }
 
    document.write("Number of even elements = " + even_count
        + "<br>" + "Number of odd elements = " + odd_count+"<br>");
}
 
document.write(CountingEvenOdd(randoms));

//sum of array
function sum(randoms) { 
    let sum = 0; // initialize sum 

    // Iterate through all elements 
    // and add them to sum 
    for (let i = 0; i < randoms.length; i++) 
        sum += randoms[i]; 

    return sum; 
} 

document.write("<br>Sum of given array is " + sum(randoms));


//Average value of array
function average(randoms)
{

// Find sum of array element
  var sum = 0;
  for (var i = 0; i < randoms.length; i++) sum += randoms[i];

   return parseFloat(sum /randoms.length);
}

document.write("<br>The Average of the array is: "+average(randoms)+"<br>");