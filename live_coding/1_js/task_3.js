// Write a function that calculates the sum of a list of numbers
function sumOfElementsInArray(array) {
    let sum = 0;

    for (let i = 0; i < array.length; i++) {
        sum = sum + array[i];
        // sum += array[i];
    }

    return sum;
}

array1 = [1, 5, 3, 9, 2, 4.3];
console.log("The array is: " + array1);
console.log("The sum of the elements is: " + sumOfElementsInArray(array1)); // 9

array2 = [-1, -5.6, -3, -9, -2, 6, 0];
console.log("The array is: " + array2);
console.log("The sum of the elements is: " + sumOfElementsInArray(array2)); // 9