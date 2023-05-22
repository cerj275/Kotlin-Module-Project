fun main() {

    val menu = Menu("Main Menu")
    menu.startMenu()
}

class Menu(name: String, private val archives: MutableList<Archive> = mutableListOf()) :
    Note(name, "") {

    fun startMenu() {
        start("архивов", archives)
    }

    override fun create() {
        println("Введите имя нового архива")
        val name = InputReader.readLine()
        if (!name.isEmptyOrBlank())
            archives.add(Archive(name))
        else
            println(ErrorMessage.EMPTY_ARCHIVE_NAME.value)
    }
}
