n = int(input())

class student:

    def __init__(self,name,kor,math,eng):
        self.name = name
        self.kor = kor 
        self.math = math
        self.eng = eng

peo = [] 
for _ in range(n):
    name, kor, math, eng = map(str,input().split())
    kor = int(kor)
    math = int(math)
    eng = int(eng)

    peo.append(student(name,kor,math,eng))
peo.sort(key = lambda x: (x.kor+x.math+x.eng))

for i in range(n):
    print(peo[i].name,peo[i].kor,peo[i].math,peo[i].eng)