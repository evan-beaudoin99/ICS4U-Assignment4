function printHourglass(size: number) {
    // Base case
    if (size === 1) {
        console.log(`*`)
        console.log(`*`)
        return;
    }

    console.log('*'.repeat(size))

    printHourglass(size - 1)

    console.log('*'.repeat(size))
}

// Read input from the user
const userInput = parseInt(prompt("Enter an integer:") || "0", 10)

if (!isNaN(userInput)) {
    printHourglass(userInput)
} else {
    console.log("Error: Please enter a valid integer.")
}

