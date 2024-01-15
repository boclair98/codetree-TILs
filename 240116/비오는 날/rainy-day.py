n = int(input())

class rain:

    def __init__(self,data,day,weather):
        self.data = data
        self.day = day 
        self.weather = weather
arr = []
for i in range(n):
    data,day,weather = map(str,input().split())
    if weather == "Rain":
        arr.append(rain(data,day,weather))

min_val = 0

for i in range(1,len(arr)):
    if arr[i].data < arr[min_val].data:
        min_val = i 
print(arr[min_val].data,end=" ")
print(arr[min_val].day,end=" ")
print(arr[min_val].weather)