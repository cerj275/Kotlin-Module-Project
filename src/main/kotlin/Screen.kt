open class Screen(
    private val name: String,
    private val noteContent: String
) {
    open fun create() {}
    private fun showContent(type: String, archives: List<Screen>) {
        println("\nСписок $type:")
        println("0. ${MenuAction.CREATE.value}")
        archives.forEachIndexed { index, note -> println("${index + 1}. ${note.name}") }
        println("${archives.count() + 1}. ${MenuAction.EXIT.value}")
    }

    fun start(type: String, archiveList: List<Screen>) {
        var selectNumber: String
        do {
            showContent(type, archiveList)
            selectNumber = InputReader.readLine()
            when (selectNumber.toIntOrNull()) {
                0 -> create()
                in 1..archiveList.size -> showNoteContent(archiveList[selectNumber.toInt() - 1])
                archiveList.size + 1 -> return
                else -> println(ErrorMessage.INVALID_OPTION.value)
            }
        } while (true)
    }

    private fun showNoteContent(element: Screen) {
        when (element) {
            is Archive -> element.start("заметок", element.noteList)
            else -> println("\n ${element.noteContent}")
        }
    }
}