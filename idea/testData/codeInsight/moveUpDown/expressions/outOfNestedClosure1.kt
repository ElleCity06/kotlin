// MOVE: up
fun foo() {
    val x = run(1, 2) {
        <caret>println("foo")
        println("bar")
    }
}