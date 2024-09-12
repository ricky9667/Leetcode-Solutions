class Solution1 {
    fun jump(nums: IntArray): Int {
        var steps = mutableListOf<Int>()
        steps.add(0)

        for (i in 1 until nums.size) {
            var minStepsToIndex = i

            for (j in 0 until steps.size) {
                // j + nums[j] = max reachable position for index `j`
                if (j + nums[j] >= i) {
                    minStepsToIndex = min(minStepsToIndex, steps[j] + 1)
                }
            }

            steps.add(minStepsToIndex)
        }

        return steps.last()
    }
}

class Solution2 {
    fun jump(nums: IntArray): Int {
        var currentJumpIndex = 0
        var targetJumpIndex = nums[0]
        var jumps = 0

        for (i in 0 until nums.size) {
            if (i > currentJumpIndex) {
                jumps++
                currentJumpIndex = targetJumpIndex
            }

            if (i + nums[i] > targetJumpIndex) {
                targetJumpIndex = i + nums[i]
            }
        }

        return jumps
    }
}