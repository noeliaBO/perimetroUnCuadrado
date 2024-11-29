import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    var l = sc.nextInt()
    var c = sc.next()
    while ()
    for (i in 1..l) {
        if (i == 1 || i == l) {
            for (j in 1..l) {
                print(c + " ")
            }
        } else {
            for (j in 1..l) {
                if (j == 1 || j == l) {
                    print(c + " ")
                } else {
                    print("  ")
                }

            }
        }

        println()
    }
    println("--------------------------------")
}