n = int(input())

class Student:

    def __init__(self,name,height,weight):
        self.name = name
        self.height = height
        self.weight = weight
peo = []

for i in range(n):
    name,height,weight = map(str,input().split())
    height = int(height)
    weight = int(weight)

    peo.append(Student(name,height,weight))

peo.sort(key = lambda x: (x.height,-x.weight))

for i in range(n):
    print(peo[i].name,peo[i].height,peo[i].weight)