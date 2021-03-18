def is_same(string1, string2):
    s1 = list(string1)
    s2 = list(string2)

    if sorted(s1) == sorted(s2):
        return True
    else:
        return False

def readNum(n):
    units = ["", "십", "백", "만", "십만"]
    nums = "일이삼사오육칠팔구십"
    result = []
    i = 0
    while n > 0:
        n, r = divmod(n, 10)
        if r > 0:
            result.append(nums[r - 1] + units[i])
        i += 1
    return ''.join(result[::-1])