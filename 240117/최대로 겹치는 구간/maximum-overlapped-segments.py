n = int(input())

word = [0]*200
max_val = 0
for _ in range(n):
    a,b = map(int,input().split())
    a,b=a+100,b+100

    for i in range(a,b):
        word[i]+=1
    
    for j in range(0,200):
        if word[j] > max_val :
            max_val = word[j]
print(max_val)