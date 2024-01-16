class Student:

    def __init__(self,name,height,weight):
        self.name = name
        self.height = height
        self.weight = weight

tal = [] 
for i in range(5):
    name,height,weight = map(str,input().split())
    height = int(height)
    weight = float (weight)

    tal.append(Student(name,height,weight))

tal.sort(key = lambda x:(x.name))

print("name")

for i in range(5):
    print(tal[i].name,tal[i].height,tal[i].weight)

tal.sort(key = lambda x:-x.height)
print()
print("height")
for i in range(5):
    print(tal[i].name,tal[i].height,tal[i].weight)