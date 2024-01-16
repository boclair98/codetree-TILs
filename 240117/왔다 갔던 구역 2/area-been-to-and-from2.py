n = int(input())

num =[0]*200

max_val = 0 

for i in range(n):

    x,r = map(str,input().split())

    x = int(x)+100

    if r == 'R':

        for i in range(100,x):
            num[i]+=1
    
    elif r == 'L':
        
        for i in range(x,99,-1):
            num[i]+=1
    
    for j in range(0,200):
        if num[j]>max_val:
            max_val = num[j]
            
print(max_val)