class TextBuilder: Builder() {
    private val buffer: StringBuffer = StringBuffer()
    override fun makeTitle(title: String) {
        buffer.append("========================================\n")
        buffer.append("『$title』\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("■$str\n")
        buffer.append("\n")
    }

    override fun makeItems(items: Array<String>) {
        for(i in 0 until items.size) {
            buffer.append(" ・" + items[i] + "\n")
        }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("========================================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}