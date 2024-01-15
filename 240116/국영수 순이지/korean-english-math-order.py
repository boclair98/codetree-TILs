n = int(input())

class exam:

    def __init__(self,name,korean,math,eng):
        self.name = name
        self.korean = korean 
        self.math = math
        self.eng = eng

student = [] 

for _ in range(n):
    name, korean, math, eng = map(str,input().split())
    korean = int(korean)
    math = int(math)
    eng = int(eng)
    student.append(exam(name,korean,math,eng))

student.sort(key = lambda x: (-x.korean,-x.math,-x.eng))

for i in range(n):
    print(student[i].name,student[i].korean,student[i].math,student[i].eng)