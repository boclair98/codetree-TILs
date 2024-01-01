n , m = map(int,input().split())
total = 1 
for i in range(n):
    for j in range(m):
        print(total,end=" ")
        total+=1
    print()