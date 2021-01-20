nums = list(range(10))
nums2 = nums[:]
print(nums)
print(nums2)
print("수정 후")
nums[0] = 100
print(nums)
print(nums2)