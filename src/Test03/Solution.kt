package Test03

/**
 * @author noorall
 * @date 2021/3/19 9:29 下午
 * @Description:
 */
class Solution {
    fun findRepeatNumber(nums: IntArray): Int {
        for (i in nums.indices) {
            if (i == nums[i] || nums[i] >= nums.size) {
                continue
            } else if (nums[i] == nums[nums[i]]) {
                return nums[i]
            } else {
                nums[nums[i]] = nums[i].apply { nums[i] = nums[nums[i]] }
            }
        }
        return -1
    }
}

fun main() {
    val nums: IntArray = intArrayOf(2, 3, 1, 0, 2, 5, 3)
    val solution: Solution = Solution()
    print(solution.findRepeatNumber(nums))
}
