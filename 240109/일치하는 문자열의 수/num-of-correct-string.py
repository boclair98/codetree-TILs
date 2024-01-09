a , b = map(str,input().split())
a = int(a)

cnt = 0 
for i in range(a):
    word = input()
    if word == b:
        cnt+=1
print(cnt)