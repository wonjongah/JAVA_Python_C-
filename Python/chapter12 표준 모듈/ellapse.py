import time

start = time.time()
for a in range(1000):
    print(a)
end = time.time()
print(end - start)