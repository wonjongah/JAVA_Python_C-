nums = list(range(10))
nums2 = nums
print(nums2)
# 값이 nums2에 복사된 것 같지만
nums[0] = 100
print(nums)
print(nums2)
