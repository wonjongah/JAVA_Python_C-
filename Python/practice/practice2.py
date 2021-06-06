li = [1, 1, 2, 3, 4, 5, 6, 7, 7, 7]
new_li = []
for i in li:
    if i not in new_li:
        new_li.append(i)
print(new_li)

li = [1, 1, 2, 3, 4, 5, 6, 7, 7, 7]

print(list(set(li)))

li1 = ["", "", "djsjfds",213, 142, 12, 2]
print(li1)
new_li1 = [x for x in li1 if x]
new_li1 = [x for x in li1 if x]
new_li1 = list(filter(None, li1))
new_li1 = list(filter(None, li1))
print(True if len(li1) > 3 else False)
print(new_li1)

import itertools


합집합 |
교집합 &
차집합 -
배타적 차집합 ^

permutations 자기자신 x 순서 o
product 자기자신 0, 순서0
combinations 자기자신 x 순서x
combinations_with_replacement 자기자신0 순서 x

def sum_list(data):
    if len(data) <= 1:
        return data[0]
    return data[0] + sum_list(data[1:])

permutations 순열 자기 x 순서 0
product 자기 o  순서 0
combinations 자기 x 순서 x 중복
combinations_with_replacement 자기 o 순서 x 중복


def function(data):
    if data == 1:
        return data
    print(data)
    if data % 2 == 1:
        data = (3 * data) + 1
        return function(data)
    else:
        data = int(data / 2)
        return function(data)

imp = [(i, index) for index, i in enumerate(imp)]
max(inp, key=lambda x: x[0])[0]
imp = [(i, index) fro index, i in enumerate(imp)]

a, b = 0, 1
while n > 0:
    a, b = b, a + b
    n-= 1

list1 = [n * n for n in range(1, 11) if n % 3 == 0]



def dfs(v):
    print(v, end = " ")
    visited[v] = True
    for e in adj[v]:
        if not visited[e]:
            dfs(e)

def bsf(v):
    q = deque([v])
    while q:
        v = q.popleft()
        if not visited[v]:
            visitd[v] = True
            print(v, end = " ")
            for e in adj[v]:
                if not visited[e]:
                    q.append(e)

def bsf(v):
    q = deque([v])
    while q:
        v = q.popleft()
        if not visited[v]:
            visited[v] = True
            print(v, end = " ")
            for e in adj[v]:
                if not visited[e]:
                    q.append(e)


n, m, v = map(int, input().split())
adj = [[] for in _ range(n + 1)]

for _ in range(m):
    x, y = map(int, input().split())
    adj[x].append(y)
    adj[y].append(x)

for e in adj:
    e.sort()

visited = [False] * (n + 1)
dfs()
visited = [False] * (n + 1)

def readNumber(n):
    units = ["", "십", "백", "천"]
    nums = '일이삼사오육칠팔구'
    result = []
    i = 0
    while n > 0:
        n, r = divmod(n, 10)
        if r > 0:
            result.append(nums[r-1] + units[i])
        i += 1
    return ''.join(result[::-1])