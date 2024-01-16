n = int(input())

num =[0]*201

max_val = 2

cnt = 0 
for i in range(n):

    x,r = map(str,input().split())

    x = int(x)+100

    if r == 'R':

        for i in range(101,x+1):
            num[i]+=1
    
    elif r == 'L':
        
        for i in range(x-1,100,-1):
            num[i]+=1
    
    
for j in range(0,201):
    if num[j]>=max_val:
        cnt+=1

print(cnt)