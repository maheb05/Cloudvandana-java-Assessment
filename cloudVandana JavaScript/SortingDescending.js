function sortArrayDescending(arr) {
    let n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

let inputArray = prompt("Enter numbers separated by commas:");

let inputNumbers = inputArray.split(',').map(Number);

let sortedArray = sortArrayDescending(inputNumbers);

console.log("Sorted Array in Descending Order:", sortedArray);
