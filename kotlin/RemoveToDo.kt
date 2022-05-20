// Initialize variables
var userRemove = 0
var removeAnother = ""

// Remove To-Do list item
fun removeToDo() {
    // Initialize variable for list number
    var count = 1

    println("-------------------------------------")
    println("\n--Remove To-Do item--\n")

    // Check if list has any To-Do items
    if (toDoListItems.isEmpty()) {
        println("You have no To-Do items")
        mainMenu()
    }

    // Loop through To-Do list and add a number to each list item
    for (i in toDoListItems) {
        println("$count. $i")
        count += 1
    }

    // Get user input on which To-Do item to REMOVE
    println("\nWhich item should be REMOVED?")
    println("Enter 0 to CANCEL and return to the Main Menu")
    print("-> ")
    userRemove = intReader.nextInt()

    // Check if user input is outside of list's length. If so, call removeToDo() function to reset
    if (userRemove < 0 || userRemove > toDoListItems.size) {
        println("\n-------------------------------------")
        println("Please select a valid option")
        removeToDo()
    }

    // Return to Main Menu if user enter 0
    if (userRemove == 0) {
        mainMenu()
    }

    // Remove list item at user-specified index
    if (userRemove != 0 && userRemove <= toDoListItems.size) {
        println("\n---------------------------------------------")
        println('"' + toDoListItems[userRemove-1] + '"' + " has been REMOVED")
        println("---------------------------------------------\n")
        toDoListItems.removeAt(userRemove-1)
    }

    // Get user input if they would like to REMOVE another item, if so, call removeToDo() function again
    println("REMOVE another item? (Y/N)")
    print("-> ")
    removeAnother = strReader.nextLine()
    if (removeAnother.lowercase() == "y") {
        removeToDo()
    } else {
        mainMenu()
    }

}