def flunk(s):
    return s < 60

score = [54, 72, 21, 89, 66]
for s in filter(flunk, score):
    print(s)
    
print(list(filter(flunk, score)))