class Solution:
    def sorted_binary_array(self, nums: list[int]):

        self.nums = nums

        (left, right) = (0, len(self.nums)-1)

        while left <= right:

            mid = (left + right) // 2

            if self.nums[mid] == 1:

                if self.nums[mid - 1] == 0:
                    return len(self.nums[mid:])
                
                elif self.nums[mid - 1] == 1:
                    left = mid - 1
            else:
                left = mid + 1
        return -1


if __name__ == '__main__':

    nums = [0, 0, 1, 1, 1]
    sol = Solution()
    print(sol.sorted_binary_array(nums=nums))


