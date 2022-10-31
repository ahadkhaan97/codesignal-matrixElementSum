fun main() {
    print(
        solution(
            mutableListOf(
                mutableListOf(0, 1, 1, 2),
                mutableListOf(0, 5, 0, 0),
                mutableListOf(2, 0, 3, 3),
            )
        )
    )
}

fun solution(matrix: MutableList<MutableList<Int>>): Int {
    var sum = 0
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            println("[$i][$j] == ${checkIfToAdd(i, j, matrix)}")
            sum += checkIfToAdd(i, j, matrix)
        }
    }
    return sum
}

fun checkIfToAdd(i: Int, j: Int, matrix: MutableList<MutableList<Int>>): Int {
    for (k in i downTo 0) {
        if (matrix[k][j] == 0) {
            return 0
        }
    }

    return matrix[i][j]
}
