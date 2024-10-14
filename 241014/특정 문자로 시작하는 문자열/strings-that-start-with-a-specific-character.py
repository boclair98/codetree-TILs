n = int(input())
word = [] 
for i in range(n):
    word.append(input())
total = 0
cnt = 0
s = input()
for i in word:
    if i[0] == s:
        total+=1
        cnt+=len(i)
print(total,end=' ')
print(f"{cnt/total:.2f}")