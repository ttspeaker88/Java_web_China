// Write a function that decide about a given number is even or odd

function isNumberEvenOrOdd(number) {
	if (number % 2 === 0) {
		return number + " is even";
	} else {
		return number  + " is odd"; 
	}
}

console.log(isNumberEvenOrOdd(4)); // even
console.log(isNumberEvenOrOdd(7)); // odd