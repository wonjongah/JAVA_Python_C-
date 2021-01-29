import calendar

yoil = ["월", "화", "수", "목", "금", "토", "일"]
day = calendar.weekday(2021,1,29)
print(f"2021년 1월 29일은 {yoil[day]}요일입니다.")