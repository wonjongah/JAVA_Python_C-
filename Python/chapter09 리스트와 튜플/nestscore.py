score = [
    [88, 22, 33, 77],
    [43, 97, 55, 67],
    [11, 100, 25, 89]
]
# 이중 리스트 여러줄 입력 가능

total = 0
totalsub = 0
for student in score:
    sum = 0
    for subject in student:
        sum += subject
    subjects = len(student)
    print("총점 %d, 평균 %.2f" %(sum, sum/subjects))
    total += sum
    totalsub += subjects
print("전체 평균 %.2f" %(total/totalsub))