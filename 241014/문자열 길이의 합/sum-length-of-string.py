n = int(input())
total = 0 
cnt = 0 

for i in range(n):
    s = input()
    total+=len(s)
    if s[0] == "a":
        cnt+=1
print(total,end=' ')
print(cnt)