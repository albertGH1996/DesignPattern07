class TextBuilder: Builder() {
    private val buffer: StringBuffer = StringBuffer()
    override fun buildTitle(title: String) {
        buffer.append("========================================\n")
        buffer.append("『$title』\n")
        buffer.append("\n")
    }

    override fun buildString(str: String) {
        buffer.append("■$str\n")
        buffer.append("\n")
    }

    override fun buildItems(items: Array<String>) {
        for(i in 0 until items.size) {
            buffer.append(" ・" + items[i] + "\n")
        }
        buffer.append("\n")
    }

    override fun buildClose() {
        buffer.append("========================================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}