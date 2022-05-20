// Initialize variables
var listOption = 0
var toDoListItems = mutableListOf<String>()
var listName = ""
var deleteList = ""

// New To-Do item
fun newToDo() {
    // Check if user already has a list. If so, ask if they want to delete list and create a new one
    if (listName != "") {
        println("\nDo you want to delete your current list and create a new one? (Y/N)")
        print("-> ")
        deleteList = strReader.nextLine()
        if (deleteList.lowercase() == "y") {
            // Reset To-Do items list to empty
            toDoListItems = mutableListOf()
        } else {
            mainMenu()
        }
    }

    // Get user input for list name
    println("-------------------------------------")
    println("\n--Create To-Do list--\n\nPlease enter your To-Do list name:")
    print("-> ")
    listName = strReader.nextLine()

    while (listOption != 5) {

        // Present user with main menu
        println("-------------------------------------")
        println("\n--To-Do list Options--\n1. Add new To-Do item\n2. View my To-Do items\n3. Mark To-Do item as --DONE--\n4. Remove To-Do item\n5. Exit to Main Menu")

        // Ask for user input
        println("\nPlease select a Menu Option")
        print("-> ")
        listOption = intReader.nextInt()

        // WHEN statements to provide functions for user input
        when (listOption) {
            1 -> addToDoItem()
            2 -> viewToDo()
            3 -> markItemDone()
            4 -> removeToDo()
            5 -> break
            else -> println("\n============================\nPlease enter a valid option\n============================")
        }
    }
}