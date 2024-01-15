class exam:

    def __init__(self, grade, num):
        self.grade = grade
        self.num = num
student = []
for _ in range(5):
    grade,num = tuple(input().split())
    student.append(exam(grade,int(num)))

min_val = 0 

for i in range(1,5):
    if student[min_val].num > student[i].num:
        min_val = i

print(student[min_val].grade,student[min_val].num)