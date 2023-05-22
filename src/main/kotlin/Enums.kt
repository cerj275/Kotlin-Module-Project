enum class MenuAction(val value: String) {

    CREATE("Создать"),
    EXIT("Выход")

}

enum class ErrorMessage(val value: String) {

    INVALID_OPTION("Такого номера пункта нет в списке, попробуйте еще раз."),
    EMPTY_ARCHIVE_NAME("Имя архива не должно быть пустым."),
    EMPTY_NOTE_NAME("Имя заметки не может быть пустой. Заметка не создана, попробуйте еще раз..."),
    EMPTY_NOTE_CONTENT("Заметка не может быть пустой.")

}