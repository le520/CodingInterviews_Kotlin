package Test04

/**
 * @author noorall
 * @date 2021/3/19 9:59 下午
 * @Description:
 */
class Solution {
    fun findNumberIn2DArray(matrix: Array<IntArray>, target: Int): Boolean {
        var i = matrix.size - 1
        var j = 0
        while (i >= 0 && j < matrix[0].size) {
            if (target > matrix[i][j]) {
                j++
            } else if (target < matrix[i][j]) {
                i--;
            } else {
                return true
            }
        }
        return false
    }
}