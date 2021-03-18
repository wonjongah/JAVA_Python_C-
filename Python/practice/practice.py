a = "string"
b = 10
c = 1.52324
d = [1, 2, 3, 4, 5, 6, 7]
e = {1, 2, 3, 4, 5, 6, 7}
f = (1, 2, 3, 4, 5, 6, 7)
g = {"book":"책", "boy":"소년"}
print(type(a))
print(type(b))

print(int('0b1010', 2))
print(format(10, "#b"))
print(format(10, "#o"))
print(format(10, "b"))
print(r"c:\\temp.....text")
print(ord("a"))
print(chr(97))
print(2**3)
print(10 // 5)
print(10 % 8)
print(round(c, 2))
print(round(1231242, -3))
def sumex(*arg):
    sum = 0
    for i in arg:
        sum += i

def calcstep(**arg):
    print(arg["haha"])

print(len(a))
print(f[1:4])
print(d[::-1])
print(a.find("s"))
print(a.rfind("g"))
print(a.count("r"))
if "s" in a:
    print("있다")
if "a" not in a:
    print("없다")
print(a.startswith("s"))
print(a.endswith("f"))
s = "s t r i n g\nhahahaha\nhahahaha"
print(s.split())
print(s.splitlines())
test = "haha hoho hihi"
print("^".join(a))
print(s.replace("\n", "*"))
print(a.center(30))
print(a.ljust(30, "0"))
print(a.rjust(30, "z"))
print(f"이름:{a}, 키:{c:.2f}")
print(list("korea"))
d[2:5] = [23, 40, 63]
print(d)
d[0:0] = [100]
print(d)
del d[3]
h = [111, 2222, 333]
print(d + h)
print(h * 3)
print("yes" if b == 10 else "no")
list1 = [n * n for n in range(1, 11) if n % 3 == 0]
print(list1)
list1.append("삽입함")
list1.insert(0, "insert")
print(list1)
list1.extend(d)
print(list1)
list1.remove("삽입함")
print(list1)
del list1[1]
print(list1)
list1.clear()
print(list1)
list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 100]
v = list1.pop(9)
print(v)
print(list1)
ha = "test"
print(ha.replace("t", "f"))
print(list1.index(3))
print(list1.count(2))
print(len(list1))
print(max(list1))
print(min(list1))
print(sum(list1))

a = 10
if a in range(1, 12):
    print("yes!")

u = [1, 2,2, 2, 2, 3, 5, 67, 7, "", "1", "", "4"]
print(list(set(u)))
print([x for x in u if x])
print(list(filter(None, u)))
m, n = divmod(10, 3)
print(f"몫:{m}, 나머지:{n}")
print(g.get("book"))
print(g.get("man", "없어"))

for i in enumerate(u, 10):
    print(i)

y = ["하하", "힝", "유"]
z = ["haha", "hing", "u"]
print(list(zip(y, z)))
