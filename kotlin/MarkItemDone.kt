// Initialize variables
var userMarkDone = 0
var markAnother = ""

// Mark To-Do item as DONE
fun markItemDone() {
    // Initialize variable for list number
    var count = 1

    println("-------------------------------------")
    println("\n--Mark Item as DONE--\n")

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

    // Get user input on which To-Do item to mark DONE
    println("\nWhich item should be marked --DONE--?")
    println("Enter 0 to CANCEL and return to the Main Menu")
    print("-> ")
    userMarkDone = intReader.nextInt()

    // Check if user input is outside of list length
    if (userMarkDone < 0 || userMarkDone > toDoListItems.size) {
        println("\n-------------------------------------")
        println("Please select a valid option")
        markItemDone()
    }

    // Return to Main Menu if user enters 0
    if (userMarkDone == 0) {
        mainMenu()
    }

    // Check if list item has already been marked DONE
    if (toDoListItems[userMarkDone-1].contains("--DONE--")) {
        println("\n---------------------------------------------")
        println("That item has already been marked --DONE--")
        println("---------------------------------------------\n")
    }

    // If list item HAS NOT been marked done...
    if (!toDoListItems[userMarkDone-1].contains("--DONE--")) {
        // ... then inform user that item has now been marked DONE
        if (userMarkDone != 0) {
            println("\n---------------------------------------------")
            println('"' + toDoListItems[userMarkDone-1] + '"' + " marked as --DONE--")
            println("---------------------------------------------\n")
            toDoListItems[userMarkDone-1] += "  --DONE--"
        }
    }

    // Get user input if they would like to mark another item as DONE, if so, call markItemDone() function again
    println("Mark another item as --DONE--? (Y/N)")
    print("-> ")
    markAnother = strReader.nextLine()
    if (markAnother.lowercase() == "y") {
        markItemDone()
    } else {
        mainMenu()
    }
}