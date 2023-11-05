function reverseWords(sentence) {
    let reversedSentence = '';
    let currentWord = '';

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ') {
            reversedSentence += reverseString(currentWord) + ' ';
            currentWord = '';
        } else {
            currentWord += sentence[i];
        }
    }

   
    reversedSentence += reverseString(currentWord);

    return reversedSentence;
}

function reverseString(str) {
    let reversed = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }
    return reversed;
}

let inputSentence = prompt("Enter a sentence:");

let reversedResult = reverseWords(inputSentence);
console.log(reversedResult);
