class BinaryTreeSolutions:

    def last_ocurrence(self, nums, target):
        self.nums = nums
        self.target = target

        (left, right) = (0, len(nums) - 1)

        while left <= right:

            mid = (left+right) // 2

            if nums[mid] < target:
                left = mid + 1
            elif nums[mid] > target:
                right = mid - 1
            elif nums[mid] == target:
                if nums[mid] < nums[mid+1]:
                    return mid
                else:
                    left = mid + 1
        
        return -1




if __name__ == '__main__':

    nums = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
    target = 5

    trial = BinaryTreeSolutions()
    last_ocurrence = trial.last_ocurrence(nums, target)
    print(last_ocurrence)




