arr = [] 
for _ in range(2):
    arr.append(list(map(int,input().split())))
total = 0 
for i in range(2):
    sum_val = 0 
    for j in range(4):
        sum_val +=arr[i][j]
    total +=sum_val/4
    print(sum_val/4,end=" ")
print()

for i in range(4):
    sum_val2 = 0 
    for j in range(2):
        sum_val2+=arr[j][i]
    total +=sum_val2/2
    print(sum_val2/2,end=" ")
print()

print(total/6)