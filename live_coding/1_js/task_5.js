// Write a function that finds the maximum or minimum number in an array

function maxNumberInArray(array) {
	let maxNumber = array[0];
	
	for (let i = 1; i < array.length; i++) {
		if (array[i] > maxNumber) {
			maxNumber = array[i]; 
		}
	}
	return maxNumber;
}

function minNumberInArray(array) {
	let minNumber = array[0];
	
	for (let i = 1; i < array.length; i++) {
		if (array[i] < minNumber) {
			minNumber = array[i]; 
		}
	}
	return minNumber;
}

array1 = [1, 5, 3, 9, 2, 4];
console.log("The array is: " + array1); 
console.log("The max element is: " + maxNumberInArray(array1)); // 9
console.log("The min element is: " + minNumberInArray(array1)); // 1



array2 = [-1, -5, -3, -9, -2, 6, 0];
console.log("The array is: " + array2);
console.log("The max element is: " + maxNumberInArray(array2)); // 6
console.log("The min element is: " + minNumberInArray(array2)); // -9
