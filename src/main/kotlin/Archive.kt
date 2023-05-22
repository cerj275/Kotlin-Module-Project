class Archive(archiveName: String, val noteList: MutableList<Note> = mutableListOf()) :
    Note(archiveName, "") {

    override fun create() {
        println("Введите название заметки")
        val noteName = InputReader.readLine()
        if (!noteName.isEmptyOrBlank()) {
            while (true) {
                println("Введите информацию, которая должна находиться в заметке")
                val content = InputReader.readLine()
                if (!content.isEmptyOrBlank()) {
                    noteList.add(Note(name = noteName, noteContent = content))
                    return
                } else
                    println(ErrorMessage.EMPTY_NOTE_CONTENT.value)
            }

        } else
            println(ErrorMessage.EMPTY_NOTE_NAME.value)
    }
}