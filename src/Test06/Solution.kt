package Test06

/**
 * @author noorall
 * @date 2021/3/20 3:06 下午
 * @Description:
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reversePrint(head: ListNode?): IntArray {
        val array = arrayListOf<Int>()
        var current = head
        while (current != null) {
            array.add(current.`val`)
            current = current.next
        }
        val result = IntArray(array.size)
        var j = 0
        for (i in array.lastIndex downTo 0) {
            result[j]=array[i]
            j++
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    val head = ListNode(1)
    head.next = ListNode(3)
    head.next!!.next = ListNode(2)
    print(solution.reversePrint(head))
}