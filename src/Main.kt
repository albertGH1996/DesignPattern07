fun main() {
    val args: Array<String> = arrayOf("plain")

    if(args.size != 1) {
        usage()
        System.exit(0)
    }
    when {
        args[0] == "plain" -> {
            val textBuilder = TextBuilder()
            val director = Director(textBuilder)
            director.construct()
            val result: String = textBuilder.getResult()
            System.out.println(result)
        }
        args[0] == "html" -> {
            val htmlBuilder = HTMLBuilder()
            val director = Director(htmlBuilder)
            director.construct()
            val filename: String = htmlBuilder.getResult()
            System.out.println(filename + "が作成されました")
        }
        else -> {
            usage()
            System.exit(0)
        }
    }

}
fun usage() {
    System.out.println("Usage: kotlin Main plain    プレーンテキストで文書作成")
    System.out.println("Usage: kotlin Main html    HTMLファイルで文書作成")
}