word = [] 
for _ in range(10):
    word.append(input())

s = input()
cnt = 0 
for i in word:
    if i[-1] == s:
        print(i)
        cnt+=1

if cnt == 0:
    print("None")