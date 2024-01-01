n = int(input())
arr = list(map(int,input().split()))
predice = n 
while True:

    max_idx = 0

    for i in range(1,predice):
        if arr[i] > arr[max_idx]:
            max_idx = i 
    print(max_idx+1,end=" ")

    if max_idx == 0:
        break

    predice = max_idx