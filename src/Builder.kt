abstract class Builder {
    private var initialized: Boolean = false

    // このメソッドがDirectorで最初に1回呼び出されることを保証する
    fun makeTitle(title: String) {
        if(!initialized) {
            buildTitle(title)
            initialized = true
        }
    }
    fun makeString(str: String) {
        if(initialized) {
            buildString(str)
        }
    }
    fun makeItems(items: Array<String>) {
        if(initialized) {
            buildItems(items)
        }
    }
    fun close() {
        if(initialized) {
            buildClose()
        }
    }

    protected abstract fun buildTitle(title: String)
    protected abstract fun buildString(str: String)
    protected abstract fun buildItems(items: Array<String>)
    protected abstract fun buildClose()
}