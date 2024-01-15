n = int(input())

class Student:

    def __init__(self,ki,he,num):
        self.ki = ki 
        self.he = he
        self.num = num

peo = []

for i in range(1,n+1):
    ki , he = map(int,input().split())
    peo.append(Student(ki,he,i))
peo.sort(key = lambda x: (-x.ki,-x.he,-x.num))
for i in range(n):
    print(peo[i].ki,peo[i].he,peo[i].num)