song = """Some days, things just take way too much of my energy
I look up and the whole room's spinning
You take my cares away
I can so overcomplicate, people tell me to medicate
Feel my blood runnin', swear the sky's fallin'
How do I know if this shit's fabricated?
Time goes by and I can't control my mind
Don't know what else to try, but you tell me every time
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'"""

alphabet = dict()
# 한 문장씩 세고 싶다면 .splitlines()

for c in song:
    if c.isalpha() == False:
        continue # 알파벳이 아니라면 그다음으로 넘어감
    c = c.lower() # 알파벳이라면 소문자로 변환
    if c not in alphabet: # 사전에 문자가 없다면
        alphabet[c] = 1 # 알파벳을 추가하고, 1 값 넣기
    else:
        alphabet[c] += 1 # 알파벳이 있다면, 해당 알파벳에 +1

# key = list(alphabet.keys())
# key.sort()
# for c in key:
#     num = alphabet[c] # key의 값을 대입
#     print(c, "=>", num) # 순서대로 정렬된 키의 값의 밸류를 출력

for code in range(ord("a"), ord("z") + 1):
    c = chr(code)
    num = alphabet.get(c, 0)
    print(c, "=>", num)