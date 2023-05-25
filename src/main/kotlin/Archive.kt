class Archive(archiveName: String, val noteList: MutableList<Screen> = mutableListOf()) :
    Screen(archiveName, "") {
    override fun create() {
        println("Введите название заметки")
        val noteName = InputReader.readLine()
        if (!noteName.isNullOrBlank()) {
            while (true) {
                println("Введите информацию, которая должна находиться в заметке")
                val content = InputReader.readLine()
                if (!content.isNullOrBlank()) {
                    noteList.add(Screen(name = noteName, noteContent = content))
                    return
                } else
                    println(ErrorMessage.EMPTY_NOTE_CONTENT.value)
            }
        } else
            println(ErrorMessage.EMPTY_NOTE_NAME.value)
    }
}