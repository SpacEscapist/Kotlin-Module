// Initialize variables
var addItem = ""
var anotherItem = ""

// Add To-Do item
fun addToDoItem() {
    // Check if list has been created
    if (listName == "") {
        println("\n-------------------------------------")
        println("No list has been created")
        mainMenu()
    }

    // If list is created, ask for To-Do item to add
    println("-------------------------------------")
    println("\n--Add New To-Do Item--\n\nPlease enter name of new To-Do item:")
    println("Enter 0 to CANCEL and return to the Main Menu")
    print("-> ")
    addItem = strReader.nextLine()

    if (addItem != "0") {
        toDoListItems.add(addItem)
    } else {
        mainMenu()
    }

    // Get user input if they would like to add another To-Do item, if so, call addToDoItem() function again
    println("\nAdd another item? (Y/N)")
    print("-> ")
    anotherItem = strReader.nextLine()
    if (anotherItem.lowercase() == "y") {
        addToDoItem()
    } else {
        return
    }
}