// Create a User
fun user() {

    // Get user input to create Username and Password
    println("\nWelcome to the To-Do List app!\n\nPlease create a USERNAME")
    print("-> ")
    val name = strReader.nextLine()
    println("Please create a PASSWORD")
    print("-> ")
    val pass = strReader.nextLine()

    // Create User object, pass in user input of Username and Password
    val user = User(name, pass)

    // Use the User class method -login()-
    user.login()
}
// Create User class with 2 parameters in the constructor
class User(private var userName: String, private var password: String) {

    // Initialize class to output text upon creating a User object
    init {
        println("\n=============\nUser Created\n=============")
        println("\nThank you for creating an account with us $userName!")
        println("---------------------------------------------------------------------")
    }

    // Class method to ask the user to input their login information.
    fun login() {
        println("\nPlease login with your credentials to access to the Main Menu")
        println("\nUsername:")
        print("-> ")
        val loginName = strReader.nextLine()
        println("Password:")
        print("-> ")
        val loginPassword = strReader.nextLine()

        // Check if Username and Password match the user's initial username and password. If not, call login() for user to try again
        if (loginName == userName && loginPassword == password) {
            startApp()
        } else {
            println("\nLogin Failed. Please try again\n---------------------------------------------------------------------")
            login()
        }
    }

    // Class method to run main app when login is successful
    private fun startApp() {
        println("\n==================\nLogin Successful!\n==================\n")
        mainMenu()
    }

}