/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package contextReceiversLib

// !LANGUAGE: +ContextReceivers
class LibraryClassTwo {

    interface Params
    interface Logger {
        fun info(message: String)
    }

    interface LoggingContext {
        val log: Logger // this context provides reference to logger
    }

    context(LoggingContext)
    fun test(withParams: Params) {
        log.info("Operation has started") //<!UNRESOLVED_REFERENCE!>
    }
}