// Initialize variables
var returnMainMenu = ""

// View To-Do list
fun viewToDo() {
    // Initialize variable to place number in front of list item
    var count = 1
    println("\n-------------------------------------")
    println("View To-Do list:\n\n--$listName--")

    // Check if To-Do list is empty
    if (toDoListItems.isEmpty()) {
        println("You have no To-Do items")
    }

    // Loop through each list item. Add a number in front of each item and display item
    for (i in toDoListItems) {
        println("$count. $i")
        count += 1
    }

    // Return user to Main Menu after viewing To-Do list
    println("\n-------------------------------------\nPress ENTER key to return to Main Menu")
    returnMainMenu = strReader.nextLine()
}