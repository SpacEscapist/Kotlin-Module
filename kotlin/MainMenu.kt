// Import Scanner object from library
import java.util.Scanner
// Import Exit Process for program
import kotlin.system.exitProcess

// Create an Integer and String scanner instance for user input
val intReader = Scanner(System.`in`)
val strReader = Scanner(System.`in`)
var userInput = 0

// Main Menu
fun mainMenu() {

    while (userInput != 6) {
        // Present user with main menu
        println("-------------------------------------")
        println("\n--Main Menu--\n\n1. Create new To-Do list\n2. Add new To-Do item\n3. View my To-Do items\n4. Mark To-Do item as --DONE--\n5. Remove To-Do item\n6. QUIT Program")

        // Ask for user input
        println("\nPlease select a Menu Option")
        print("-> ")
        userInput = intReader.nextInt()

        // WHEN statements to provide functions for user input
        when (userInput) {
            1 -> newToDo()
            2 -> addToDoItem()
            3 -> viewToDo()
            4 -> markItemDone()
            5 -> removeToDo()
            6 -> println("\nQuitting Application...")
            else -> println("\n============================\nPlease enter a valid option\n============================")
        }
        // Break loop and exit process if user selects "QUIT Program"
        if (userInput == 6) {
            exitProcess(0)
        }
    }
}