// Write a function that calculates the average of a list of numbers


function calculateAverage(array) {
    let sum = 0.00;
    let average = 0.00;

    for (let i = 0; i < array.length; i++) {
        sum += array[i];
    }

    average = sum / array.length;

    return average;
}


array1 = [1, 5, 3, 9, 2, 4.3];
console.log("The array is: " + array1);
console.log("The average of the elements is: " + calculateAverage(array1));

array2 = [-1, -5.6, -3, -9, -2, 6, 0];
console.log("The array is: " + array2);
console.log("The average of the elements is: " + calculateAverage(array2));