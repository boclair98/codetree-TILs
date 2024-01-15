n = int(input())

class human:

    def __init__(self,name, number,city):
        self.name = name
        self.number = number 
        self.city = city

arr = [] 

for _ in range(n):
    name,number,city = map(str,input().split())
    
    arr.append(human(name,number,city))

max_val = 0 

for i in range(1,n):
    if arr[max_val].name < arr[i].name:
        max_val = i
print("name",arr[max_val].name)
print("addr",arr[max_val].number)
print("city",arr[max_val].city)