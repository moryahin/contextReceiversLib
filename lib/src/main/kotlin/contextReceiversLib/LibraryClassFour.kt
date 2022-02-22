package contextReceiversLib

class LibraryClassFour {
    interface ncA
    interface ncB
    interface C
    interface D

    context(ncA, ncB)
    fun f(): Unit = TODO()

    context(C, D)
    fun f(): Unit = TODO()

    fun test(a: ncA, b: ncB) {
        with(a) {
            with(b) {
                f()
            }
        }
    }
}